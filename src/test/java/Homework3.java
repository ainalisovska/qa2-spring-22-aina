import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework3 {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By NAME_INPUT_FIELD = By.id("name");
    private final By SURNAME_INPUT_FIELD = By.id("surname");
    private final By DISCOUNT_INPUT_FIELD = By.id("discount");
    private final By ADULTS_INPUT_FIELD = By.id("adults");
    private final By CHILDREN_INPUT_FIELD = By.id("children");
    private final By LUGGAGE_INPUT_FIELD = By.id("bugs");
    private final By SELECT_FLIGHT_FIELD = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@style = 'cursor: pointer;']");



    @Test
    public void bookingSystem() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchNameField = browser.findElement(NAME_INPUT_FIELD);
        searchNameField.sendKeys("Aina");
        WebElement searchSurnameField = browser.findElement(SURNAME_INPUT_FIELD);
        searchSurnameField.sendKeys("Lisovska");
        WebElement searchDiscountField = browser.findElement(DISCOUNT_INPUT_FIELD);
        searchDiscountField.sendKeys("242424");
        WebElement searchAdultsField = browser.findElement(ADULTS_INPUT_FIELD);
        searchAdultsField.sendKeys("1");
        WebElement searchChildrenField = browser.findElement(CHILDREN_INPUT_FIELD);
        searchChildrenField.sendKeys("2");
        WebElement searchLuggageField = browser.findElement(LUGGAGE_INPUT_FIELD);
        searchLuggageField.sendKeys("4");

        Select selectFlight = new Select(browser.findElement(SELECT_FLIGHT_FIELD));
        selectFlight.selectByValue("16");

        browser.findElement(GET_PRICE_BTN).click();














    }
}
