package org.tasks.Task2;

import java.util.Arrays;

public class DiagonalMatrixSort {

    public int[][] matrix;

    public DiagonalMatrixSort(int[][] matrix) {
        this.matrix = matrix;
    }

    static void sortOneDiagonal(int[][] matrix, int colBegin,
                                int currentDiagonal) {
        int matrixHeight = matrix.length;
        int elements = matrixHeight - Math.abs(matrixHeight - currentDiagonal);
        int col = colBegin;
        int row = 0;

        int[] sortedDiagonal =
                new int[elements - Math.abs(elements - currentDiagonal)];

        for (int element = 0; element < elements; element++) {

            sortedDiagonal[row] = matrix[row][col];
            row++;
            col++;
        }

        Arrays.sort(sortedDiagonal);
        col = colBegin;
        row = 0;
        for (int element = 0; element < elements; element++) {

            matrix[row][col] = sortedDiagonal[row];

            row++;
            col++;
        }


    }

    int[][] transposeMatrix(int[][] matrix) {
        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;
        int[][] transposedMatrix = new int[matrixWidth][matrixHeight];

        for (int i = 0; i < matrixHeight; i++) {

            for (int j = 0; j < matrixWidth; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }


    public void sort(int[][] matrix) {
        for (int iteration = 0; iteration < 2; iteration++) {
            int col = matrix[0].length - 1;
            for (int diag = 1; diag <= matrix[0].length; diag++) {
                sortOneDiagonal(matrix, col, diag);
                col--;
            }
            matrix = transposeMatrix(matrix);
        }
        //return matrix;
    }
}


