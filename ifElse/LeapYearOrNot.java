package ifElse;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		//Check year is leap year or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap year");
		}
		else {
			System.out.println(year + " is not a Leap year");
		}
	
	}

}