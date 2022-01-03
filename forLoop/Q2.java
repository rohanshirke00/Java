package forLoop;

import java.util.Scanner;

public class Q2 {

	//	static int fact(int n) {
//			if(n == 0){
//			return 1;
//		}
//		else {
//			return (n * fact(n-1));
//		}
//	}
	
	public static void main(String[] args) {

		//Find factorial of given number.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to find its factorial : ");
		int number = sc.nextInt();
		int factorial = 1;
		for (int i=1; i<=number; i++) {
			System.out.println((factorial*i) + " = " + factorial + " * " + i);
			factorial *= i;
		}
		System.out.println(number + "! is " + factorial);
		
		//Method 2
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number to find its factorial : ");
//		int number = sc.nextInt();
//		int factorial = 1;
//		factorial = fact(number);
//		System.out.println("Factorial of " + number + " = " + factorial);
		
	}

}