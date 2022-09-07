package pageObject.pagesBooking;

import model.reservation.Reservation;
import org.openqa.selenium.By;
import pageObject.pages.BaseFunc;

public class HomePage {
    private final By FLY_FROM_AIRPORT = By.id("afrom");
    private final By FLY_TO_AIRPORT = By.id("bfrom");
    private final By GO_BTN = By.xpath((".//span[@class = 'gogogo']"));

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectAirports(Reservation reservation) {
        baseFunc.select(FLY_FROM_AIRPORT, reservation.getDepartureAirport());
        baseFunc.select(FLY_TO_AIRPORT, reservation.getArrivalAirport());
    }

    public void pressGoBtn() {
        baseFunc.click(GO_BTN);
    }
}
