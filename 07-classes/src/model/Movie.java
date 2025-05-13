package model;

public class Movie {

		// id, title, year, rating, director
	    private int id;
	    private String title;
	    private int year;
	    private double rating;
	    private String director;

		public Movie(int id, String title, int year, double rating, String director) {
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

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}


		
}
