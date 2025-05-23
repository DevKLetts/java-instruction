package model;

public class Movie implements Comparable<Movie> {

	// Fields
	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;

	
	// Constructor
	public Movie(int id, String title, int year, String rating, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}

	public Movie() {
		super();
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", year=" + year + ", rating=" + rating + ", director=" + director;
	}

	@Override
	public int compareTo(Movie o) {
		if (o instanceof Movie) {
			Movie movie = (Movie) o;
			return this.title.compareTo(movie.getTitle());
		}	
		return 0;
	}

		
	
}
