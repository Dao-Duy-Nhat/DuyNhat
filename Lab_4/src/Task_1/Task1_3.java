package Task_1;

import java.util.Arrays;

public class Task1_3 {
	// sort by descending order
	public static void insertionSort(int[] array) {
	for (int i = 1; i < array.length; i++) {
		int n = array[i];
		int j = i;
	  while (j>0 && array[j -1] < n ) {
		array[j] = array[j-1];
		j--;
	}
	  array[j] = n;
	}
	}
	  public static void main(String[] args) {
			int[] array = {5, 3,-6, 2,10, 1, 4, 9,-2,7};
			insertionSort(array);
			System.out.println("Mảng sau khi dùng Insertion Sort:");
			System.out.println(Arrays.toString(array));
	  }

}
