package forLoop;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
//		14) Write a Program to Display Prime Numbers Between
//		Two Intervals (entered by user)
//		Example:
//		Enter two numbers: 0 20
//		Prime numbers between 0 and 20 are:
//		2 3 5 7 11 13 17 19
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers to print all prime numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i,x;
		for(x=a+1; x<b; x++) {
			for(i=2; i<x; i++)
				if(x%i==0)
					break;
			if(x==i)
				System.out.print(x+" ");
		}
	}

}
