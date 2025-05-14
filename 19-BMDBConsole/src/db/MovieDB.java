package db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class MovieDB {
	// See P. 635 for Full ProductDB example
	
	// Connect to a MySQL database
	// JDBC URL, username and password of MySQL server
	
	private static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb"; 
		String username = "bmdb_user"; 
		String password = "sesame";
		Connection conn = DriverManager.getConnection( dbURL, username, password); 
		
		return conn;
	}


	// Create a statement
	
	
		
	// Create a movie table
	
	
	// Get all the movies from the movie table
	// SELECT * FROM Movie
	

	
	public static List<Movie> getAll() {
        List<Movie> movies = new ArrayList<>();
        try (Connection connection = getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM Movie")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("Id"));
                movie.setTitle(rs.getString("Title"));
                movie.setYear(rs.getInt("Year"));
                movie.setRating(rs.getString("Rating"));
                movie.setDirector(rs.getString("Director"));
                movies.add(movie);
            }
        } catch (SQLException sqle) {
        	System.err.println(sqle);        }
        return movies;
    }
	
	// Insert a movie into the table
	// INSERT INTO Movie (Title, Genre, Year, Rating, Director) VALUES (?, ?, ?, ?, ?)
	
	public static boolean create(Movie m) {
		boolean success = false;
		String sql = "INSERT INTO Movie (Title, Year, Rating, Director) " + "VALUES (?, ?, ?, ?)";
		try (Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql)) { 
			ps.setString(1, m.getTitle()); 
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
			success = true;
		} catch (SQLException sqle) { 
			System.err.println(sqle); 
		}
		return success; 

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
