package com.itbulls.leranjava.corejava.pratice;

import java.util.Scanner;
public class MatrixRotation {
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}
	
	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." 
						+ Integer.toString(j));
			}
		}
		return matrix;
	}
	
	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}
	
	public static void rotate90(double[][] matrix) {
	//	<write your code here>
	
	int n = matrix.length;
	for(int i=0; i<n/2; i++){
	    for(int j=1; j<n-i; j++){
	        double temp = matrix[i][j];
	        matrix[i][j] = matrix[n-1-j][i];
	        matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
	        matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
	        matrix[j][n-1-i] = temp;
	    }
	}
	}

	public static void rotate180(double[][] matrix) {
		//<write your code here>
		int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                // Swap the corresponding elements
                double temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = temp;
            }
        }
        if (n % 2 != 0) {
            for (int j = 0; j < n / 2; j++) {
                // Swap the middle row
                double temp = matrix[n / 2][j];
                matrix[n / 2][j] = matrix[n / 2][n - 1 - j];
                matrix[n / 2][n - 1 - j] = temp;
            }
        }
	}

	public static void rotate270(double[][] matrix) {
		//<write your code here>
		rotate90(matrix);
		rotate90(matrix);
		rotate90(matrix);
	}

}

/* output
Please, enter matrix size: 3
How you want to rotate matrix:
	1 - 90
	2 - 180
	3 - 270

1

Base matrix:

0.0	0.1	0.2	
1.0	1.1	1.2	
2.0	2.1	2.2	

90 degrees rotated:

2.0	1.0	0.0	
2.1	1.1	0.1	
2.2	1.2	0.2	
*/