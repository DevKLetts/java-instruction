import java.util.Scanner;
import java.io.IOException;

public class FormattingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// constants
		final int MONTHS_IN_YEAR = 12;
		final double SALES_TAX = .0675;
		
		
		// Math Class
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Generating a random number: \n");
			double r1 = Math.random();
			double r2 = Math.rint(r1);
			System.out.print(r1 + "," + r2);
			System.out.println("die rolll");
			int dieRoll = (int)(Math.random() * 6) + 1;
			System.out.println("die roll: " + dieRoll);
			System.out.print("\nContinue (y/n)? ");
			choice = sc.nextLine();
			
			System.out.println("Convert to Currency: ");
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			
			
		}
		

	}
}
