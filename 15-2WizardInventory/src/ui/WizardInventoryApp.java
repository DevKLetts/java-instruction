package ui;
import java.util.ArrayList;
import java.util.List;

import model.Items;
import util.ConsoleUtil;
import java.util.Scanner;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ConsoleUtil.printHeader("The Wizard Inventory game");
		System.out.println("COMMAND MENU");
		
		// create a command menu
		String menu = "show - Show all items\n" + "grab - Grab an item\n" + "edit = Edit an item\n" + "drop - Drop an item\n" + "exit - Exit program";
		System.out.println(menu);
		
		// create the array for the inventory
		List<Items> inventory = new ArrayList<>();
		
		//read the command
		String choice = "";
			choice = ConsoleUtil.promptString("Enter command: ");
			

		inventory.add(new Items(sc.nextLine()));
		
	
        // loop until the user exits
        while (!choice.equalsIgnoreCase("exit")) {
            choice = ConsoleUtil.promptString("Enter command: ");
            if (choice.equalsIgnoreCase("show")) {
                System.out.println("Showing all items");
                for (int i = 0; i < inventory.size(); i++) {
                    System.out.println((i + 1) + ". " + inventory.get(i));
                }

            } else if (choice.equalsIgnoreCase("grab")) {
                System.out.println("Grabbing an item\n");
                inventory.add(new Items(sc.nextLine()));
            } else if (choice.equalsIgnoreCase("edit")) {
                System.out.println("Editing an item");
                int index = ConsoleUtil.promptInt("Enter the index of the item to edit (1-" + inventory.size() + "): ") - 1;
                String newItem = ConsoleUtil.promptString("Enter the new item: ");
                inventory.add(index,new Items(sc.nextLine()));
            } else if (choice.equalsIgnoreCase("drop")) {
                System.out.println("Dropping an item");
                inventory.remove(ConsoleUtil.promptInt("Enter the index of the item to drop (1-" + inventory.size() + "): ") - 1);
            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program");
            } else {
                System.out.println("Invalid command. Please try again.");
            }
            
        }
        
        System.out.println("Goodbye!");
        
        sc.close();
	}
	
}


