package patterns;

import java.util.Scanner;

public class HollowButterflyPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (must be integer) : ");
		int n = sc.nextInt();

		System.out.println("Hollow Butterfly Pattern 19");

		// upper part
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// lower part
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
