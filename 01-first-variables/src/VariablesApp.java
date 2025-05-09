import java.util.Scanner;

public class VariablesApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the variables app!");
		// Declare and initialize variables
		int age = 25;
		double height = 5.9;
		String name = "John Doe";

		// Print the variables
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);

		// Perform some operations
		int yearsToRetirement = 65 - age;
		System.out.println("Years to retirement: " + yearsToRetirement);

		double heightInCm = height * 100;
		System.out.println("Height in cm: " + heightInCm);

		String greeting = "Hello, my name is " + name;
		System.out.println(greeting);

		double price = 0;
		double tax = 0.85;
		double total = price*(1+tax);
		
	// getting console input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Price: ");
		
		price = Double.parseDouble(sc.nextLine());
		
		System.out.print("Name: ");
		
		name = sc.nextLine();
		
		System.out.println(name + price);
		

		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter birth month (numeric): ");
		int birthMonth = Integer.parseInt(sc.nextLine());
		
		// evaluate birthMonth to determine quarter (1-3: Q1, 4-6: Q2, etc)
		String quarter = "";
		if (birthMonth <= 3) {
			quarter = "Q1";
		} else if (birthMonth <= 6) {
			quarter = "Q2";
		} else if (birthMonth <= 9) {
			quarter = "Q3";
		} else if (birthMonth <= 12) {
			quarter = "Q4";
		} else {
			quarter = "ERR";
		}
		
		System.out.println("Quarter: "+quarter);
		System.out.print("\nContinue (y/n)? ");
		choice = sc.nextLine();
		}
		
		System.out.println("Bye");
		
				
	} // End of main method

}
