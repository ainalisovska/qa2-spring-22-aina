package pageObject.pagesBooking;

import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;

public class BookingTests {

    @Test
    public void ticketBookingCheck() {
        Reservation reservation = new Reservation();
        reservation.setHomePageUrl("http://qaguru.lv:8089/tickets/");
        reservation.setAirportFlyFrom("RIX");
        reservation.setAirportFlyTo("BCN");
        reservation.setName("Janis");
        reservation.setSurname("Piebalgs");
        reservation.setDiscount("242424");
        reservation.setAdults("2");
        reservation.setChildrenNumber("2");
        reservation.setLuggage("4");
        reservation.setFlightDate("12-05-2018");
        reservation.setSeatNumber(9);

        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(reservation.getHomePageUrl());

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(reservation.getAirportFlyFrom(), reservation.getAirportFlyTo());

        homePage.pressGoBtn();

        BookingPage bookingPage = new BookingPage(baseFunc);
        bookingPage.fillInName(reservation.getName());
        bookingPage.fillInSurName(reservation.getSurname());
        bookingPage.fillInDiscount(reservation.getDiscount());
        bookingPage.fillInAdults(reservation.getAdults());
        bookingPage.fillInChildren(reservation.getChildrenNumber());
        bookingPage.fillInLuggage(reservation.getLuggage());
        bookingPage.selectFlight(reservation.getFlightDate());
        bookingPage.pressGetPriceBtn();

        bookingPage.checkAirports(reservation.getAirportFlyFrom());
        bookingPage.checkAirports(reservation.getAirportFlyTo());

        bookingPage.getPrice();

        bookingPage.pressBookBtn();

        SeatReservationPage seatReservationPage = new SeatReservationPage(baseFunc);
        seatReservationPage.pressFinalBookBtn();
    }
}
