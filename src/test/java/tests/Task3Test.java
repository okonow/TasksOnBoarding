package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.task3.SpiralMatrixSort;

import static tests.CreateSquareMatrix.createMatrix;

public class Task3Test {

    @Test
    void handleTest() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = createMatrix(4, 2);
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{0, 1}, {7, 2}, {6, 3}, {5, 4}};
        SpiralMatrixSort test2 = new SpiralMatrixSort(expected);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyMatrixException() throws EmptyMatrixException {
        int[][] emptyMatrix = new int[0][];
        EmptyMatrixException thrown = Assertions.assertThrows(EmptyMatrixException.class, () -> {
            SpiralMatrixSort test1 = new SpiralMatrixSort(emptyMatrix);
        });
        Assertions.assertEquals("Matrix is empty", thrown.getMessage());
    }

    @Test
    void testNegativeValues() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = {{-1, -2, -3, -4}, {-5, -6, -7, -8}, {-9, -10, -11, -12}};
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int [][] result = test1.getMatrix();
        int[][] expected = {{-12, -11, -10, -9}, {-3, -2, -1, -8}, {-4, -5, -6, -7}};
        SpiralMatrixSort test2 = new SpiralMatrixSort(expected);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testTwoCycleSpiral() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = createMatrix(5, 5);
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int [][] result = test1.getMatrix();
        int[][] expected = {{0,1,2,3,4}, {15,16,17,18,5}, {14,23,24,19,6}, {13,22,21,20,7}, {12,11,10,9,8}};
        SpiralMatrixSort test2 = new SpiralMatrixSort(expected);

        Assertions.assertArrayEquals(expected, result);
    }
}
