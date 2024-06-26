package org.tasks.Task1;

public class SquareMatrixSum {

    int[][] matrix;

    public SquareMatrixSum(int[][] matrix) {
        try {
            if (matrix.length != matrix[0].length) {
                throw new NonSquareMatrixException("Матрица не квадратная");
            }
            else {
                this.matrix = matrix;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: Матрица пустая");
            this.matrix = new int[1][1];
        }
        catch (NonSquareMatrixException e) {
            System.out.println("Исключение: " + e.getMessage());
            this.matrix = new int[1][1];
        }

    }

    public int sumAllElementsBesideMainDiagonal() {
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
