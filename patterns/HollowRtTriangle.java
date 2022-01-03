package patterns;

import java.util.Scanner;

public class HollowRtTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (must be integer) : ");
		int n = sc.nextInt();

		System.out.println("Hollow Right Angle Triangle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Hollow Inverted Right Angle Triangle");	
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == j || j == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
