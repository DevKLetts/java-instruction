package ui;
import util.ConsoleUtil;
import java.text.NumberFormat;
import java.util.Locale;

public class SalesReportApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] sales = {
				{1540.0, 2010.0, 2450.0, 1845.0}, // Region 1
				{1130.0, 1168.0, 1847.0, 1491.0}, // Region 2
				{1580.0, 2305.0, 2710.0, 1284.0}, // Region 3
				{1105.0, 4102.0, 2391.0, 1576.0} // Region 4
				};
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

	
		util.ConsoleUtil.printHeader("The Sales Report application");
		
		System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Region", "Q1", "Q2", "Q3", "Q4");
		for (int i = 0; i < sales.length; i++) {
			System.out.printf("%-10s", (i + 1));
			for (int j = 0; j < sales[i].length; j++) {
				System.out.printf("%-15s", nf.format(sales[i][j]))  ;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sales by region:");	

		for (int i = 0; i < sales.length; i++) {
			double total = 0.0;
			for (int j = 0; j < sales[i].length; j++) {
				total += sales[i][j];
			}
			System.out.printf("%-10s%-15s\n", "Region " + (i + 1), nf.format(total));
		}
		
		System.out.println();
		System.out.println("Sales by quarter:");
		for (int j = 0; j < sales[0].length; j++) {
			double total = 0.0;
			for (int i = 0; i < sales.length; i++) {
				total += sales[i][j];
			}
			System.out.printf("%-4s%-3s\n", "Q" + (j + 1) + ":", nf.format(total));
		
		}
		
		System.out.println();

		double grandTotal = 0.0;
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				grandTotal += sales[i][j];
			}
		}
		System.out.printf("%-10s%-15s\n", "Total sales: ", nf.format(grandTotal));
		
	}

}
