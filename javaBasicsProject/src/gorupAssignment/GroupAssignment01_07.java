package gorupAssignment;

public class GroupAssignment01_07 {

	public static void main(String[] args) {

//Write a Java Program to print the first 10 numbers of Fibonacci series.

		int numberCount = 10; //first 10 numbers
		int firstNumber = 0; //we know first and second number of Fibonacci sereis 
		int secondNumber = 1;//we declare them here

		for (int i = 1; i <= numberCount; i++) {// looping it by the number of 10 (as per question requirnment)
			System.out.print(firstNumber + " ");

			int theSum = firstNumber + secondNumber;
			
			firstNumber = secondNumber; //we are assigning second number to the first number
			secondNumber = theSum;// the sum of first and second is stored into second number as per Fibonacci logic.

		}

	}

}
