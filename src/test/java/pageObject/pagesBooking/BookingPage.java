package pageObject.pagesBooking;

import model.reservation.Reservation;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.pages.BaseFunc;

import java.util.List;

public class BookingPage {
    private final By NAME_INPUT_FIELD = By.id("name");
    private final By SURNAME_INPUT_FIELD = By.id("surname");
    private final By DISCOUNT_INPUT_FIELD = By.id("discount");
    private final By ADULTS_INPUT_FIELD = By.id("adults");
    private final By CHILDREN_INPUT_FIELD = By.id("children");
    private final By LUGGAGE_INPUT_FIELD = By.id("bugs");
    private final By SELECT_FLIGHT_FIELD = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@style = 'cursor: pointer;']");
    private final By AIRPORT_ABBREVIATION = By.xpath(".//span[@class = 'bTxt']");
    private final By PRICE = By.id("response");
    private final By BOOK_BTN = By.id("book2");
    private final By PASSENGER_NAME = By.xpath(".//div[@id = 'response']/span");

    private BaseFunc baseFunc;

    public BookingPage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }

    public List<WebElement> getSelectedAirports() {

        return baseFunc.findElements(AIRPORT_ABBREVIATION);
    }

    public void fillInInfoForm(Reservation reservation) {
        baseFunc.type(NAME_INPUT_FIELD, reservation.getFirstName());
        baseFunc.type(SURNAME_INPUT_FIELD, reservation.getLastName());
        baseFunc.type(DISCOUNT_INPUT_FIELD, reservation.getDiscount());
        baseFunc.type(ADULTS_INPUT_FIELD, reservation.getAdultsCount());
        baseFunc.type(CHILDREN_INPUT_FIELD, reservation.getChildCount());
        baseFunc.type(LUGGAGE_INPUT_FIELD, reservation.getBagsCount());
        baseFunc.select(SELECT_FLIGHT_FIELD, reservation.getFlightDate());
    }

    public void pressGetPriceBtn() {
        baseFunc.click(GET_PRICE_BTN);
    }

    public String getPassengerName() {
        return baseFunc.findElement(PASSENGER_NAME).getText().replace("!", "");
    }

    public int getPrice() {
        String responseText = baseFunc.findElement(PRICE).getText();
        return Integer.parseInt(StringUtils.substringBetween(responseText, "for ", " EUR"));
    }

    public void pressBookBtn() {
        baseFunc.click(BOOK_BTN);
    }
}




