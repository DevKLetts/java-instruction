import java.util.Scanner;

public class TravTimeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Travel Time Calculator!");
	String choice = "y";
	while(choice.equalsIgnoreCase("y")) {
	
    // Declare and initialize variables
	
	System.out.print("Enter miles: ");
	double miles = Double.parseDouble(sc.nextLine());
	System.out.print("Enter miles per hour: ");
	double mph = Double.parseDouble(sc.nextLine());
	double hours = miles / mph;
	double minutes = (hours - (int) hours) * 60;
	int intHours = (int) hours;
	int intMinutes = (int) minutes;
	System.out.println("Estimated Travel time \n ----------------------\nHours:   " + intHours + "\n" + "Minutes: " + intMinutes);
	
	System.out.print("\nContinue (y/n)? ");
	choice = sc.nextLine();
	
	}

	}
}
