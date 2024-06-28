package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task1.EmptyMatrixException;
import org.tasks.Task1.NonSquareMatrixException;
import org.tasks.Task1.SquareMatrixSum;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static tests.CreateSquareMatrix.createMatrix;

public class Task1Test {



    @Test
    public void handleBasicTest() throws EmptyMatrixException, NonSquareMatrixException {
        int[][] basicMatrix = createMatrix(4,4);
        SquareMatrixSum test1 = new SquareMatrixSum(basicMatrix);
        int result = test1.matrixSumBesideMainDiagonal();
        Assertions.assertEquals(90, result);
    }


    @Test
    void testEmptyMatrixException() {
        int[][] emptyMatrix = new int[0][];
        EmptyMatrixException thrown = Assertions.assertThrows(EmptyMatrixException.class, () -> {
            try {
                SquareMatrixSum test1 = new SquareMatrixSum(emptyMatrix);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new EmptyMatrixException("Matrix is empty");
            }
        });

        Assertions.assertEquals("Matrix is empty", thrown.getMessage());
    }

    @Test
    void testEmptyMatrixException2() {
        int[][] emptyMatrix = new int[0][];
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            SquareMatrixSum test1 = new SquareMatrixSum(emptyMatrix);
        });

        Assertions.assertEquals("Index 0 out of bounds for length 0", thrown.getMessage());
    }






    @Test
    void testNonSquareException() {
        int[][] rectangleMatrix = createMatrix(2,3);
        NonSquareMatrixException thrown = Assertions.assertThrows(NonSquareMatrixException.class, () -> {
            SquareMatrixSum test1 = new SquareMatrixSum(rectangleMatrix);
        });

        Assertions.assertEquals("Matrix isn't square", thrown.getMessage());
    }

}
