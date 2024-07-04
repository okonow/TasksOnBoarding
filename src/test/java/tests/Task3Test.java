package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.task3.SpiralMatrixSort;

import static tests.CreateSquareMatrix.createMatrix;

public class Task3Test {

    @Test
    void testEmptyMatrixException() throws EmptyMatrixException {
        int[][] emptyMatrix = new int[0][];
        EmptyMatrixException thrown = Assertions.assertThrows(EmptyMatrixException.class, () -> {
            SpiralMatrixSort test1 = new SpiralMatrixSort(emptyMatrix);
        });
        Assertions.assertEquals("Matrix is empty", thrown.getMessage());
    }

    @Test
    void testSquareSpiral() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = createMatrix(5, 5);
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{0, 1, 2, 3, 4}, {15, 16, 17, 18, 5}, {14, 23, 24, 19, 6}, {13, 22, 21, 20, 7}, {12, 11, 10, 9, 8}};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testNegativeValues() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = {{-100, -11, -10, -9, -8},
                {11, 12, 12, 13, -8},
                {8, 54, 62, 23, -4},
                {9, 56, 61, 16, -5},
                {7, 53, 100, 42, -3},
                {6, 47, 46, 43, -2},
                {4, 2, 1, 0, -2}};
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{-100, -11, -10, -9, -8},
                {11, 12, 12, 13, -8},
                {9, 56, 61, 16, -5},
                {8, 54, 62, 23, -4},
                {7, 53, 100, 42, -3},
                {6, 47, 46, 43, -2},
                {4, 2, 1, 0, -2}};
        Assertions.assertArrayEquals(expected, result);
    }

}
