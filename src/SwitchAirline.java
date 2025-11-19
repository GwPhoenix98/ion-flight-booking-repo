import java.util.Scanner;

public class SwitchAirline {
    String finalAirlineName;

    void controlAirline(String airlineName) {
        Scanner obScanner = new Scanner(System.in);
        boolean valid = false;

        do {
            switch (airlineName) {
                case "wizzair":
                    System.out.println("You chose the airline WizzAir!");
                    finalAirlineName = "WizzAir";
                    valid = true;
                    break;

                case "ryanair":
                    System.out.println("You chose the airline RyanAir!");
                    finalAirlineName = "RyanAir";
                    valid = true;
                    break;

                case "turkishairlines":
                    System.out.println("You chose the airline TurkishAirlines!");
                    finalAirlineName = "TurkishAirlines";
                    valid = true;
                    break;

                case "hisky":
                    System.out.println("You chose the airline HiSky!");
                    finalAirlineName = "HiSky";
                    valid = true;
                    break;

                default:
                    System.out.println("Unknown airline company! Choose again!");
                    System.out.print("WizzAir, RyanAir, TurkishAirline, HiSky: ");
                    airlineName = obScanner.next().toLowerCase();

            }
        } while (!valid);
    }
}