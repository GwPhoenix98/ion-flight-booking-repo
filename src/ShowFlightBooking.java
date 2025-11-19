public class ShowFlightBooking {
     void printBooking(String name,
                      String destination,
                      String airline,
                      boolean hasLuggage,
                      String seatClass) {

         FlightBooking settingBooking = new FlightBooking();

        settingBooking.setPassengerName(name);
        settingBooking.setDestination(destination);
        settingBooking.setAirline(airline);
        settingBooking.setSeatClass(seatClass);
        settingBooking.setHasLuggage(hasLuggage);

        System.out.println( "Name: "        + settingBooking.getPassengerName() + "\n" +
                            "Destination: " + settingBooking.getDestination() + "\n" +
                            "Airline: "     + settingBooking.getAirline() + "\n" +
                            "Class: "       + settingBooking.getSeatClass() + "\n" +
                            "Has Luggage: " + settingBooking.isHasLuggage());

    }
}