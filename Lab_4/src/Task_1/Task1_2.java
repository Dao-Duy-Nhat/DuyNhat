package Task_1;

import java.util.Arrays;

public class Task1_2 {
	// sort by descending order
	public static void bubbleSort(int[] array) {
		  for (int i = 0; i < array.length - 1; i++) {
		    for (int j = 0; j < array.length - i - 1; j++) {
		      if (array[j] < array[j + 1]) {
		        int temp = array[j];
		        array[j] = array[j + 1];
		        array[j + 1] = temp;
		      }
		    }
		  }
	}
		  public static void main(String[] args) {
				int[] array = {5, 3,-6, 2,10, 1, 4, 9,-2,7};
				bubbleSort(array);
				System.out.println("Mảng sau khi dùng Bubble Sort:");
				System.out.println(Arrays.toString(array));
		  }
}
