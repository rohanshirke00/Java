package forLoop;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
//		Q 17 Write a Program to Display all prime Factors of a Number entered by User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to display all its prime factors : ");
		int n = sc.nextInt();
		int i;
		for(i=2; n>1; i++) {
			while(n%i==0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		
	}

}
