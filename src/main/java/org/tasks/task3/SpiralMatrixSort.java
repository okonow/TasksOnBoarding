package org.tasks.task3;

import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;

import java.util.ArrayList;

import static org.tasks.other.QuickSort.quickSort;

public class SpiralMatrixSort {

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public SpiralMatrixSort(int[][] matrix) throws EmptyMatrixException {
        if (matrix == null || matrix.length == 0 || matrix[0] == null) {
            throw new EmptyMatrixException("Matrix is empty");
        }
        this.matrix = matrix;
    }


    public void sort() throws EmptyArrayException {
        //write matrix into array, sort it,
        // and write sorted array in matrix by spiral

        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;
        int size = matrixHeight * matrixWidth;

        ArrayList<Integer> sortedArrayOfMatrix = new ArrayList<>(size);
        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                sortedArrayOfMatrix.add(matrix[i][j]);
            }
        }

        quickSort(sortedArrayOfMatrix, 0, sortedArrayOfMatrix.size() - 1);
        move(sortedArrayOfMatrix);
    }

    void move(ArrayList<Integer> sortedValues) {
        //write by spiral
        int currentI = 0;
        int currentJ = 0;
        int currentWidth = matrix[0].length;
        int currentHeight = matrix.length;
        int elements = currentHeight * currentWidth;
        int dir = 0, currentIndex = 0;
        int currentMinI = 0, currentMinJ = 0;
        while (currentIndex < elements) {
            switch (dir) {
                case 0: // right
                    for (; currentJ < currentWidth; currentJ++) {
                        matrix[currentI][currentJ] = sortedValues.get(currentIndex++);
                    }
                    currentI++;
                    currentJ--;
                    currentWidth--;
                    dir = 1;
                    break;
                case 1: // down
                    for (; currentI < currentHeight; currentI++) {
                        matrix[currentI][currentJ] = sortedValues.get(currentIndex++);
                    }
                    currentI--;
                    currentJ--;
                    currentHeight--;
                    dir = 2;
                    break;
                case 2: // left
                    for (; currentJ >= currentMinJ; currentJ--) {
                        matrix[currentI][currentJ] = sortedValues.get(currentIndex++);
                    }
                    currentI--;
                    currentJ++;
                    dir = 3;
                    break;
                case 3: // up
                    for (; currentI > currentMinI; currentI--) {
                        matrix[currentI][currentJ] = sortedValues.get(currentIndex++);
                    }
                    currentI++;
                    currentJ++;
                    currentMinI++;
                    currentMinJ++;
                    dir = 0;
                    break;
            }
        }
    }
}
