package forLoop;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		//Q(7)Find the LCM of two numbers
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter 1st Number : ");
				int num1 = sc.nextInt();
				System.out.print("Enter 2nd Number : ");
				int num2 = sc.nextInt();
				int LCM;
				
				//for(LCM=1; LCM<=num1*num2; LCM++)
				for(LCM=num1>num2?num1:num2; LCM<=num1*num2; LCM=LCM+(num1>num2?num1:num2))
					if(LCM%num1==0 && LCM%num2==0)
						break;
				System.out.println("Least Common Multiple Of " +num1+ " and "+num2+ " is "+LCM);
	}

}