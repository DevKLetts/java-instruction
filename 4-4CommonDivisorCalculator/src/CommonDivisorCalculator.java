import java.util.Scanner;

import java.math.BigInteger;
public class CommonDivisorCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// Welcome message
			System.out.println("\nWelcome to the Common Divisor Finder!\n");
			// Prompt user for input
			System.out.print("Enter first number: ");
			BigInteger n1 = new BigInteger(sc.nextLine());
			System.out.print("Enter second number: ");
			BigInteger n2 = new BigInteger(sc.nextLine());
			// Output the result
			System.out.println("Greatest common divisor: " + n1.gcd(n2));
		
            // Prompt user for input
			
			System.out.print("Enter 2nd try first number: ");
			Integer x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter 2nd try second number: ");
			Integer y = Integer.parseInt(sc.nextLine());
			
			// Biz logic
			
			// 1. Subtract x from y repeatedly until y < x.
			
			while (x != 0 && y != 0) {
				if (x > y) {
					x = x - y;
				} else {
					y = y - x;
				}
			}
			
			// 2. Swap the values of x and y.
			
			//      This is done in the while loop above. If num1 > num2, we subtract num2 from num1.
			
			// 3. Repeat steps 1 and 2 until x = 0.
			
			//      This is done in the while loop above. The loop continues until either num1 or num2 is 0.
			
			// 4. y is the greatest common divisor of the two numbers.
			
			//      This is done in the while loop above. When the loop ends, the greatest common divisor is the non-zero number.
			
			System.out.println("Greatest common divisor: " + Math.max(num1, num2));
			
			// 5. Ask the user if they want to continue.
			
			System.out.print("\nContinue (y/n)? ");
			choice = sc.nextLine();
			
			// 6. If the user enters 'y', repeat the process.
			// 7. If the user enters 'n', exit the program.
			if (choice.equalsIgnoreCase("y")) {
				continue;
			} else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Exiting program.");
				break;
			}
			// 8. If the user enters anything else, display an error message and exit the program.
			if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("Invalid input. Exiting program.");
				break;
			}
		}
		
		
	}
	
}
