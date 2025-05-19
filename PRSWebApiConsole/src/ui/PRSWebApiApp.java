package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.PRSdb;
import model.User;
import util.ConsoleUtil;

public class PRSWebApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				util.ConsoleUtil.printHeader("Welcome to the PRS Console app!","-");
			

				// create a command menu

				
				String choice = "";
				
				List<User> users = new ArrayList<>();
				
		        // loop until the user exits
		        while (!choice.equalsIgnoreCase("5")) {
		        	String menu = "1 - Show all users\n" + "2 - Add a user\n" + "3 - Edit a user\n" + "4 - Delete a user\n" + "5 - Exit program";
		    		System.out.println(menu);
		            choice = ConsoleUtil.promptString("Enter command: ");
		            if (choice.equalsIgnoreCase("1")) {
		        		List<User> users2 = PRSdb.getAllUsers();
		        		System.out.println("All Users:");
		        		for (User u: users2) {
		        			System.out.println(u);
		        		}
		        		
		            } else if (choice.equalsIgnoreCase("2")) {
		        		System.out.println("Add a user:");
                    	String username = ConsoleUtil.promptString("Username: ");
                    	String password = ConsoleUtil.promptString("Password: ");
                    	String firstName = ConsoleUtil.promptString("First Name: ");
                    	String lastName = ConsoleUtil.promptString("Last Name: ");
                    	String phone = ConsoleUtil.promptString("Phone: ");
                    	String email = ConsoleUtil.promptString("Email: ");
                    	int reviewer = ConsoleUtil.promptBoolean("Is Reviewer? (y/n): ");
                    	int admin = ConsoleUtil.promptBoolean("Is Admin? (y/n): ");
                        User u = new User(0, username, password, firstName, lastName, phone, email, 0, 0);
		        		if(PRSdb.create(u)) {
		        			System.out.println("User created!");
		        		}
		        		else {
		        			System.out.println("Error creating user.");
		        		}
		        		
		            } else if (choice.equalsIgnoreCase("3")) {
		        		System.out.println("Edit a user:");
		        		int id = ConsoleUtil.promptInt("Enter the id of the user to edit: (1-" + users.size() + "): ");
                        String username = ConsoleUtil.promptString("Username: ");
                        String password = ConsoleUtil.promptString("Password: ");
                        String firstName = ConsoleUtil.promptString("First Name: ");
                        String lastName = ConsoleUtil.promptString("Last Name: ");
                        String phone = ConsoleUtil.promptString("Phone: ");
                        String email = ConsoleUtil.promptString("Email: ");
                        int reviewer = ConsoleUtil.promptBoolean("Is Reviewer? (y/n): ");
                        int admin = ConsoleUtil.promptBoolean("Is Admin? (y/n): ");
                        User u = new User(id, username, password, firstName, lastName, phone, email, 0, 0);

		        		if(PRSdb.update(u)) {
		        			System.out.println("User updated!");
		        		}
		        		else {
		        			System.out.println("Error creating user.");
		        		}
		        		
		            } else if (choice.equalsIgnoreCase("4")) {
		                System.out.println("Dropping an item");
		                ;
		        		if(PRSdb.delete(ConsoleUtil.promptInt("Enter the id of the user to delete: (1-" + users.size() + "): "))) {
		        			System.out.println("User deleted!");
		        		}
		        		else {
		        			System.out.println("Error creating user.");
		        		}
		            } else if (choice.equalsIgnoreCase("5")) {
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
			


			
		        
		        System.out.println("Goodbye!");
		        
		        sc.close();
			}

		

	}


