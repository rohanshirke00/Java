package forLoop;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		System.out.print("Enter a String at least 3 letters : ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int i=0;
		int j=word.length()-1;
		while(i<j) {
			if(word.charAt(i) != word.charAt(j)) {
				System.out.println("Entered String is Not palindrome");
				break;
			}
			i++;
			j--;
		
		if(i<j)
			System.out.println("Entered String is Palindrome");
			break;
		}
		System.out.println("break is executed");
	}

}
