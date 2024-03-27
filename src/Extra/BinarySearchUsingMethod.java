package Extra;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearchUsingMethod {

	public static void main(String args[]) {
		int array[] = {20, 10, 50, 40, 30}; //Should be in order
		Arrays.sort(array);
		for (int x : array) {
			System.out.print(x + "  ");
		}
		System.out.println();

		System.out.println(Arrays.binarySearch(array, 30)); //providing index of searched value

		reverseArray(array);
		for (int x: array){
			System.out.print(x + "  ");
		}

	}

	// Method to reverse the elements of the array
	private static void reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
