package basicCodingQuestion;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
//		Write a program where the user is asked to enter two
//		integers (divisor and dividend) and the quotient and the
//		remainder of their division is computed.(Both divisor and
//		dividend should be integers.)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Divisor number : ");
		int num2 = sc.nextInt();
		float result = (float)num1 / num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("The perfect answer is " + result);
		System.out.println("Quotienet is " + quotient);
		System.out.println("Remainder is " + remainder);
	}

}