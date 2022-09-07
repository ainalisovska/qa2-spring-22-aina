package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.reservation.Reservation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pageObject.pages.BaseFunc;
import pageObject.pagesBooking.BookingPage;
import pageObject.pagesBooking.FinalBookingPage;
import pageObject.pagesBooking.HomePage;
import pageObject.pagesBooking.SeatReservationPage;
import requesters.ReservationsRequester;


import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationStepDefs {
    private Reservation reservation;
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private BookingPage bookingPage;
    private SeatReservationPage seatReservationPage;
    private FinalBookingPage finalBookingPage;
    private List<Reservation> response;
    private Reservation reservationFromApi;

    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets";

    @Given("random client with:")
    public void create_client(Map<String, String> params) {
        reservation = new Reservation("random", "random", params.get("discount"), params.get("flight_date"),
                params.get("airport_from"), params.get("airport_to"), Integer.parseInt(params.get("seat_number")),
                2, 3, 2);
        }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl(HOME_PAGE_URL);
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectAirports(reservation);
        homePage.pressGoBtn();
        bookingPage = new BookingPage(baseFunc);
    }

    @Then("selected airports appears on client info page")
    public void check_airports() {
        List<WebElement> airports = bookingPage.getSelectedAirports();
        assertEquals(reservation.getDepartureAirport(), airports.get(0).getText(), "Incorrect dep airport");
        assertEquals(reservation.getArrivalAirport(), airports.get(1).getText(), "Incorrect arrival airport");
    }

    @When("we are filling in passenger info form")
    public void fill_passenger_info_form() {
        bookingPage.fillInInfoForm(reservation);
    }

    @When("we are clicking on Get Price link")
    public void click_get_price_link() {
        bookingPage.pressGetPriceBtn();
    }

    @Then("passenger name appears")
    public void check_name() {
        assertEquals(reservation.getFirstName(), bookingPage.getPassengerName(), "Wrong last name!");
    }

    @Then("price is: {int} EUR")
    public void check_price(int price) {
        assertEquals(price, bookingPage.getPrice(), "Wrong price!");
    }

    @When("we are pressing Book button")
    public void press_book_btn() {
        bookingPage.pressBookBtn();
        seatReservationPage = new SeatReservationPage(baseFunc);
    }

    @When("selecting seat number")
    public void select_seat_nr() {
        seatReservationPage.selectSeatNumber(reservation.getSeatNumber());
    }

    @Then("selected seat number appears")
    public void check_seat_number() {
        assertEquals(reservation.getSeatNumber(), seatReservationPage.getSelectedSeatNr(), "Wrong seat Nr");
    }

    @When("we are placing the order")
    public void place_the_order() {
        seatReservationPage.pressFinalBookBtn();
        finalBookingPage = new FinalBookingPage(baseFunc);
    }

    @Then("successful booking page appears")
    public void check_successful_message() {
        assertEquals("Thank You for flying with us!", finalBookingPage.getSuccessfulRegistrationMsg(), "Wrong message!");
    }

    @When("we are requesting all reservationsvia API")
    public void request_reservations() throws JsonProcessingException {
        ReservationsRequester requester = new ReservationsRequester();
        response = requester.requestReservations();
    }

    @When("we found created reservation")
    public void find_reservation() {
        for (Reservation r : response) {
            if (r.getFirstName().equals(reservation.getFirstName())) {
                reservationFromApi = r;
                break;
            }
        }

        assertNotNull(reservationFromApi, "Can't find created reservation");
    }

    @Then("all data stored correctly")
    public void check_reservation_data() {
        assertEquals(reservation.getLastName(), reservationFromApi.getLastName(), "Wrong Last name!");
        assertEquals(reservation.getDiscount(), reservationFromApi.getDiscount(), "Wrong discount!");
        assertEquals(reservation.getAdultsCount(), reservationFromApi.getAdultsCount(), "Wrong adults number!");
    }

}

