package ifElse;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
//		2) Write a Program to Check Whether a Character is Vowel or Consonant.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to check whether it is Vowel or Consonant : ");
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Entered chracter \'" + ch + "\' is Vowel");
		}
		else {
			System.out.println("Entered charcter \'" + ch + "\' is Consonant");
		}
	}

}