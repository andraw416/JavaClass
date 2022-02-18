package gorupAssignment;

public class GroupAssignment01_08 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] numbers = { 1, 2, 5, 6, 7, 8, 12, 18, 19, 4352 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}

		}
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("The largest number in the array is: " + largest);
		System.out.println("The smallest number in the array is: " + smallest);
	}

}
