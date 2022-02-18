package gorupAssignment;

import java.util.Scanner;

public class GroupAssignment01_06 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number now: ");
		int number = scan.nextInt();
		boolean notPrime = false;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) { // condition for non prime number!
				notPrime = true; //as soon as it divides by something other than 1  but half the size of the number
				break;            //it will break and assign boolean value to true, if it doesn't divide by any other number it will mean it's prime number
				

			}
		}

		if (number <= 1) {     //1,0 and negative numbers can not be prime numbers
			notPrime = true;
		}

		if (notPrime) {
			System.out.println("Number " + number + " is NOT a prime number");

		} else {
			System.out.println("Number " + number + " is a PRIME number");
		}

	}
}