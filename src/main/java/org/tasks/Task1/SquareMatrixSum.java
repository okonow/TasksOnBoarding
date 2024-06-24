package org.tasks.Task1;

public class SquareMatrixSum {

    int[][] matrix;

    public SquareMatrixSum(int[][] matrix) {
        this.matrix = matrix;
    }

    public int SumOfAllElementsBesidesTheDiagonals() {
        int sumNotMainDiagonal = 0, sumNotSubDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if ((row-column) != 0) {
                    sumNotMainDiagonal += matrix[row][column];
                }
                /*
                if ((row + column) != matrix.length) {
                    sumNotSubDiagonal += matrix[row][column];
                }
                */

            }
        }

        return sumNotMainDiagonal;

    }

}
