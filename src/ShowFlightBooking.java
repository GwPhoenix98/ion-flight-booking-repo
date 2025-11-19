public class ShowFlightBooking {
    public static void main(String[] args) {

        FlightBooking showBooking = new FlightBooking();

        showBooking.setPassengerName("Ion");
        showBooking.setDestination("London");
        showBooking.setAirline("WizzAir");
        showBooking.setSeatClass("Business");
        showBooking.setHasLuggage(true);

        System.out.println( "Name: "        + showBooking.getPassengerName() + "\n" +
                            "Destination: " + showBooking.getDestination() + "\n" +
                            "Airline: "     + showBooking.getAirline() + "\n" +
                            "Class: "       + showBooking.getSeatClass() + "\n" +
                            "Has Luggage: " + showBooking.isHasLuggage());

    }
}