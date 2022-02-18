package gorupAssignment;

public class GroupAssignment01_09 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] numbers = { 1, 2, 5, 6, 7, 8, 12, 18, 19, 4352 };

		int first = numbers[0];
		int second = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > first) {
				first = numbers[i];                      //find the largest number 
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > second && numbers[i] != first) { //find the largest again but make sure it does not equal to largest number 
				second = numbers[i];					      //from previous loop, this way itll be the second largest
			}

		}

		System.out.println(second);
	}

}
