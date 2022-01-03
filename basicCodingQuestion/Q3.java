package basicCodingQuestion;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		//3)Write a Program to Add Two Integer Numbers Entered by User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	}

}
