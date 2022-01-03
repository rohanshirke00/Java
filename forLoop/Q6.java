package forLoop;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		//Q(6)Find the HCF or GCD of two numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		int HCF;
		for(HCF=num1<num2?num1:num2; HCF>=1; HCF--) {
			if((num1%HCF==0) && (num2%HCF==0)) break;
		}
		System.out.println("Highest Common Factor(HCF) "
				+ "or Greatest Common Divisor(GCD) Of " +num1+ " and "+num2+ " is "+HCF);
	}

}