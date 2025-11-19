import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner                    = new Scanner(System.in);
        FlightBooking settingBooking         = new FlightBooking();
        SwitchDestination settingDestination = new SwitchDestination();

        System.out.print("Enter the passenger's name: ");
        String name = obScanner.next();
        settingBooking.setPassengerName(name);

        System.out.println("Choose your destination");
        System.out.print("Paris, Roma, London, Barcelona: ");
        String destination = obScanner.next().toLowerCase();
        settingDestination.controlDestiantion(destination);
        destination = settingDestination.finalDestinationName;
        settingBooking.setDestination(destination);
        System.out.println(settingBooking.getDestination());



    }
}
