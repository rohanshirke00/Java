package patterns;

import java.util.Scanner;

public class DifferentShapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (must be integer) : ");
		int n = sc.nextInt();
		
		System.out.println("Parallegoram");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Rhombus");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println();

		System.out.println("Square");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		System.out.println();

		System.out.println("Rectangle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
