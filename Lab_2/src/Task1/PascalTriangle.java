package Task1;

import java.util.Arrays;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalValue(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int pascalValue(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }
    
    
 // get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
    public static int[] getPascalTriangle(int n) {
        if (n == 1) {
            return new int[]{1};
        } else {
            int[] previousRow = getPascalTriangle(n - 1);
            int[] currentRow = new int[n];
            currentRow[0] = 1;
            currentRow[n - 1] = 1;
            for (int i = 1; i < n - 1; i++) {
                currentRow[i] = previousRow[i - 1] + previousRow[i];
            }
            return currentRow;
        }
    }
    
 // generate the next row based on the previous row
  //Ex. prevRow = {1} ==> nextRow = {1, 1}
  //Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
    public static int[] generateNextRow(int[] prevRow) {
        if (prevRow.length == 1) {
            return new int[]{1, 1};
        } else {
            int[] nextRow = new int[prevRow.length + 1];
            nextRow[0] = 1;
            nextRow[prevRow.length] = 1;
            for (int i = 1; i < prevRow.length; i++) {
                nextRow[i] = prevRow[i - 1] + prevRow[i];
            }
            return nextRow;
        }
    }
    
    
    
	public static void main(String[] args) {
		int n = 5;
		System.out.println("PrintPascalTriangle:");
		printPascalTriangle(n);
		
		System.out.println("GetPascalTriangle:");
		int m = 2;
        int[] row = getPascalTriangle(m);
        System.out.println(Arrays.toString(row));
        
        System.out.println("GenerateNextRow:");
        int[] e = {1, 1};
        int[] nextRow = generateNextRow(e);
        System.out.println(Arrays.toString(nextRow));
	}
}
