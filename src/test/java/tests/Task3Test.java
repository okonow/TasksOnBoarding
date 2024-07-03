package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.task3.SpiralMatrixSort;

import static tests.CreateSquareMatrix.createMatrix;

public class Task3Test {

    int[][] matrix = createMatrix(4, 2);

    @Test
    void handleTest() throws EmptyMatrixException, EmptyArrayException {
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        test1.sort();
        int[][] expectedMatrix = {{0, 1}, {7, 2}, {6, 3}, {5, 4}};
        SpiralMatrixSort test2 = new SpiralMatrixSort(expectedMatrix);
        String
                expected = test2.showMatrix(),
                result = test1.showMatrix();
        Assertions.assertEquals(expected, result);
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
        int[][] expectedMatrix = {{-12, -11, -10, -9}, {-3, -2, -1, -8}, {-4, -5, -6, -7}};
        SpiralMatrixSort test2 = new SpiralMatrixSort(expectedMatrix);
        String
                expected = test2.showMatrix(),
                result = test1.showMatrix();
        Assertions.assertEquals(expected, result);
    }
}
