
import java.util.Arrays;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

//Method mirror that outputs the contents of an array in a
//reverse order like a mirror
//Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int length = array.length;
		int[] newArray = new int[length * 2];

		for (int i = 0; i < length; i++) {
			newArray[i] = array[i];
			newArray[length + i] = array[length - i - 1];
		}
		return newArray;
	}

//removes all duplicate elements from an array and returns a
//new array
//Input: 1 3 5 1 3 7 9 8
//Output: 1 3 5 7 9 8
	public int[] removeDuplicates() {
		int length = array.length;
		int[] newArray = new int[length];
		int newSize = 0;
		newArray[newSize++] = array[0]; // Báº¯t Ä‘áº§u tá»« vá»‹ trÃ­ 0;

		for (int i = 1; i < length; i++) {
			boolean trungLap = false;
			for (int j = 0; j < newArray.length; j++) {
				if (array[i] == newArray[j]) {
					trungLap = true;
					break;
				}
			}
			if (!trungLap) {
				newArray[newSize++] = array[i];

			}
		}
		int[] resultArray = new int[newSize];
		for (int i = 0; i < newSize; i++) {
			resultArray[i] = newArray[i];
		}

		return resultArray;
	}

//Input: 10 11 12 13 14 16 17 19 20
//Output: 15 18
	public int[] getMissingValues() {
		int length = array.length;
		int[] newArray = new int[length];
		int newSize = 0;

		for (int i = 1; i < length; i++) {
			if (array[i] - array[i - 1] > 1) {
				int n = array[i - 1] + 1;
				newArray[newSize++] = n;
				n++;
			}

		}

		int[] resultArray = new int[newSize];
		for (int i = 0; i < newSize; i++) {
			resultArray[i] = newArray[i];
		}

		return resultArray;
	}

//Input: 10 11 12 -1 14 10 17 19 20
//Output(k=3): 10 11 12 12 14 16 17 19 20
	public int[] fillMissingValues(int k) {
		int length = array.length;
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			if (array[i] == -1) {
				int sum = 0;
				int count = 0;
				for (int j = Math.max(i - k, 0); j <= Math.min(i + k, array.length - 1); j++) {
					if (array[j] != -1) {
						sum += array[j];
						count++;
					}
				}
				result[i] = sum / count;
			} else {
				result[i] = array[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println("Task 1.1:");
		System.out.println("Question 1: ");
		int test1[] = { 1, 2, 3 };
		MyArray myArray1 = new MyArray(test1);
		int[] mirroredArray = myArray1.mirror();
		System.out.println("Input: " + Arrays.toString(test1));
		System.out.print("Output: " + Arrays.toString(mirroredArray) + "\n");

		System.out.println("Question 2: ");
		int test2[] = { 1, 3, 5, 1, 3, 7, 9, 8 };
		MyArray myArray2 = new MyArray(test2);
		int[] removeDuplicatesArray = myArray2.removeDuplicates();
		System.out.println("Input: " + Arrays.toString(test2));
		System.out.print("Output: " + Arrays.toString(removeDuplicatesArray) + "\n");

		System.out.println("Task 1.2:");
		System.out.println("Question 1: ");
		int test3[] = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		MyArray myArray3 = new MyArray(test3);
		int[] getMissingValuesArray = myArray3.getMissingValues();
		System.out.println("Input: " + Arrays.toString(test3));
		System.out.print("Output: " + Arrays.toString(getMissingValuesArray) + "\n");

		System.out.println("Question 2: ");
		int test4[] = { 10, 11, 12, -1, 14, 10, 17, 19, 20 };
		MyArray myArray4 = new MyArray(test4);
		int[] fillMissingValuesArray = myArray4.fillMissingValues(3);
		System.out.println("Input: " + Arrays.toString(test3));
		System.out.print("Output: " + Arrays.toString(fillMissingValuesArray) + "\n");
	}
}
