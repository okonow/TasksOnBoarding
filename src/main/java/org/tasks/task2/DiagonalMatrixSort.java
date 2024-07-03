package org.tasks.task2;

import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import static org.tasks.other.QuickSort.quickSort;
import java.util.ArrayList;

public class DiagonalMatrixSort {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public DiagonalMatrixSort(int[][] matrix) throws EmptyMatrixException {
        if (matrix == null || matrix.length == 0 || matrix[0] == null) {
            throw new EmptyMatrixException("Matrix is empty");
        }
        this.matrix = matrix;
    }



    public void sort() throws EmptyArrayException {
        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;


        int i;
        int j;
        for (int col = 0; col < matrixWidth-1; col++) {
            i = 0;
            j = col;
            ArrayList < Integer > tempArray = new ArrayList < Integer > ();
            while (i < matrixHeight && j < matrixWidth) {
                tempArray.add(matrix[i][j]);
                i++;
                j++;
            }
            quickSort(tempArray, 0, tempArray.size()-1);
            i = 0;
            j = col;
            while (i < matrixHeight && j < matrixWidth) {
                matrix[i][j] = tempArray.get(i);
                i++;
                j++;
            }
        }



        for (int row = 1; row < matrixHeight-1; row++) {
            i = row;
            j = 0;
            ArrayList<Integer> tempArray = new ArrayList<>();
            while (i < matrixHeight && j < matrixWidth) {
                tempArray.add(matrix[i][j]);
                i++;
                j++;
            }
            quickSort(tempArray, 0, tempArray.size()-1);
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


