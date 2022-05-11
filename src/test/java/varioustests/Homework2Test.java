package varioustests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2Test {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By FAVORITE_ITEM = By.className("favorite-items__handle");
    private final By LOGO = By.className("main-logo");
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By SEARCH_BUTTON = By.xpath(".//button[@type = 'submit']");
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By RU_BTN = By.xpath(".//a[@hreflang = 'ru']");
    private final By LV_BTN = By.xpath(".//a[@hreflang = 'lv']");
    private final By ORDER_INFO = By.xpath(".//a[@href = '/order_search']");
    private final By BANNER = By.xpath(".//img[@class = 'welcome-carousel-slider__image']");




    @Test
    public void locatorsTest(){
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        browser.findElement(FAVORITE_ITEM).click();
        browser.findElement(LOGO).click();
        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("frozen");
        browser.findElement(SEARCH_BUTTON).click();
        browser.findElement(ACCEPT_COOKIES_BTN).click();
        browser.findElement(RU_BTN).click();
        browser.findElement(LV_BTN).click();
        browser.findElement(ORDER_INFO).click();
        browser.findElement(LOGO).click();












    }
}
