import java.util.Scanner;

public class RectangleCalculator {
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to the Area and Perimeter Calculator\n");
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				
					
			// Declare and initialize variables
			double length = 0;
			double width = 0;
			
			// getting console input
			System.out.print("Enter length: ");
			length = Double.parseDouble(sc.nextLine());
			System.out.print("Enter width: ");
			width = Double.parseDouble(sc.nextLine());
			double area = length * width;
			double perimeter = 2 * (length + width);
			System.out.print("Area: " + area);
			System.out.println("\nPerimeter: " + perimeter);
			
			
			System.out.print("\nContinue (y/n)? \n");
			choice = sc.nextLine();
			
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
