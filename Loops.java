import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		//hailstone();
		excersize();

		/*int x = 1; // start
		while (x <= 100) {  // stopping condition
			System.out.println(x); //loop action
			x++;
		}

		for (int i=1; i <= 100; i++) {
			System.out.println(i);
		}

		//after
		int z = 45;
		while (z >= 20) {
			System.out.println(z);
			z = z - 5;
		}

		for (int i = 24; i <= 68; i = i + 2) {
			System.out.println(i);
		}*/

	}
	
	public static void hailstone() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = reader.nextInt();
		while (n != 1) {
			if (n%2 == 1) {
				n = n*3 +1;
				System.out.println(n);
			}
			if (n%2 == 0) {
				n = n/2;
				System.out.println(n);
			}
		}
		
	
	}

	public static void excersize() {
		Scanner reader = new Scanner(System.in);

		final double e = 2.72;
		int exponent;
		System.out.println("Enter number: ");
		exponent = reader.nextInt();
		double total = 1;
		for (int i = exponent; i > 0; i--) {
			total = total * e;
			System.out.println(total);
		}

		double x = Math.exp(exponent);
		System.out.println("Computer Calculation: " + x);
	}

}