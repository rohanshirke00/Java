package ifElse;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
//		1) Write a Program to Check Whether Number is Even or Odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is even or odd : ");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is Even.");
		}
		else {
			System.out.println("Number is Odd.");
		}
	}

}