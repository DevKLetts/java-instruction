import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {

			
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				// Declare and initialize variables
				double billAmount = 0;
				double tipPercent = 0;
				System.out.println("\nWelcome to the Tip Calculator!");
				NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
				
				// getting console input
				System.out.print("Cost of meal: $");
				billAmount = Double.parseDouble(sc.nextLine());
				tipPercent = 15;
				double tipAmount = billAmount * (tipPercent / 100);
				double totalAmount = billAmount + tipAmount;

				System.out.print("15%\n");
				System.out.println("Tip Amount: " + nf.format(tipAmount));
				System.out.println("Total Amount: " + nf.format(totalAmount) + "\n");
				
				tipPercent = 20;
				tipAmount = billAmount * (tipPercent / 100);
				totalAmount = billAmount + tipAmount;
				System.out.print("20%\n");
				System.out.println("Tip Amount: " + nf.format(tipAmount));
				System.out.println("Total Amount: " + nf.format(totalAmount) + "\n");
				
				System.out.print("25%\n");
				tipPercent = 25;
				tipAmount = billAmount * (tipPercent / 100);
				totalAmount = billAmount + tipAmount;
				System.out.println("Tip Amount: " + nf.format(tipAmount));
				System.out.println("Total Amount: " + nf.format(totalAmount) + "\n");
				
				
				System.out.print("\nContinue (y/n)? ");
				choice = sc.nextLine();

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
