package pageObject.pagesBooking;

import org.openqa.selenium.By;
import pageObject.pages.BaseFunc;

public class FinalBookingPage {
    private final By SUCCESSFUL_BOOKING = By.xpath(".//div[@class = 'finalTxt']");
    private BaseFunc baseFunc;

    public FinalBookingPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getSuccessfulRegistrationMsg() {
        return baseFunc.findElement(SUCCESSFUL_BOOKING).getText();
    }
}
