import java.util.Random;

import util.ConsoleUtil;

public class GuessingGame {
	
	private static int guess = 0;
	private static int randomNumber = 0;

	private static final int MIN = 1;
	private static final int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome message
		ConsoleUtil.printHeader("Welcome to the Guessing Game", "+");
		// Game variables


		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number between " + MIN + " and " + MAX + " Can you guess what it is?");
			// Generate a random number between 1 and 100
			randomNumber = getRandomNumber();
			System.out.println("DEBUG: The random number is: " + randomNumber);
			int attempts = 0;
			// Loop until the user guesses the correct number or runs out of attempts
		while (guess != randomNumber) {
			guess = ConsoleUtil.promptInt("Enter your guess: ", MIN, MAX);
			attempts++;
			int diff = guess - randomNumber;
				if (diff > 10) {
					System.out.println("Way too high! Guess again."); 
				} else if (diff > 0 ){
					System.out.println("Too high! Guess again.");
				} else if (diff < -10) {
					System.out.println("Way too low! Guess again.");
				} else if (diff < 0) {
					System.out.println("Too low! Guess again.");
				} 
				else {
					displayWinnerMessage(attempts);
				}

		}
		}
		choice = ConsoleUtil.promptString("Do you want to play again? (y/n): ");
	}
	
	private static void displayWinnerMessage(int guessCounter) {
		System.out.println("You guessed the number in " + guessCounter + " attempts.");

		if (guess == randomNumber && guessCounter >= 3 && guessCounter <= 7) {
			System.out.println("Not too bad! You've got some potential The correct number was: " + randomNumber);
		} else if (guess == randomNumber && guessCounter <= 3) {
			System.out.println("Great work! You are a mathematical wizard! The correct number was: " + randomNumber);
		} else if (guess == randomNumber && guessCounter > 7) {
			System.out.println("What took you so long. Maybe you should take lessons. The correct number was: " + randomNumber);
		}
	}
	
	private static int getRandomNumber() {
		int randomNumber = (int) (Math.random() * MAX) + 1;
		return randomNumber;
	}
}
