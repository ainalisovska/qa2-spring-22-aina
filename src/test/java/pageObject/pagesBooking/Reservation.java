package pageObject.pagesBooking;

public class Reservation {
        private String homePageUrl;
        private String airportFlyFrom;
        private String airportFlyTo;
        private String Name;
        private String Surname;
        private String Discount;
        private String Adults;
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
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getSurname() {
                return Surname;
        }

        public void setSurname(String surname) {
                Surname = surname;
        }

        public String getDiscount() {
                return Discount;
        }

        public void setDiscount(String discount) {
                Discount = discount;
        }

        public String getAdults() {
                return Adults;
        }

        public void setAdults(String adults) {
                Adults = adults;
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
