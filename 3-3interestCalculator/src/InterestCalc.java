import java.util.Scanner;


public class InterestCalc {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Interest Calculator!");
	
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
    	
    
	System.out.print("Enter the loan amount: ");
	double loan = Double.parseDouble(sc.nextLine());
	System.out.print("Enter interest rate: ");
	double rate = Double.parseDouble(sc.nextLine());
	double interest = loan * rate;
	double total = loan + interest;
	System.out.println("Total laon amount: " + loan);
	System.out.println("Interest rate:    " + rate);
	System.out.println("Interest:      " + interest);
	System.out.println("Total amount:   " + total);
	
	System.out.print("\nContinue (y/n)? ");
    choice = sc.nextLine();
	
    }	
}}
