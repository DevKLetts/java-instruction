import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println("\nWelcome to the Temperature Converter!\n");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter temperature in Fahrenheit: ");
		double fahrenheit = Double.parseDouble(sc.nextLine());
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.print("Temperature in Celsius: " + celsius + "\n");
	
		System.out.print("\nContinue (y/n)? ");
        choice = sc.nextLine();
        
    }

}
}
