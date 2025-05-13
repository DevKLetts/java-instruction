package ui;

import util.ConsoleUtil;
import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleUtil.printHeader("Welcome to Array Lists!");
		
		List<Double> prices = new ArrayList<>();
		
		prices.add(1.99);
		prices.add(2.99);
		prices.add(3.99);
		prices.add(4.99);
		
		System.out.println(prices);
		
		
		
		System.out.println("Bye");
	
		
		
	}

}
