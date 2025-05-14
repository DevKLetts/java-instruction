package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.MovieDB;
import model.Movie;
import util.ConsoleUtil;

public class BMDBConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		util.ConsoleUtil.printHeader("Welcome to the BMDB Console app!","-");
	

		// create a command menu

		
		String choice = "";
		
		List<Movie> movies = new ArrayList<>();
		
        // loop until the user exits
        while (!choice.equalsIgnoreCase("5")) {
        	String menu = "1 - Show all movies\n" + "2 - Add a movie\n" + "3 - Edit a movie\n" + "4 - Delete a movie\n" + "5 - Exit program";
    		System.out.println(menu);
            choice = ConsoleUtil.promptString("Enter command: ");
            if (choice.equalsIgnoreCase("1")) {
        		List<Movie> movies2 = MovieDB.getAll();
        		System.out.println("All Movies:");
        		for (Movie m: movies2) {
        			System.out.println(m);
        		}
        		
            } else if (choice.equalsIgnoreCase("2")) {
        		System.out.println("Add a movie:");
        		String title = ConsoleUtil.promptString("Title: ");
        		int year = ConsoleUtil.promptInt("Year: ");
        		String rating = ConsoleUtil.promptString("Rating: ");
        		String director = ConsoleUtil.promptString("Director: ");
        		Movie m = new Movie(0, title, year, rating, director);
        		if(MovieDB.create(m)) {
        			System.out.println("Movie created!");
        		}
        		else {
        			System.out.println("Error creating movie.");
        		}
        		
            } else if (choice.equalsIgnoreCase("3")) {
        		System.out.println("Edit a movie:");
        		int id = ConsoleUtil.promptInt("Id: ");
        		String title = ConsoleUtil.promptString("Title: ");        		
        		int year = ConsoleUtil.promptInt("Year: ");
        		String rating = ConsoleUtil.promptString("Rating: ");
        		String director = ConsoleUtil.promptString("Director: ");

        		if(MovieDB.update(m)) {
        			System.out.println("Movie updated!");
        		}
        		else {
        			System.out.println("Error creating movie.");
        		}
        		
            } else if (choice.equalsIgnoreCase("4")) {
                System.out.println("Dropping an item");
                ;
        		if(MovieDB.delete(ConsoleUtil.promptInt("Enter the id of the movie to delete: (1-" + movies.size() + "): "))) {
        			System.out.println("Movie deleted!");
        		}
        		else {
        			System.out.println("Error creating movie.");
        		}
            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program");
            } else {
                System.out.println("Invalid command. Please try again.");
            }
            
        }

		// Create a movie table
		
		
		// Get all the movies from the movie table
		// SELECT * FROM Movie
		

		// Insert a movie into the table
		// INSERT INTO Movie (Title, Genre, Year, Rating, Director) VALUES (?, ?, ?, ?, ?)
		
		/*
		 * System.out.println("Add a movie:"); String title =
		 * ConsoleUtil.promptString("Title: "); int year =
		 * ConsoleUtil.promptInt("Year: "); String rating =
		 * ConsoleUtil.promptString("Rating: "); String director =
		 * ConsoleUtil.promptString("Director: "); Movie m = new Movie(0, title, year,
		 * rating, director); if(MovieDB.create(m)) {
		 * System.out.println("Movie created!"); } else {
		 * System.out.println("Error creating movie."); }
		 */
				
		
		// SKIP - Update a movie
		
		
		// DELETE a movie  p. 635
		
		//movies.remove(ConsoleUtil.promptInt("Enter the id of the movie to delete: (1-" + movies.size() + "): ") -1);
	

		
		
		
		// Get a movie by ID   p. 637
		// SELECT * FROM Movie WHERE Id=?
		
		// Get a movie by title
		// SELECT * FROM Movie WHERE Title=?
		
		// Get a movie by genre
		// SELECT * FROM Movie WHERE Genre=?
		
		// Get a movie by year
		// SELECT * FROM Movie WHERE Year=?
		
		// Get a movie by rating
		// SELECT * FROM Movie WHERE Rating=?
		
		// Get a movie by director
		// SELECT * FROM Movie WHERE Director=?
	
        
        System.out.println("Goodbye!");
        
        sc.close();
	}

}
