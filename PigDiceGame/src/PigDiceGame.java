import java.util.Scanner;
import java.util.Random;
public class PigDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int playerScore = 0;
		int roundScore = 0;
		String choice = "y";
		System.out.println("Welcome to the Pig Dice Game!");
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Roll the dice (y/n)? ");
			choice = sc.nextLine();
			if (choice.equalsIgnoreCase("y")) {
				int die = rand.nextInt(6) + 1;
				System.out.println("You rolled a " + die);
				if (die == 1) {
					System.out.println("You lose all your points for this round!");
					roundScore = 0;
				} else {
					roundScore += die;
					System.out.println("Round score: " + roundScore);
				}
			} else {
				playerScore += roundScore;
				roundScore = 0;
			}

			if (playerScore >= 100) {
				System.out.println("Congratulations! You win!");
				break;
			}
			System.out.println("Current score: " + playerScore);
			System.out.print("Continue playing (y/n)? ");
			choice = sc.nextLine();
			if (choice.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing! Your final score is: " + playerScore);
				sc.close();
				break;
			}

			
		}
			
	}

}
