package pageObject.pagesBooking;

public class TicketReservation {
        private String homePageUrl;
        private String airportFlyFrom;
        private String airportFlyTo;
        private String name;
        private String surname;
        private String discount;
        private String adults;
        private String childrenNumber;
        private String luggage;
        private String flightDate;
        private int seatNumber;

        public String getHomePageUrl() {
                return homePageUrl;
        }

        public void setHomePageUrl(String homePageUrl) {
                this.homePageUrl = homePageUrl;
        }

        public String getAirportFlyFrom() {
                return airportFlyFrom;
        }

        public void setAirportFlyFrom(String airportFlyFrom) {
                this.airportFlyFrom = airportFlyFrom;
        }

        public String getAirportFlyTo() {
                return airportFlyTo;
        }

        public void setAirportFlyTo(String airportFlyTo) {
                this.airportFlyTo = airportFlyTo;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getDiscount() {
                return discount;
        }

        public void setDiscount(String discount) {
                this.discount = discount;
        }

        public String getAdults() {
                return adults;
        }

        public void setAdults(String adults) {
                this.adults = adults;
        }

        public String getChildrenNumber() {
                return childrenNumber;
        }

        public void setChildrenNumber(String childrenNumber) {
                this.childrenNumber = childrenNumber;
        }

        public String getLuggage() {
                return luggage;
        }

        public void setLuggage(String luggage) {
                this.luggage = luggage;
        }

        public String getFlightDate() {
                return flightDate;
        }

        public void setFlightDate(String flightDate) {
                this.flightDate = flightDate;
        }

        public int getSeatNumber() {
                return seatNumber;
        }

        public void setSeatNumber(int seatNumber) {
                this.seatNumber = seatNumber;
        }
}
