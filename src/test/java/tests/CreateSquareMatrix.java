package tests;

public class CreateSquareMatrix {
    static int[][] createMatrix(int height, int width) {
        int[][] matrix = new int[height][width];
        int elementValue = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = elementValue++;
            }
        }


        return matrix;

    }


}
