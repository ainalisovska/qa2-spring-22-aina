package pageObject.pages;

import io.netty.buffer.ByteBufInputStream;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
//        if (url.startsWith("http://") || url.startsWith("https://")) {
//
//        } else {
//            url = "http://" + url;
//        }

        // !true -> false   !false -> true  ! = "не"
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));

        try {
            we.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("Can't click from the first try");
            we.click();
        }
    }

    public void type(By locator, String text) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement we = findElement(locator);

        we.clear();
        we.sendKeys(text);
    }

    public void type(By locator, int text) {
        type(locator, String.valueOf(text));
    }

    public void pressKey(By locator, Keys key) {
        findElement(locator).sendKeys(key);
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        WebElement we = driver.findElement(locator);
//
//        we.sendKeys(key);
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void click(WebElement we) {
        wait.until(ExpectedConditions.elementToBeClickable(we)).click();
    }


    public void select(By locator, String text) {
        Select select = new Select(findElement(locator));
        select.selectByVisibleText(text);
    }

    public void waitForElementCountAtLeast(By locator, int minCount) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, minCount));
    }

}
