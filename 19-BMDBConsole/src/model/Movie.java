package model;

public class Movie {

	// Fields
	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;
	private String genre;
	
	// Constructor
	public Movie(int id, String title, int year, String rating, String director, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
		this.genre = genre;
	}
	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
		
		
	
}
