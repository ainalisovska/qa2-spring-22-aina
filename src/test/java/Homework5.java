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
    private final By PRODUCT_CATEGORY = By.className("submenu-lvl1__link");
    private final By PRODUCT_SUB_CATEGORY = By.xpath(".//a[contains(@href, 'https://www.1a.lv/c/sadzives-tehnika/')]");
    private final By CATEGORY_NAME = By.xpath(".//a[@class = 'list-filterable__label']");
    private final By PRODUCT_ITEM = By.xpath(".//a[@class = 'catalog-taxons-product__name']");
    private final By ITEM_PRICE = By.xpath(".//span[@class = 'detailed-cart-item__price']");



    @Test
    public void searchProductTest() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> catalogueCategories = browser.findElements(PRODUCT_CATEGORY);

        for (WebElement we : catalogueCategories) {
            if (we.getText().equals("Sadzīves tehnika")) {
                we.click();
                break;
            }
        }

        List<WebElement> catalogueSubCategories = browser.findElements(PRODUCT_SUB_CATEGORY);

        for (WebElement we : catalogueSubCategories) {
            if (we.getText().equals("Mājai - mazā sadzīves tehnika")) {
                we.click();
                break;
            }
        }

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(CATEGORY_NAME, 1));
        List<WebElement> subCategoryItems = browser.findElements(CATEGORY_NAME);

        boolean flag = false;
        for (WebElement we : subCategoryItems) {
            if (we.getText().equals("Gludekļi")) {
                flag = true;
                wait.until(ExpectedConditions.elementToBeClickable(we));
                we.click();
                break;
            }
        }
        Assertions.assertTrue(flag, "Category not found");


        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(PRODUCT_ITEM, 1));
        List<WebElement> items = browser.findElements(PRODUCT_ITEM);

        for (WebElement we : items) {
            if (we.getText().equals("Gludeklis Electrolux E8SI1-6DBM, zila")) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
                try {
                    we.click();
                } catch (ElementClickInterceptedException e) {
                    System.out.println("Can't click from the first try");
                    we.click();
                }
                break;
            }
        }

//        WebElement itemPrice = browser.findElement(ITEM_PRICE);
//        System.out.println(itemPrice.getText());











    }

}
