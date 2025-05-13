import java.util.Scanner;
public class ChangeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
	
		System.out.println("Welcome to the Change Controller!\n");
		
		System.out.print("Enter number of cents(0-99): ");
		int cents = Integer.parseInt(sc.nextLine());
		if (cents < 0 || cents > 99) {
            System.out.println("Invalid input. Please enter a number between 0 and 99.");
            continue;
        }
		int dollars = cents / 100;
		int quarters = (cents - (dollars * 100)) / 25;
		int dimes = (cents - (dollars * 100) - (quarters * 25)) / 10;
		int nickels = (cents - (dollars * 100) - (quarters * 25) - (dimes * 10)) / 5;
		int pennies = (cents - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5));
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
			
		System.out.print("\nContinue (y/n)? ");
		choice = sc.nextLine();
		
		}
			
		
		
		
		
	}

}
