package forLoop;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
//		15) Write a Program to check whether a number entered
//		by the user is an Armstrong number or not.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is armstrong or not : ");
		int number = sc.nextInt();
		int sum = 0,temp = number;
		while(temp!=0) {
			int rem = temp%10;
			sum += rem*rem*rem;
			temp /= 10;
		}
		if(sum == number) {
			System.out.println(number+" is Armstrong number");
		}else {
			System.out.println(number+" is not Armstrong number");
		}
		
	}

}
