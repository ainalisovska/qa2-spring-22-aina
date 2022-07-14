package pageObject.pagesBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObject.pages.BaseFunc;

public class HomePage {
    private final By FLY_FROM_AIRPORT = By.id("afrom");
    private final By FLY_TO_AIRPORT = By.id("bfrom");
    private final By GO_BTN = By.xpath((".//span[@class = 'gogogo']"));
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectFromAirport(String from) {
        Select selectFlight = new Select(baseFunc.findElement(FLY_FROM_AIRPORT));
        selectFlight.selectByValue(from);
    }

    public void selectToAirport(String to) {
        Select selectAirport = new Select(baseFunc.findElement(FLY_TO_AIRPORT));
        selectAirport.selectByValue(to);
    }

    public void pressGoBtn() { baseFunc.click(GO_BTN); }

}
