package gorupAssignment;

public class GroupAssignment01_05 {

	public static void main(String[] args) {

		// Write a program to swap 2 numbers without a temporary variable?

		int num1 = 10;
		int num2 = 20;

		System.out.println("Before we attempt to swap num 1 is: " + num1 + " and num 2 is: " + num2);

		// swapping

		num1 = num1 + num2;  // num 1 = 10+20=30
		num2 = num1 - num2;  // num 2 = 30-20 = 10
		num1 = num1 - num2;  // num1= 30-10=20
		
		System.out.println("After we did the swap num 1 is: " + num1 + " and num 2 is: " + num2);

	}

}
