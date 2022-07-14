package pageObject.pagesBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObject.pages.BaseFunc;

import java.util.List;

public class BookingPage {
    private BaseFunc baseFunc;
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


    public BookingPage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInName(String textToFillIn) { baseFunc.type(NAME_INPUT_FIELD, textToFillIn); }

    public void fillInSurName(String textToFillIn) { baseFunc.type(SURNAME_INPUT_FIELD, textToFillIn);}

    public void fillInDiscount(String textToFillIn) { baseFunc.type(DISCOUNT_INPUT_FIELD, textToFillIn); }

    public void fillInAdults(String textToFillIn) { baseFunc.type(ADULTS_INPUT_FIELD, textToFillIn); }

    public void fillInChildren(String textToFillIn) { baseFunc.type(CHILDREN_INPUT_FIELD, textToFillIn); }

    public void fillInLuggage(String textToFillIn) { baseFunc.type(LUGGAGE_INPUT_FIELD, textToFillIn); }

    public void selectFlight(String date) {
        Select selectFlight = new Select(baseFunc.findElement(SELECT_FLIGHT_FIELD));
        selectFlight.selectByVisibleText(date);
    }

    public void pressGetPriceBtn() { baseFunc.click(GET_PRICE_BTN); }

    public void checkAirports(String airportName) {
        List<WebElement> airports = baseFunc.findElements(AIRPORT_ABBREVIATION);

        for (WebElement we : airports) {
            if (we.getText().equals(airportName)) {
                System.out.println("Airport name correct");
            }
        }
    }

    public void getPrice() {
        WebElement we = baseFunc.findElement(PRICE);
        System.out.println("Price is " + we.getText().replaceAll("\\D+",""));








    }

}




