import java.util.Scanner;
public class JaveIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//weird odd numbers
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		int n = Integer.parseInt(sc.nextLine());
	
		for (int i = 1; i < n; i++) {		
			if (i % 2 != 0 && i <= 3) {
				System.out.println(i + "Weird");
			} else if (i % 2 == 0 && i >= 2 && i <= 5) {
				System.out.println(i + "Not Weird");
			} else if (i % 2 != 0 && i > 0) {
				System.out.println(i + "Weird");
			} else if (i % 2 == 0 && i > 6 && i < 21) {
				System.out.println(i + "Weird");
			} else if (i % 2 == 0 && i > 20) {
				System.out.println(i + "Not Weird");
			}
		
	}
		
	}

}
