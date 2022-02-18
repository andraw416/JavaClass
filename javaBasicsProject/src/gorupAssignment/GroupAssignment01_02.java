package gorupAssignment;

public class GroupAssignment01_02 {

	public static void main(String[] args) {

		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { { 1, 2, 3, 4, 5, 6 }, //
				{ 100, 200, 300, 400, 500, 600 }, //
				{ 22, 11, 33, 44 } };//

		int sum = 0;

		for (int[] eachBlock : numbers) { // specifying which 1d array

			for (int total : eachBlock) { // specifying each object inside given 1d array
				sum = sum + total;
			}
		}
		System.out.println("The sum of all numbers inside the 2D array is: " + sum);
	}

}
