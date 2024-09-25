//import java util scanner for user inputs
import java.util.Scanner;

//create class named clock
class Clock {
    //Print user promppt for converion options
    public static void printPrompt() {
        System.out.println("[1] Seconds to Minutes");
        System.out.println("[2] Seconds to Hours");
        System.out.println("[3] Minutes to Seconds");
        System.out.println("[4] Minutes to Hours");
        System.out.println("[5] Hours to Seconds");
        System.out.println("[6] Hours to Minutes");
    }

    //convert seconds to minutes
    public static double SecondsToMinutes(double seconds) {
        return seconds / 60;
    }
    //convert  seconds to hours
    public static double SecondsToHours(double seconds) {
        return seconds / 3600;
    }
    //convert minutes to seconds
    public static double MinutesToSeconds(double minutes) {
        return minutes * 60;
    }
    //convert minutes to hours
    public static double MinutesToHours(double minutes) {
        return minutes / 60;
    }
    //convert hours to seconds
    public static double HoursToSeconds(double hours) {
        return hours * 3600;
    }
    //convert hours to minutes
    public static double HoursToMinutes(double hours) {
        return hours * 60;
    }

    public static void main(String[] args) {
        //instantiate scanner to use for user input
        Scanner input = new Scanner(System.in);
        //declare variables needed in the program
        double timeInput, finalValue;
        char choice;
        
        //Continue the program until the user decides to stop1
        do {
            // Call the printPrompt() method to display conversion options
            printPrompt();
            System.out.print("Choose the Conversion: ");
            //store the user input
            choice = input.nextLine().charAt(0);
            // Check user input choice and execute the corresponding action
            if (choice == '1') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = SecondsToMinutes(timeInput);
                System.out.println("Seconds to Minutes: " + finalValue);
            } else if (choice == '2') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = SecondsToHours(timeInput);
                System.out.println("Seconds to Hours: " + finalValue);
            } else if (choice == '3') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = MinutesToSeconds(timeInput);
                System.out.println("Minutes to Seconds: " + finalValue);
            } else if (choice == '4') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = MinutesToHours(timeInput);
                System.out.println("Minutes to Hours: " + finalValue);
            } else if (choice == '5') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = HoursToSeconds(timeInput);
                System.out.println("Hours to Seconds: " + finalValue);
            } else if (choice == '6') {
                System.out.print("Enter the Value: ");
                timeInput = input.nextDouble();
                finalValue = HoursToMinutes(timeInput);
                System.out.println("Hours to Minutes: " + finalValue);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            input.nextLine(); 
            //ask user if proced to the next conversion or stop
            System.out.print("Do you want to convert time? (Y/N): ");
          
            choice = input.nextLine().charAt(0);
            System.out.println("--------------------------------------------");
        } while (choice != 'N' && choice != 'n'); // stop the program when use enter "N" or "n";

        input.close(); //close scanner
    }
}
