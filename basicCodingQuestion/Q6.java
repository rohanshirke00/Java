package basicCodingQuestion;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
//		6) Write a Program to Swap Two Numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		System.out.println("your 1st number is num1 = " + num1 + " and 2nd number is num2 = " + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping num1 and num2");
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
	}

}