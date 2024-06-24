package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task1.SquareMatrixSum;

import static org.junit.Assert.assertEquals;

public class Task1Test {

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

    int[][] matrix = createMatrix(4);

    @Test
    void handleTest(){
        SquareMatrixSum test1 = new SquareMatrixSum(matrix);
        int result = test1.SumOfAllElementsBesidesTheDiagonals();
        Assertions.assertEquals(126, result);
    }


}
