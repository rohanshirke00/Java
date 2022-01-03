package forLoop;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

//		9) Write a Program to display sum of all digits of a given Number N by user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers to calculate its sum of digits : ");
		int x = sc.nextInt();
		int sum=0,remainder;
		int temp = x;
		while(temp!=0) {
			remainder = temp%10;
			sum = sum + remainder;
			temp = temp/10;
		}
		System.out.println("Sum of all digits of " + x + " is " + sum);
	}

}
