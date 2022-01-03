package forLoop;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many co-prime number you want to print : ");
		int N = sc.nextInt();
		int a=2,b,i,min;
		while(N!=0) {
			for(b=2; b<=a; b++) {
				min = a<b?a:b;
				
				for(i=2; i<=min; i++) {
					if(a%i==0 && b%i==0) {
						break;
					}
				}
				if(i==min+1) {
					System.out.println("("+a+" , "+b+")");
					N--;
					if(N==0)
						System.exit(0);
				}
			
			}
			
			a++;
		}
	}

}
