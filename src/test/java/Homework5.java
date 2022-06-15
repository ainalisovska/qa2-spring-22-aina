import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Homework5 {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]");
    private final By MENU = By.xpath(".//div[@class = 'submenu-lvl1 submenu-lvl1--invisible submenu-lvl1--index']");
    private final String MENU_ITEM_TO_OPEN = "Sadzīves tehnika";
    private final By MENU_SUB_CATEGORY = By.xpath(".//a[contains(@href, 'https://www.1a.lv/c/sadzives-tehnika/')]");
    private final By CATEGORY_NAME = By.xpath(".//a[@class = 'list-filterable__label']");
    private final By CATALOG_ITEM = By.xpath(".//div[contains(@class, 'catalog-taxons-product--grid-view')]");
    private final By CATALOG_ITEM_NAME = By.xpath(".//a[@class = 'catalog-taxons-product__name']");
    private final By CATALOG_ITEM_PRICE = By.xpath(".//span[@class = 'price']");

    @Test
    public void searchItemTest() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();

        List <WebElement> menuItems = browser.findElement(MENU).findElements(MENU_ITEM);

        for (WebElement we : menuItems) {
            if (we.getText().equals(MENU_ITEM_TO_OPEN)) {
                we.click();
                break;
            }
        }

        List<WebElement> catalogueSubCategories = browser.findElements(MENU_SUB_CATEGORY);

        for (WebElement we : catalogueSubCategories) {
            if (we.getText().equals("Mājai - mazā sadzīves tehnika")) {
                we.click();
                break;
            }
        }

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(CATEGORY_NAME, 1));
        List<WebElement> subCategoryItems = browser.findElements(CATEGORY_NAME);


        for (WebElement we : subCategoryItems) {
            if (we.getText().equals("Gludekļi")) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
                we.click();
                break;
            }
        }

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(CATALOG_ITEM, 1));
        List<WebElement> catalogItems = browser.findElements(CATALOG_ITEM);

        try {
            catalogItems.get(10).click();
        } catch (ElementClickInterceptedException e) {
            catalogItems.get(10).click();
        }
        catalogItems.get(10).findElement(CATALOG_ITEM_NAME).click();

        WebElement itemPrice = browser.findElement(CATALOG_ITEM_PRICE);
        System.out.println("Product price is " + itemPrice.getText());
    }
}
