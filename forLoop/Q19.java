package forLoop;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// Q 17 Write a Program to Display all Factors of a Number entered by User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to display all it factors : ");
		int n = sc.nextInt();
		System.out.print("Factors of "+n+ " are : ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
