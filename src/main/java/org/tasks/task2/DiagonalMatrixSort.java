package org.tasks.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    void transposeMatrix(int[][] matrix) {
        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;

        int[][] temp = new int[matrixWidth][matrixHeight];

        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                temp[j][i] = matrix[i][j];
            }
        }


        for (int i = 0; i < matrixWidth; i++) {
            for (int j = 0; j < matrixHeight; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }


    public void sort() {
        for (int iteration = 0; iteration < 2; iteration++) {
            int col = matrix[0].length - 1;
            for (int diag = 1; diag <= matrix[0].length; diag++) {
                sortOneDiagonal(matrix, col, diag);
                col--;
            }
            transposeMatrix(matrix);
        }
    }

    public void sort2()
    {
        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;


        int i;
        int j;
        for (int col = 0; col < matrixWidth; col++) {
            i = 0;
            j = col;
            ArrayList < Integer > tempArray = new ArrayList < Integer > ();
            while (i < matrixHeight && j < matrixWidth) {
                tempArray.add(matrix[i][j]);
                i++;
                j++;
            }
            Collections.sort(tempArray);
            i = 0;
            j = col;
            while (i < matrixHeight && j < matrixWidth) {
                matrix[i][j] = tempArray.get(i);
                i++;
                j++;
            }
        }



        for (int row = 0; row < matrixHeight; row++) {
            i = row;
            j = 0;
            ArrayList < Integer > tempArray = new ArrayList < Integer > ();
            while (i < matrixHeight && j < matrixWidth) {
                tempArray.add(matrix[i][j]);
                i++;
                j++;
            }
            Collections.sort(tempArray);
            i = row;
            j = 0;
            while (i < matrixHeight && j < matrixWidth) {
                matrix[i][j] = tempArray.get(j);
                i++;
                j++;
            }
        }


    }
}


