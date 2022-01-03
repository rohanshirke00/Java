package basicCodingQuestion;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
//		7) Write a Program to Find ASCII Value of a Character
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to find its ASCII value : ");
		char ch = sc.next().charAt(0);
		int x = ch;
		System.out.println("The ASCII value of \'" + ch + "\' is " + x);
			
 	}

}