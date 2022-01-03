package forLoop;

public class Q16 {

	public static void main(String[] args) {
//		16) EXTRA QUES Write a Program to print all Armstrong numberfrom 1 to 1000
		
		System.out.println("ArmStrong Numbers from 1 to 1000 are : ");
		
		for(int i=1; i<=1000; i++) {
			int temp = i;
			int sum = 0;
			while(temp!=0) {
				int rem = temp%10;
				sum += rem*rem*rem;
				temp /= 10;
			}
			if(sum == i)
				System.out.println(sum);
		}
		
	}

}
