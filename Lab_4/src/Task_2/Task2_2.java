package Task_2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
	// sort by ascending order
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] > pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// select pivot element based on the median of three strategy

	private static int getPivot_MedianOfThree(int[] arr) {
		int mid = (arr.length - 1) / 2;
		int[] pivots = new int[]{arr[0], arr[mid], arr[arr.length - 1]};
		Arrays.sort(pivots);
		return pivots[1];
	}

	// select pivot element based on the first element in the array

	private static int getPivot_First(int[] arr) {
		return arr[0];
	}

	// select pivot element based on the last element in the array

	private static int getPivot_Last(int[] arr) {
		return arr[arr.length - 1];
	}

	// select pivot element based on choosing a randomly element in the array

	private static int getPivot_Random(int[] arr) {
		return arr[new Random().nextInt(arr.length)];
	}

	public static void main(String[] args) {
		int[] arr = {5, 3,-6, 2,10, 1, 4, 9,-2,7 };

		int pivotM = getPivot_MedianOfThree(arr);
		int pivotF = getPivot_First(arr); 
		int pivotL = getPivot_Last(arr); 
		int pivotR = getPivot_Random(arr);

		quickSort(arr, 0, arr.length - 1);
		System.out.println("Mảng sau khi dùng Quick Sort:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Pivot được chọn bằng chiến lược median-of-three: " + pivotM);
		System.out.println("Pivot được chọn bằng chiến lược first element: " + pivotF);
		System.out.println("Pivot được chọn bằng chiến lược last element: " + pivotL);
		System.out.println("Pivot được chọn bằng chiến lược random: " + pivotR);
	}
}
