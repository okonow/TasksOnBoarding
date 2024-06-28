package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task2.DiagonalMatrixSort;
import org.tasks.Task4.FindWordByIndex;

import java.util.Arrays;

import static tests.CreateSquareMatrix.createMatrix;

public class Task2Test {

    @Test
    void handleTest() {

        int[][] matrix = {{9,6,3},{8,5,2}, {7,4,1}};

        DiagonalMatrixSort test1 = new DiagonalMatrixSort(matrix);
        test1.sort2();
        int[][] result = test1.matrix;
        int[][] expected = {{1,2,3},{4,5,6},{7,8,9}};
        Assertions.assertEquals(expected, result);
    }
}
