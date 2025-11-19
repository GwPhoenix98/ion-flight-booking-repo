import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner                    = new Scanner(System.in);
        SwitchAirline settingAirline         = new SwitchAirline();
        FlightBooking settingBooking         = new FlightBooking();
        SwitchDestination settingDestination = new SwitchDestination();

        System.out.print("Enter the passenger's name: ");
        String name = obScanner.next();
        settingBooking.setPassengerName(name);

        System.out.println("Choose your destination");
        System.out.print("Paris, Roma, London, Barcelona: ");
        String destinationName = obScanner.next().toLowerCase();
        settingDestination.controlDestiantion(destinationName);
        destinationName = settingDestination.finalDestinationName;
        settingBooking.setDestination(destinationName);

        System.out.println("Choose your airline");
        System.out.print("WizzAir, RyanAir, TurkishAirline, HiSky: ");
        String airlineName = obScanner.next().toLowerCase();
        settingAirline.controlAirline(airlineName);
        airlineName = settingAirline.finalAirlineName;





    }
}
