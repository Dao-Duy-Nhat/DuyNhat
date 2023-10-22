package Task1;


public class Task1_1234 {
	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {
		int rows = a.length;
		int columns = a[0].length;

		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}

		return result;
	}

	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
		int rows = a.length;
		int columns = a[0].length;
		int[][] result = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int rows = a.length;
		int columns = b[0].length;
		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < b.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return result;
	}

	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		int rows = a.length;
		int columns = a[0].length;
		int[][] result = new int[columns][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][i] = a[i][j];
			}
		}

		return result;
	}
	
	 public static void main(String[] args) {
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] matrix2 = {
	            {7, 8, 9},
	            {10, 11, 12}
	        };

	        int[][] sum = add(matrix1, matrix2);
	        int[][] difference = subtract(matrix1, matrix2);
	        int[][] product = multiply(matrix1, matrix2);
	        int[][] transposedMatrix = transpose(matrix1);

	        // Print the results
	        System.out.println("Matrix Sum:");
	        printMatrix(sum);

	        System.out.println("Matrix Difference:");
	        printMatrix(difference);

	        System.out.println("Matrix Product:");
	        printMatrix(product);

	        System.out.println("Transposed Matrix:");
	        printMatrix(transposedMatrix);
	    }

	    public static void printMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}