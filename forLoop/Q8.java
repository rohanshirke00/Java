package forLoop;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		//8) Write a Program to Reverse a given Number N by user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = sc.nextInt();
		int result=0, r;
		int temp=x;
		while(temp!=0){
			r=temp%10;
			result=result*10+r;
			temp=temp/10;
		}
		System.out.println("Reverse of " + x + " is " + result);
	}

}