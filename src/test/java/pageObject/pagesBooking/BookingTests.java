package pageObject.pagesBooking;

import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;

public class BookingTests {
    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets/";
    private final String AIRPORT_FLY_FROM = "RIX";
    private final String AIRPORT_FLY_TO = "BCN";

    private final String FILL_IN_NAME = "Janis";
    private final String FILL_IN_SURNAME = "Piebalgs";
    private final String FILL_IN_DISCOUNT = "242424";
    private final String FULL_IN_ADULTS = "2";
    private final String FILL_IN_CHILDREN_NUMBER = "2";
    private final String FILL_IN_LUGGAGE = "4";
    private final String SELECT_FLIGHT_DATE = "12-05-2018";


    @Test
    public void ticketBookingCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFromAirport(AIRPORT_FLY_FROM);
        homePage.selectToAirport(AIRPORT_FLY_TO);

        homePage.pressGoBtn();

        BookingPage bookingPage = new BookingPage(baseFunc);
        bookingPage.fillInName(FILL_IN_NAME);
        bookingPage.fillInSurName(FILL_IN_SURNAME);
        bookingPage.fillInDiscount(FILL_IN_DISCOUNT);
        bookingPage.fillInAdults(FULL_IN_ADULTS);
        bookingPage.fillInChildren(FILL_IN_CHILDREN_NUMBER);
        bookingPage.fillInLuggage(FILL_IN_LUGGAGE);
        bookingPage.selectFlight(SELECT_FLIGHT_DATE);
        bookingPage.pressGetPriceBtn();

        bookingPage.checkAirports(AIRPORT_FLY_FROM);
        bookingPage.checkAirports(AIRPORT_FLY_TO);

        bookingPage.getPrice();


    }
}
