import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nWelcome to the Letter Grade Converter!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter numerical grade: ");
		int letterGrade = Integer.parseInt(sc.nextLine());
		
		// evaluate letterGrade to determine Letter Grade (A, B, C, D, F)
		String grade = "";
		if (letterGrade >= 88) {
			grade = "A";
		} else if (letterGrade >= 80 && letterGrade <= 87) {
			grade = "B";
		} else if (letterGrade >= 67 && letterGrade <= 79) {
			grade = "C";
		} else if (letterGrade >= 60 && letterGrade <= 67) {
			grade = "D";
		} else if (letterGrade <= 59) {
			grade = "F";
		} else {
			grade = "ERR";
		}
		
		System.out.println("Letter grade: " + grade);
		System.out.print("\nContinue (y/n)? ");
		choice = sc.nextLine();
		
	}

        System.out.println("Bye");
        sc.close();
    }
} // End of main method
