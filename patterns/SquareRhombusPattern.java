package patterns;

import java.util.Scanner;

public class SquareRhombusPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (must be integer) : ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			// 1st part stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// 2nd part stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			// 1st part stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// spaces
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}

			// 2nd part stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
