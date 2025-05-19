package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class PRSdb {

	// See P. 635 for Full ProductDB example
	
	// Connect to a MySQL database
	// JDBC URL, username and password of MySQL server
	
	private static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs"; 
		String username = "prsuser"; 
		String password = "sesame";
		Connection conn = DriverManager.getConnection( dbURL, username, password); 
		
		return conn;
	}


	// Get all the movies from the movie table
	// SELECT * FROM Movie
	
	public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
                PreparedStatement ps = connection.prepareStatement("SELECT * FROM User")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("Id"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setFirstName(rs.getString("FirstName"));
                user.setLastName(rs.getString("LastName"));
                user.setPhone(rs.getString("PhoneNumber"));
                user.setEmail(rs.getString("Email"));
                user.setReviewer(rs.getInt("Reviewer"));
                user.setAdmin(rs.getInt("Admin"));
                users.add(user);
            }
        } catch (SQLException sqle) {
        	System.err.println(sqle);        }
        return users;
    }
	
	// Insert a movie into the table
	// INSERT INTO Movie (Title, Genre, Year, Rating, Director) VALUES (?, ?, ?, ?, ?)
	
	public static boolean create(User u) {
		boolean success = false;
		String sql = "INSERT INTO User (Username, Password, First Name, Last Name, Phone, Email, isReviewer, isAdmin) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql)) { 
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getFirstName());
            ps.setString(4, u.getLastName());
            ps.setString(5, u.getPhone());
            ps.setString(6, u.getEmail());
            ps.setInt(7, u.getReviewer());
            ps.setInt(8, u.getAdmin());
            ps.executeUpdate();
			success = true;
		} catch (SQLException sqle) { 
			System.err.println(sqle); 
		}
		return success; 

	}
	// SKIP - Update a movie
	// UPDATE Movie SET Title=?, Genre=?, Year=?, Rating=?, Director=? WHERE Id=?
	public static boolean update(User u) {
		boolean success = false;
		String sql = "UPDATE User SET Username=?, Password=?, First Name=?, Last Name=?, Phone=?, Email=?, isReviewer=?, isAdmin=? WHERE Id=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhone());
			ps.setString(6, u.getEmail());
			ps.setInt(7, u.getReviewer());
			ps.setInt(8, u.getAdmin());
			ps.setInt(9, u.getId());
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
		String sql = "DELETE FROM User WHERE Id=?";
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
	public static User getByID(int id) {
		User user = null;
		String sql = "SELECT * FROM User WHERE Id=?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("Id"));
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setFirstName(rs.getString("FirstName"));
				user.setLastName(rs.getString("LastName"));
				user.setPhone(rs.getString("Rating"));
				user.setEmail(rs.getString("Director"));
				user.setReviewer(rs.getInt("Reviewer"));
				user.setAdmin(rs.getInt("Admin"));
				}
		}
		catch (SQLException sqle) {
			System.err.println(sqle);
		}
		return user;
	}
	
}
