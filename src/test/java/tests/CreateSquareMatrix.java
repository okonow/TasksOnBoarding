package tests;

public class CreateSquareMatrix {
    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int elementValue = 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = elementValue++;
            }
        }
        return matrix;
    }
}
