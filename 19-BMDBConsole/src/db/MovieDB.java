package db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Movie;
import util.ConsoleUtil;

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
	// UPDATE Movie SET Title=?, Genre=?, Year=?, Rating=?, Director=? WHERE Id=?
	public static boolean update(Movie m) {
		boolean success = false;
		String sql = "UPDATE Movie SET Title=?, Year=?, Rating=?, Director=? WHERE Id=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.setInt(5, m.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}
		return success;
	}
	
	// Delete a movie
	// DELETE FROM Movie WHERE Id=?
	public static boolean delete(int id) {
		boolean success = false;
		String sql = "DELETE FROM Movie WHERE Id=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
			success = true;
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}
		return success;
	}
	
	
	
	// Get a movie by ID
	// SELECT * FROM Movie WHERE Id=?
	public static Movie get(int id) {
		Movie movie = null;
		String sql = "SELECT * FROM Movie WHERE Id=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				movie = new Movie();
				movie.setId(rs.getInt("Id"));
				movie.setTitle(rs.getString("Title"));
				movie.setYear(rs.getInt("Year"));
				movie.setRating(rs.getString("Rating"));
				movie.setDirector(rs.getString("Director"));
			}
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}
		return movie;
	}
	
	// Get a movie by title
	// SELECT * FROM Movie WHERE Title=?
	public static Movie getByTitle(String title) {
		Movie movie = null;
		String sql = "SELECT * FROM Movie WHERE Title=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, title);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				movie = new Movie();
				movie.setId(rs.getInt("Id"));
				movie.setTitle(rs.getString("Title"));
				movie.setYear(rs.getInt("Year"));
				movie.setRating(rs.getString("Rating"));
				movie.setDirector(rs.getString("Director"));
			}
		} catch (SQLException sqle) {
			System.err.println(sqle);
		}
		return movie;
	}
	
	// Get a movie by genre
	// SELECT * FROM Movie WHERE Genre=?
	public static List<Movie> getByGenre(String genre) {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie WHERE Genre=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, genre);
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
			System.err.println(sqle);
		}
		return movies;
	}
	
	// Get a movie by year
	// SELECT * FROM Movie WHERE Year=?
	public static List<Movie> getByYear(int year) {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie WHERE Year=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, year);
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
			System.err.println(sqle);
		}
		return movies;
	}
	
	// Get a movie by rating
	// SELECT * FROM Movie WHERE Rating=?
	public static List<Movie> getByRating(String rating) {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie WHERE Rating=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, rating);
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
			System.err.println(sqle);
		}
		return movies;
	}
	
	// Get a movie by director
	// SELECT * FROM Movie WHERE Director=?
	public static List<Movie> getByDirector(String director) {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie WHERE Director=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, director);
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
			System.err.println(sqle);
		}
		return movies;
	}
	
	
	
	
}
