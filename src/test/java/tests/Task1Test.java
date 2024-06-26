package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task1.EmptyMatrixException;
import org.tasks.Task1.NonSquareMatrixException;
import org.tasks.Task1.SquareMatrixSum;

import static org.junit.Assert.assertEquals;
import static tests.CreateSquareMatrix.createMatrix;

public class Task1Test {



    @Test
    public void handleBasicTest() {
        int[][] basicMatrix = createMatrix(4,4);
        SquareMatrixSum test1 = new SquareMatrixSum(basicMatrix);
        int result = test1.sumAllElementsBesideMainDiagonal();
        Assertions.assertEquals(90, result);
    }

    @Test
    public void handleEmptyTest() {
        int[][] emptyMatrix = new int[0][];
        SquareMatrixSum test1 = new SquareMatrixSum(emptyMatrix);
        int result = test1.sumAllElementsBesideMainDiagonal();
        Assertions.assertThrows(EmptyMatrixException.class, () -> {
            test1.sumAllElementsBesideMainDiagonal();
        });
    }

    @Test
    public void handleNonSquareTest() {
        int[][] rectangleMatrix = createMatrix(2,3);
        SquareMatrixSum test1 = new SquareMatrixSum(rectangleMatrix);
        int result = test1.sumAllElementsBesideMainDiagonal();
        Assertions.assertThrows(NonSquareMatrixException.class, () -> {
            test1.sumAllElementsBesideMainDiagonal();
        });
    }

}
