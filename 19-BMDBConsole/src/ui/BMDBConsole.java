package ui;
import java.util.List;

import db.MovieDB;
import model.Movie;
import util.ConsoleUtil;

public class BMDBConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		util.ConsoleUtil.printHeader("Welcome to the BMDB Console app!","-");
		

		// Create a movie table
		
		
		// Get all the movies from the movie table
		// SELECT * FROM Movie
		
		List<Movie> movies = MovieDB.getAll();
		System.out.println("All Movies:");
		for (Movie m: movies) {
			System.out.println(m);
		}
		
		// Insert a movie into the table
		// INSERT INTO Movie (Title, Genre, Year, Rating, Director) VALUES (?, ?, ?, ?, ?)
		
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
				
		
		// SKIP - Update a movie
		
		
		// Get a movie by ID
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
		
	}

}
