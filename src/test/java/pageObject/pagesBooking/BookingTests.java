package pageObject.pagesBooking;

import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;

public class BookingTests {

//    @Test
//    public void ticketBookingCheck() {
//        TicketReservation ticketReservation = new TicketReservation();
//        ticketReservation.setHomePageUrl("http://qaguru.lv:8089/tickets/");
//        ticketReservation.setAirportFlyFrom("RIX");
//        ticketReservation.setAirportFlyTo("BCN");
//        ticketReservation.setName("Janis");
//        ticketReservation.setSurname("Piebalgs");
//        ticketReservation.setDiscount("242424");
//        ticketReservation.setAdults("2");
//        ticketReservation.setChildrenNumber("2");
//        ticketReservation.setLuggage("4");
//        ticketReservation.setFlightDate("12-05-2018");
//        ticketReservation.setSeatNumber(9);
//
//        BaseFunc baseFunc = new BaseFunc();
//        baseFunc.openUrl(ticketReservation.getHomePageUrl());
//
//        HomePage homePage = new HomePage(baseFunc);
//        homePage.selectAirports(ticketReservation.getAirportFlyFrom(), ticketReservation.getAirportFlyTo());
//
//        homePage.pressGoBtn();
//
//        BookingPage bookingPage = new BookingPage(baseFunc);
//        bookingPage.fillInName(ticketReservation.getName());
//        bookingPage.fillInSurName(ticketReservation.getSurname());
//        bookingPage.fillInDiscount(ticketReservation.getDiscount());
//        bookingPage.fillInAdults(ticketReservation.getAdults());
//        bookingPage.fillInChildren(ticketReservation.getChildrenNumber());
//        bookingPage.fillInLuggage(ticketReservation.getLuggage());
//        bookingPage.selectFlight(ticketReservation.getFlightDate());
//        bookingPage.pressGetPriceBtn();
//
//        bookingPage.checkAirports(ticketReservation.getAirportFlyFrom());
//        bookingPage.checkAirports(ticketReservation.getAirportFlyTo());
//
//        bookingPage.getPrice();
//
//        bookingPage.pressBookBtn();
//
//        SeatReservationPage seatReservationPage = new SeatReservationPage(baseFunc);
//        seatReservationPage.pressFinalBookBtn();
//    }
}
