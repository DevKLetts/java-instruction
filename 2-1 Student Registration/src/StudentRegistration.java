import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Student Registration System!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		int yearOfBirth = Integer.parseInt(sc.nextLine());
		
		System.out.println("Welcome " + firstName+ " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + yearOfBirth);		
		
	}
	
}
