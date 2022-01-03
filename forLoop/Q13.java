package forLoop;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
//		13) Write a Program to Check Whether a Number is Prime or Not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int i;
		for(i=2; i<num; i++) {
			if(num%i==0)
				break;
		}
		if(num==i) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	
	}
	
}
