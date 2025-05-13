package ui;
import java.util.Arrays;

import util.ConsoleUtil; 	

public class ArraysApp {

	public static void main(String[] args) {
		ConsoleUtil.printHeader("Welcome to the Arrays App!", "+");
		
		//array of integers
		int[] numbers = new int[5];
		numbers[0] = 7;
		numbers[1] = 35;
		numbers[2] = 21;
		numbers[3] = -7;
		numbers[4] = 95;
		
		//System.out.println(numbers);  Can't pass an array into a print statement
		
		for (int n: numbers) {
			System.out.println(n);
		}
			
		// another array of integers
		int[] numbers2 = {56, 32, 17, 4, 256, 1};
		
		for (int n: numbers) {
			System.out.println(n);
		}
		
		//numbers[5] = 40 -> cannot append numbers to an array. out of bounds exception
		
		int[] numbers3 = {1,2,3,4,5,6,7,8,9,10};

		ConsoleUtil.printHeader("Even Numbers");
		// print even numbers
		for (int i = 1; i < numbers3.length; i += 2) {
			System.out.println(numbers3[i]);
		}
		
		ConsoleUtil.printHeader("Even Numbers - backwards");
		// print even numbers
		for (int i = numbers3.length-1; i >= 0; i -= 2) {
			System.out.println(numbers3[i]);
		}
		
		Arrays.sort(numbers);
		ConsoleUtil.printHeader("Sorted Numbers:");
		for (int n: numbers) {
			System.out.println(n);
		}
		
		System.out.println();
		
		System.out.println("Bye!");
	}
	
}
