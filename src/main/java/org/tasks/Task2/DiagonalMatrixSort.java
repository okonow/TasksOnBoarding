package org.tasks.Task2;

import java.util.Arrays;

public class DiagonalMatrixSort {

    public int[][] matrix;

    public DiagonalMatrixSort(int[][] matrix) {
        this.matrix = matrix;
    }

    public void sort() {

        int matrixHeight = matrix.length;
        int matrixWidth = matrix[0].length;
        int diagonalsCount = matrixHeight + matrixWidth - 1;

        //мы сначала определяем кол-во диагоналей
        //потом создаем на основе этого цикл

        for (int currentDiagonal = 0; currentDiagonal < diagonalsCount; currentDiagonal++) { //choose the diagonal
            for (int row = 0; row < currentDiagonal + 1; row++) { //step through rows
                for (int col = 0; col < matrixWidth; col++) { //step through every col in row to find matching indexes
                    if (Math.abs(row - col) == diagonalsCount / 2 - currentDiagonal) {

                    }
                }
            }

        }


        for (int diagonalIndex = 1; diagonalIndex < matrixHeight + 1; diagonalIndex++) {
            int[] newDiagonal = new int[diagonalIndex];
            for (int row = 0; row < diagonalIndex; diagonalIndex++) {
                int column = matrixWidth - row;
            }

            /*
            for (int j = 0; j < i; j++) { //put out diagonal from matrix
                newDiagonal[j] = matrix[i][j];
            }
            Arrays.sort(newDiagonal); //sort gotten diagonal
            for (int j = 0; j < i; j++) { //put back sorted diagonal
                matrix[i][j] = newDiagonal[j];
            }

             */
        }

        for (int diagonalsIndex = 0; diagonalsIndex < diagonalsCount; diagonalsIndex++) {
            //for (int diagonalElementIndex = 0; diagonalElementIndex < )

        }

    }
}


