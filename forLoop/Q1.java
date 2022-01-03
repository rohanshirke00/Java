package forLoop;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		//Find the sum of N numbers.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number upto which you want to find sum of N : ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=number; i++) {
			System.out.println(sum + " + " + i + " = " + (sum  + i));
			sum += i;
		}
		System.out.println("The sum of N is " + sum);
		
//		method 2
//		while(number!=0) {
//			sum = sum + number;
//			number--;
//		}
//		System.out.println("The sum of N is " + sum);
	}

}