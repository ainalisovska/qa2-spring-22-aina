package pageObject.pagesBooking;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.pages.BaseFunc;

public class SeatReservationPage {
    private BaseFunc baseFunc;
    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By SEAT_NUMBER = By.xpath(".//div[@class = 'line']");
    private final By FINAL_BOOK_BTN = By.id("book3");

    public SeatReservationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSeatNumber(int seat) {
        baseFunc.waitForElementCountAtLeast(SEAT, 5);

        WebElement seatToChoose = null;

        for (WebElement we : baseFunc.findElements(SEAT)) {
            if (Integer.parseInt(we.getText()) == seat) {
                seatToChoose = we;
                break;
            }
        }

        Assertions.assertNotNull(seatToChoose, "Can't find seat");

        baseFunc.click(seatToChoose);
    }

    public int getSelectedSeatNr() {
        return Integer.parseInt(baseFunc.findElement(SEAT_NUMBER).getText().replaceAll("\\D+", ""));
    }

    public void pressFinalBookBtn() {
        baseFunc.click(FINAL_BOOK_BTN);
    }
}
