package forLoop;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		//Find Fibonacii series Upto N
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find fibonacii series : ");
		int number = sc.nextInt();
		int a = 0, b = 1, c;
		if(number == 1 || number == 0) {
			System.out.print(a);
		}
		else {
			System.out.print(a + "  " + b + "  ");
			for(int i=1; i<=number-2; i++) {
				c = a + b;
				System.out.print(c + "  ");
				a = b;
				b = c;
			}
		}
	}

}