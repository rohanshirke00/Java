package forLoop;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

//		10) Write a Program to Calculate Power of a Number using inbuilt pow() function
//		by taking two inputs from users as Base and exponent respectively
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		double base = sc.nextDouble();
		System.out.print("Enter the Power : ");
		double exponent = sc.nextDouble();
		
		double result = Math.pow(base, exponent);
		System.out.println("The Power of a number with base \'"+base+"\' and exponent \'"+exponent+
				"\' is " + result);
	}

}
