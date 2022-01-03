package patterns;

import java.util.Scanner;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the breadth of rectangle (must be integer) : ");
		int m = sc.nextInt();
		System.out.print("Enter the length of rectangle (must be integer) : ");
		int n = sc.nextInt();

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == m || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
