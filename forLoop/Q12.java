package forLoop;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		//12) Write a Program to Check Whether a Number N
		//entered by user is Palindrome or Not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is plaindrome or not : ");
		int num = sc.nextInt();
		int temp = num;
		int rem = 0;
		int reverse = 0;
		
		while(temp!=0){
			rem = temp%10;
			reverse = reverse * 10 + rem;
			temp = temp/10;
		}
		System.out.println("Original number is "+num);
		System.out.println("Reverse number is "+reverse);
		if(reverse == num) {
			System.out.println("The reverse of a number matches the original number "
					+ "therefore it is a palindrome number");
		}else {
			System.out.println("The reverse of a number doesn't match with the original number"
					+ " therefore it is not a palindrome number");
		}
		
	}
	
}
