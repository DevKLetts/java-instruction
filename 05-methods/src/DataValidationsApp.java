import java.util.Scanner;

public class DataValidationsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		// Welcome message
		System.out.println("Welcome to the Data Validations App!\n");
		

		
		//get an integer from the user - exception handling
		System.out.print("Please enter a whole number: ");
		int firstInt = promptInt("Please enter a whole number: ", sc);
		System.out.print("Please enter another whole number: ");
		int secondInt = promptInt("Please enter another whole number: ", sc);
			
		//print the sum of the two integers
			
		int sum = firstInt + secondInt;
		System.out.println("\nThe sum of the two integers is: " + sum);
		
		
		
		//Goodbye message
		System.out.println("\nThank you for using the Data Validations App!");
	
		
		// get a double - data validation

		double interestRate = promptDouble("Please enter an interest rate: ", sc);
		
		
		//method validate whole number entry

		private static int promptInt(String prompt, Scanner sc) {
			int num = 0;
			boolean valid = false;
			while (!valid) {
				System.out.print(prompt);
				try {
					num = Integer.parseInt(sc.nextInt());
					valid = true;
				} catch (NumberFormatException nfe) {
					System.out.println("Invalid entry. Please enter a whole number.");
					sc.next(); // clear the invalid input
				}
			}
			return num;
		}

		private static double promptDouble(String prompt, Scanner sc) {
			double interestRate = 0.0;
			boolean valid = false;
			System.out.print("\n" + prompt);
			while (!valid)
				if (sc.hasNextDouble()) {
					interestRate = Double.parseDouble(sc.nextLine());
					valid = true;
				} else {
					System.out.println("Invalid entry. Please enter a valid double.");
					sc.next(); // clear the invalid input
				}
			return interestRate;
		}

}
