import java.util.Scanner;
public class TableOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
		System.out.println("Welcome to the Squares and Cubes table");
        System.out.println("Enter an integer: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Number\tSquared\tCubed");
        System.out.println("======\t=======\t=====");
		for (int i = 1; i <= num; i++) {
			System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
		}
		System.out.println("\nWould you like to continue (y/n)? ");
		choice = sc.nextLine();
		
		
		
		}
		
		
		
	}

}
