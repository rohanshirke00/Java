package forLoop;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		5) Write a Program to Display Fibonacci Series upto
//		certain number n (n is entered by user)
//		Example: n=100
//		Output:
//		Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find Fibonacci series upto certain number input : ");
		int number = sc.nextInt();
		int a = 0, b = 1, c = 0;
		if(number==0) {
			System.out.print(a);
		}
		else {
			System.out.print(a + "  " + b + "  ");
			c = a + b;
			while(c <= number) {
				System.out.print(c + "  ");
				a = b;
				b = c;
				c = a + b;
			}
			
		}
		
	}

}