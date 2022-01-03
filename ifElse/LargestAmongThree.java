package ifElse;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		
//		3) Write a Program to Find Largest Number Among Three Numbers entered by users
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter 3rd number : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Largest number is " + num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("Largest number is " + num2);
		}
		else {
			System.out.println("Largest number is " + num3);
		}
		
		//Method 2 using Ternay operator
//		int result = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
//		System.out.println("Largest among three number is " + result);
		
	}

}