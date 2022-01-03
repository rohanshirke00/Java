package ifElse;

import java.util.Scanner;

public class FindRoots {

	public static void main(String[] args) {
		
		//find roots of quadratic equations
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		double a = sc.nextDouble();
		System.out.print("Enter 2nd number : ");
		double b = sc.nextDouble();
		System.out.print("Enter 3rd number : ");
		double c = sc.nextDouble();
		
		double root1 = 0 , root2 = 0;
//		double root1, root2;
//		double determinant = b * b - 4 * a * c;
//
//		if (determinant > 0) {	      
//			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
//			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
//			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
//		}
//
//
//		else if (determinant == 0) {
//			root1 = root2 = -b / (2 * a);
//			System.out.format("root1 = root2 = %.2f;", root1);
//		}
//		else {
//			double real = -b / (2 * a);
//			double imaginary = Math.sqrt(-determinant) / (2 * a);
//			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
//			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
//		}
		
		double determinant = (b*b)-(4*a*c);
		double sqrt = Math.sqrt(determinant);
		
		if(determinant > 0) {
			root1 = (-b + sqrt)/(2*a);
			root2 = (-b - sqrt)/(2*a);
			System.out.println("Roots are real and distinct.");
			System.out.println("root1 = "+ root1 + " and root2 = " + root2);
		}else if (determinant == 0) {
			root1 = root2 = (-b)/(2*a);
			System.out.println("Roots are real and equal.");
			System.out.println("root1 = root2 = " + root1);
		}else {
			double real = (-b)/(2*a);
			double imaginary = Math.sqrt(-determinant)/(2*a);
			System.out.println("Roots are complex.");
			System.out.format("root1 = %.2f+%.2fi",real , imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi",real , imaginary);
		}
	}
}