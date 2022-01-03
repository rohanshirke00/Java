package switchCase;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
//		1) Write a Program to Make a Simple Calculator to Add, Subtract,
//	Multiply or Divide Using Switch case
//	The program should takes an arithmetic operator (+, -,* , /) and
//	two operands from a user and performs the operation on those
//	two operands depending upon the operator entered by the user.

		Scanner sc = new Scanner(System.in);
		char option;
		double a,b;
		do{
			System.out.println("Basic Calculator using Java");
			System.out.print("Enter first number : ");
			a = sc.nextDouble();
			System.out.print("Enter second number : ");
			b = sc.nextDouble();
			
			System.out.println("Select one operation from the given menu : ");
			System.out.println("~ For Addition press '+'");
			System.out.println("~ For Substraction press '-'");
			System.out.println("~ For Multiplication press '*'");
			System.out.println("~ For Division press'/'");
			System.out.println();
			System.out.print("Enter your choice : ");
			char choice = sc.next().charAt(0);
			
			switch(choice){
			case '+':
				System.out.println("Addition of "+a+ " and "+b+ " is : "+(a+b));
				break;
			case '-':
				System.out.println("Substraction of "+a+ " and "+b+ " is : "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication of "+a+ " and "+b+ " is : "+(a*b));
				break;
			case '/':
				System.out.println("Division of "+a+ " and "+b+ " is : "+(a/b));
				break;
			default :
				System.out.println("Invalid input !");
			}
			
			System.out.print("Do you want to continue ? y/n : ");
			option = sc.next().charAt(0);
			System.out.println();
		}while(option == 'y');
		System.out.println("Program Ended successfully!");
		System.exit(0);
	}

}
