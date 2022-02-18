package gorupAssignment;

public class GroupAssignment01_03 {

	public static void main(String[] args) {

		// Create a 2D array or integer type where you will store odd and even numbers.
		// Develop a program which will identify/print the even numbers only.

		int[][] numbers = { { 1, 2, 3, 4, 5, 6, 7 }, //
				{ 123, 111, 156, 178, 122, 157 }, //
				{ 15, 13, 14, 12, 11 } };//

		for (int[] eachBlock : numbers) { // specifying which 1d array

			for (int evenNumbers : eachBlock) { // specifying each object inside given 1d array
				if (evenNumbers % 2 == 0) {      // checking if the number is even by %2 ==0
					System.out.print(evenNumbers + " ");
				}
			}
		}

	}
}
