import java.util.Scanner;
public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Factorial Calculator!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		System.out.print("Enter an integer that's greater than 0 and less than 10: ");
        // Declare and initialize variables
		int num = Integer.parseInt(sc.nextLine());
		int factorial = 1;
		
		if (num < 1 || num > 16) {
			System.out.println("Invalid input. Please enter a number between 1 and 16.");
			continue; // Skip to the next iteration of the loop
		}
		
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println("The factorial of " + num + " is " + factorial);
		System.out.print("\nContinue (y/n)? ");
		choice = sc.nextLine();

		}
		
	}

}
