package org.tasks.Task3;
import java.util.Arrays;

public class SpiralMatrixSort {

    public int[][] matrix;

    public SpiralMatrixSort(int[][] matrix) {
        this.matrix = matrix;
    }

    public void sort() {
        //sort matrix and write it into array
        int rows = matrix.length;
        int cols = matrix[0].length;
        int size = rows*cols;
        int[] sortedArrayOfMatrix = new int[size];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sortedArrayOfMatrix[index++] = matrix[i][j];
            }

        }

        Arrays.sort(sortedArrayOfMatrix);

        //pass the matrix and write into it new sorted values (saomIndexIndex - index of sorted array)
        int col = 0, row = 0, saomIndex = 0, nowCol = 0, nowRow = 0;

        while (saomIndex < size) {
            while (nowCol < matrix[row].length-1) {
                matrix[nowRow][nowCol] = sortedArrayOfMatrix[saomIndex];
                saomIndex++; nowCol++;
            }
            while (nowRow < matrix[row].length-1) {
                matrix[nowRow][nowCol] = sortedArrayOfMatrix[saomIndex];
                saomIndex++; nowRow++;
            }
            while (nowCol > col) {
                matrix[nowRow][nowCol] = sortedArrayOfMatrix[saomIndex];
                saomIndex++; nowCol--;
            }
            while (nowRow > row) {
                matrix[nowRow][nowCol] = sortedArrayOfMatrix[saomIndex];
                saomIndex++; nowRow--;
            }
            col++;
            row++;
        }
    }
}
