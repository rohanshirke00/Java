package basicCodingQuestion;

public class Q5 {

	public static void main(String[] args) {
		
//		5) Write a Program to Find Size of int, float, double and char in your computer
		int intType;
		float floatType;
		char charType;
		double doubleType;
		byte byteType;
		short shortType;
		long longType;
		
		System.out.println("Size of an byte is " + Byte.SIZE/8 + " byte");
		System.out.println("Size of an char is " + Character.SIZE/8 + " byte");
		System.out.println("Size of an short is " + Short.SIZE/8 + " byte");
		System.out.println("Size of an int is " + Integer.SIZE/8 + " byte");
		System.out.println("Size of an long is " + Long.SIZE/8 + " byte");
		System.out.println("Size of an float is " + Float.SIZE/8 + " byte");
		System.out.println("Size of an double is " + Double.SIZE/8 + " byte");
		
	}

}