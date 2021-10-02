
public class BubbleSort {

	static void bubbleSort(int[] arr) {
		// get the length of array
		int n = arr.length;
		// variable for storing temporary value
		int x = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// changing the elements 
					x = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = x;
				}

			}
		}

	}
}
