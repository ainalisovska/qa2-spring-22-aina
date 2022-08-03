package pageObject.pagesBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObject.pages.BaseFunc;

public class SeatReservationPage {
    private BaseFunc baseFunc;
    private final By SELECT_SEAT_NUMBER = By.id("seat");
    private final By FINAL_BOOK_BTN = By.id("book3");

    public SeatReservationPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSeatNumber(String seat) {
        baseFunc.select(SELECT_SEAT_NUMBER, seat);
    }

    public void pressFinalBookBtn() { baseFunc.click(FINAL_BOOK_BTN); }
}
