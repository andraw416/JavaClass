package gorupAssignment;

public class GroupAssignment01_04 {

	public static void main(String[] args) {

		// Create a 2D array of integers.
		// Develop a program which will calculate the sum of even and odd numbers for
		// that array.

		int[][] numbers = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, // row 1 (1d array)
				{ 10, 11, 14, 16, 13, 18 }, // row 2 (1d array)
				{ 113, 124, 151, 121, 177, 198 }, // row 3 (1d array)
				{ 1234, 2412, 5122, 1211, 2141 } };// row 4 (1d array)

		int sumE = 0;
		int sumO = 0;

		for (int[] eachBlock : numbers) { // specifying which 1d array

			for (int evenNumbers : eachBlock) { // specifying each object inside given 1d array
				if (evenNumbers % 2 == 0) { // checking if the number is even by %2 ==0
					sumE = sumE + evenNumbers;

				} else if ((evenNumbers % 2 != 0)) { // checking if the number is odd by %2 !=0
					sumO = sumO + evenNumbers;

				}
			}

		}
		System.out.println("Sum of EVEN numbers inside the array is: " + sumE);
		System.out.println("Sum of ODD numbers inside the array is: " + sumO);
	}
}
