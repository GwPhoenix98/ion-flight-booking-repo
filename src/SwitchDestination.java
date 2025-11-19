import java.util.Scanner;

public class SwitchDestination {
    String finalDestinationName;

     void controlDestiantion(String destinationName) {
        Scanner obScanner = new Scanner(System.in);
        boolean valid = false;

        do {
            switch (destinationName) {
                case "paris":
                    System.out.println("You have chosen the destination Paris!");
                    finalDestinationName = "Paris";
                    valid = true;
                    break;

                case "roma":
                    System.out.println("You have chosen the destination Roma!");
                    finalDestinationName = "Roma";
                    valid = true;
                    break;

                case "london":
                    System.out.println("You have chosen the destination London!");
                    finalDestinationName = "London";
                    valid = true;
                    break;

                case "barcelona":
                    System.out.println("You have chosen the destination Barcelona!");
                    finalDestinationName = "Barcelona";
                    valid = true;
                    break;

                default:
                    System.out.println("Unknown destination! Choose again!");
                    System.out.print("Paris, Roma, London, Barcelona: ");
                    destinationName = obScanner.next().toLowerCase();
                    valid = false;
            }
        } while (!valid);

    }
}
