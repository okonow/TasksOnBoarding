package org.tasks.Task1;

public class SquareMatrixSum {

    int[][] matrix;

    public SquareMatrixSum(int[][] matrix) throws NonSquareMatrixException, EmptyMatrixException {

            if (matrix.length != matrix[0].length) {
                throw new NonSquareMatrixException("Matrix isn't square");
            }

            if (matrix.length <= 0 || matrix[0].length < 0) {
                throw new EmptyMatrixException("Matrix is empty");
            }
            try {
                this.matrix = matrix;
            } catch (ArrayIndexOutOfBoundsException e) {

                throw new EmptyMatrixException("Matrix is empty");
            }



    }

    public int matrixSumBesideMainDiagonal() {
        int sumNotMainDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row != column) {
                    sumNotMainDiagonal += matrix[row][column];
                }
            }
        }

        return sumNotMainDiagonal;

    }

}
