package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.task2.DiagonalMatrixSort;

public class Task2Test {

    @Test
    void handleTest() throws EmptyMatrixException, EmptyArrayException {

        int[][] matrix = {{9,6,3},{8,5,2}, {7,4,1}};

        DiagonalMatrixSort test1 = new DiagonalMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{1,2,3},{4,5,6},{7,8,9}};
        Assertions.assertArrayEquals(expected, result);

    }

    @Test
    void testEvenCols() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = {{11,12,8,4},{10,6,7,3},{9,5,1,2}};

        DiagonalMatrixSort test1 = new DiagonalMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Assertions.assertArrayEquals(expected, result);


    }

    @Test
    void testNegativeValues() throws EmptyMatrixException, EmptyArrayException {
        int[][] matrix = {{-1,-2,-3,-4},{-5,-6,-7,-8},{-9,-10,-11,-12}};

        DiagonalMatrixSort test1 = new DiagonalMatrixSort(matrix);
        test1.sort();
        int[][] result = test1.getMatrix();
        int[][] expected = {{-11,-12,-8,-4},{-10,-6,-7,-3},{-9,-5,-1,-2}};
        Assertions.assertArrayEquals(expected, result);

    }

    @Test
    void testEmptyMatrixException() throws EmptyMatrixException {
        int[][] emptyMatrix = new int[0][];
        EmptyMatrixException thrown = Assertions.assertThrows(EmptyMatrixException.class, () -> {
            DiagonalMatrixSort test1 = new DiagonalMatrixSort(emptyMatrix);
        });

        Assertions.assertEquals("Matrix is empty", thrown.getMessage());
    }
}
