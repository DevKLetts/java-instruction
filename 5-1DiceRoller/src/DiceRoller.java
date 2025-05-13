import util.ConsoleUtil;
public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diceRoll = 0;
		int diceRoll2 = 0;
		int diceTotal = 0;

		String success = "Y";
		while (success.equalsIgnoreCase("Y")) {
			{
				System.out.println("Welcome to the Dice Roller Game!\n");

				String game = "y";
				while (game.equalsIgnoreCase("y")) {
					System.out.println();
					diceRoll = (int) (Math.random() * 6) + 1;
					diceRoll2 = (int) (Math.random() * 6) + 1;

					System.out.println("Die 1: " + diceRoll + "\n");
					System.out.println("Die 2: " + diceRoll2 + "\n");
					System.out.println("Total: " + (diceRoll + diceRoll2) + "\n");

					diceTotal = diceRoll + diceRoll2;

					if (diceRoll == 1 && diceRoll2 == 1) {
						success = "true";
						System.out.println("Snake eyes!");
					}
					if (diceRoll == 6 && diceRoll2 == 6) {
						success = "true";
						System.out.println("Boxcars!");
					}
					game = util.ConsoleUtil.promptString("Roll again? (Y/N)");

				}
				
			}
		}
	}
}
