package util;
import java.util.Scanner;

public class ConsoleUtil {

	
	
	/**
	 * Utility class for console input validation. This class provides methods to
	 * prompt the user for different types of input and validate the input.
	 */
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Prompt the user for a double value and validate the input.
	 * 
	 * @param prompt The prompt message to display to the user.
	 * @param sc     The Scanner object for reading user input.
	 * @return The validated double value entered by the user.
	 */
	public static double promptDouble(String prompt, Scanner sc) {
		double interestRate = 0.0;
		boolean valid = false;
		System.out.print("\n" + prompt);
		while (!valid) {
			if (sc.hasNextDouble()) {
				interestRate = sc.nextDouble();
				valid = true;
			} else {
				System.out.println("Invalid entry. Please enter a valid double value.");
				sc.nextLine(); // clear the invalid input
			}
		}
		return interestRate;
	}
	
	/**
	 * Prompt the user for an integer value and validate the input.
	 * 
	 * @param prompt The prompt message to display to the user.
	 * @param sc     The Scanner object for reading user input.
	 * @return The validated integer value entered by the user.
	 */
	public static int promptInt(String prompt) {
		int nbr = 0;
		boolean valid = false;
		while (!valid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				nbr = Integer.parseInt(sc.nextLine());
				valid = true;
			} else {
				System.out.println("Invalid entry. Please enter a whole number.");
				sc.nextLine(); // clear the invalid input	
			}
		}
		return nbr;
	}
	/**
	 * Prompt the user for a string value and validate the input.
	 * 
	 * @param prompt The prompt message to display to the user.
	 * @param sc     The Scanner object for reading user input.
	 * @return The validated string value entered by the user.
	 */	
	public static String promptString(String prompt) {
		String input = "";
		boolean valid = false;
		while (!valid) {
			System.out.print(prompt);
			input = sc.nextLine();
			if (input.isEmpty()) {
				System.out.println("Invalid entry. Please enter a non-empty string.");
			} else {
				valid = true;
			}
		}
		return input;
	}
	
	public static String promptString(String prompt, String v1, String v2) {
		String str = "";
		boolean valid = false;
		while (!valid) {
			str = promptString(prompt);
			if (str.isEmpty()) {
				System.out.println("Invalid entry. Please enter a non-empty string.");
			} else if (str.equalsIgnoreCase(v1) || str.equalsIgnoreCase(v2)) {
				valid = true;
			} else {
				System.out.println("Invalid entry. Please enter either " + v1 + " or " + v2 + ".");
			}
		}
		return str;
	}
	
	public static int promptInt(String prompt, int min, int max) {
		boolean valid = false;
		int nbr = 0;
		while (!valid) {
			nbr = promptInt(prompt);
			if (nbr >= min || nbr <= max) {
				valid = true;
			} else {
				System.out.println("Invalid entry. Please enter a number between " + min + " and " + max + ".");
			}
		}
		return nbr;
	}
	
}
