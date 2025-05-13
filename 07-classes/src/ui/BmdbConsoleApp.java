package ui;

import model.Actor;
import model.Movie;
import util.ConsoleUtil;
import java.time.LocalDate;
import java.util.Scanner;
public class BmdbConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to the Bmdb Console Application!");
		System.out.println("This is a console application for the Bmdb application.");
		System.out.println("You can use this application to manage your movie database.");
		System.out.println("Please select an option from the menu below:");
		System.out.println("1. Add a movie");
		System.out.println("2. Remove a movie");
		System.out.println("3. Update a movie");
		System.out.println("4. Search for a movie");
		System.out.println("5. List all movies");
		System.out.println("6. Exit");
		System.out.println("Please enter your choice: ");
		Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();
		
	    
		
		Movie m1 = new Movie(1, "Inception", 2010, 8.8, "Christopher Nolan");
		Movie m2 = new Movie(2, "The Dark Knight", 2008, 9.0, "Christopher Nolan");
		Movie m3 = new Movie(3, "Interstellar", 2014, 8.6, "Christopher Nolan");
		Movie m4 = new Movie(4, "The Matrix", 1999, 8.7, "The Wachowskis");
		Movie m5 = new Movie(5, "The Shawshank Redemption", 1994, 9.3, "Frank Darabont");
		Movie m6 = new Movie(6, "The Godfather", 1972, 9.2, "Francis Ford Coppola");
		Movie m7 = new Movie(7, "Pulp Fiction", 1994, 8.9, "Quentin Tarantino");
		Movie m8 = new Movie(8, "The Lord of the Rings: The Return of the King", 2003, 8.9, "Peter Jackson");
		Movie m9 = new Movie(9, "Forrest Gump", 1994, 8.8, "Robert Zemeckis");
		
		/*switch (choice) {
			case 1:
				System.out.println("You have selected option 1: Add a movie");
				// Add a movie
				break;
			case 2:
				System.out.println("You have selected option 2: Remove a movie");
				// Remove a movie
				break;
			case 3:
				System.out.println("You have selected option 3: Update a movie");
				// Update a movie
				break;
			case 4:
				System.out.println("You have selected option 4: Search for a movie");
				// Search for a movie
				break;
			case 5:
				System.out.println("You have selected option 5: List all movies");
				// List all movies
				break;
			case 6:
				System.out.println("You have selected option 6: Exit");
				// Exit
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;

		}
		*/
		int id = ConsoleUtil.promptInt("Enter movie ID: ");
		String firstName = ConsoleUtil.promptString("Enter First Name: ");
		String lastName = ConsoleUtil.promptString("Enter Last Name: ");
		String gender = ConsoleUtil.promptString("Enter the gender: ");
		int month = ConsoleUtil.promptInt("Enter the month of birth: ", 1, 12);
		int day = ConsoleUtil.promptInt("Enter the day of birth: ", 1, 31);
		int year = ConsoleUtil.promptInt("Enter the year of birth: ", 1900, Integer.MAX_VALUE);
		LocalDate birthDate = LocalDate.of(year, month, day);
		
		Actor a1 = new Actor(id, firstName, lastName, gender, birthDate);
		System.out.println(a1);
		
		
		
	}

}
