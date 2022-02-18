package gorupAssignment;

import java.util.Scanner;

public class GroupAssignment01_01 {

	public static void main(String[] args) {

		// Create an array on int values using a scanner
		// and calculate the sum of all stored elements in that array.

		Scanner scan = new Scanner(System.in);

		int size = 5;
		int[] numbers = new int[size];

		for (int i = 0; i < size; i++) {								//LOOP FOR STORING THE ELEMENTS/INT VALUES AT 5 INDEXES 
			System.out.println("Please enter number for the array:");   
			numbers[i] = scan.nextInt();
		}

		int sum = 0;

		for (int sumOne : numbers) {									//LOOP FOR ADDING EACH STROED VALUE TOGETHER FOR GRAND TOTAL
			sum = sum + sumOne;
		}
		System.out.println("The sum of all stored elements inside the array is: " + sum);
	}

}