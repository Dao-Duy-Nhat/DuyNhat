package Task_1;

import java.util.Arrays;

public class Task1_1 {
	// sort by descending order
	public static void selectionSort(int[] array) {
		  for (int i = 0; i < array.length - 1; i++) {
		    int indexMax = i;
		    for (int j = i + 1; j < array.length; j++) {
		      if (array[j] > array[indexMax]) {
		        indexMax = j;
		      }
		    }
		    int temp = array[i];
		    array[i] = array[indexMax];
		    array[indexMax] = temp;
		  }
		
	}
	public static void main(String[] args) {
		int[] array = {5, 3,-6, 2,10, 1, 4, 9,-2,7};
		selectionSort(array);
		System.out.println("Mảng sau khi dùng Selection Sort:");
		System.out.println(Arrays.toString(array));
	}


}
