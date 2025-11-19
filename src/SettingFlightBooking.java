import java.util.Scanner;

public class SettingFlightBooking {
    public static void main(String[] args) {

        Scanner obScanner                    = new Scanner(System.in);
        TwoLines printLines                  = new TwoLines();
        ChooseClass settClass                = new ChooseClass();
        SwitchAirline settingAirline         = new SwitchAirline();
        SwitchDestination settingDestination = new SwitchDestination();
        ShowFlightBooking showBooking        = new ShowFlightBooking();
        boolean luggagePresence;

        System.out.print("Enter the passenger's name: ");
        String name = obScanner.next();
        printLines.printLine();

        System.out.println("Choose your destination");
        System.out.print("Paris, Roma, London, Barcelona: ");
        String destinationName = obScanner.next().toLowerCase();
        settingDestination.controlDestination(destinationName);
        destinationName = settingDestination.finalDestinationName;
        printLines.printLine();

        System.out.println("Choose your airline");
        System.out.print("WizzAir, RyanAir, TurkishAirline, HiSky: ");
        String airlineName = obScanner.next().toLowerCase();
        settingAirline.controlAirline(airlineName);
        airlineName = settingAirline.finalAirlineName;
        printLines.printLine();

        System.out.print("Do you have luggage?(true/false): ");
        while (true) {
            if (obScanner.hasNextBoolean()) {
                luggagePresence = obScanner.nextBoolean();
                break;
            } else {
                System.out.println("Please enter true or false!");
                obScanner.next();
                System.out.print("Do you have luggage? (true/false): ");
            }
        }
        printLines.printLine();

        System.out.println("Choose your class Business or Economy");
        String classType = obScanner.next().toLowerCase();
        settClass.settingClass(classType);
        classType = settClass.finalClass;
        printLines.printLine();

        showBooking.printBooking(name, destinationName, airlineName, luggagePresence, classType);
        obScanner.close();
    }
}
