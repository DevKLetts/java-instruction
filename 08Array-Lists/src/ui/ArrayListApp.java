package ui;


import util.ConsoleUtil;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

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
		
		
		System.out.println("Remove element 1");
		prices.remove(1);
		System.out.println(prices);
		
		
		System.out.println("Bye");
	
		//Create a list of movies
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "The Shawshank Redemption", 1994, "R", "Frank Darabont"));
		movies.add(new Movie(2, "The Godfather", 1972, "R", "Francis Ford Coppola"));
		movies.add(new Movie(3, "Finding Nemo", 2003, "G", "Andrew Stanton, Lee Unkrich"));
		
		ConsoleUtil.printHeader("Movie List");
		for (Movie m : movies) {
			System.out.println(m);
		}
		
		ConsoleUtil.printHeader("Movie List - sorted");
		movies.sort(null);
		for (Movie m : movies) {
			System.out.println(m);
		}
	}

}
