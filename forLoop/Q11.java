package forLoop;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
//		11) Write a Program to Calculate Power of a Number
//		without using inbuilt pow() function by taking two
//		inputs from users as Base and exponent respectively
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = sc.nextInt();
		int power = 1;
		for(int i=1; i<=exponent; i++) {
			power = power * base;
		}
		System.out.println("The Power of a number with base \'"+base+"\' and exponent \'"+exponent+
				"\' is " + power);

	}

}
