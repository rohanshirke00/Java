package basicCodingQuestion;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
//		8) Write a Program to Multiply two decimal Numbers entered by User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter 2nd number : ");
		float num2 = sc.nextFloat();
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
	}

}
