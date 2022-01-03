package forLoop;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		//Generate multiplication table of given number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to generate multiplication table : ");
		int Tableof = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(Tableof + " * " + i + " = " + (Tableof * i));
		}
		
	}

}