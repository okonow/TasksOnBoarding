package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task1.SquareMatrixSum;

import static org.junit.Assert.assertEquals;
import static tests.CreateSquareMatrix.createMatrix;

public class Task1Test {



    int[][] matrix = createMatrix(4);

    @Test
    void handleTest(){
        SquareMatrixSum test1 = new SquareMatrixSum(matrix);
        int result = test1.SumOfAllElementsBesidesTheDiagonals();
        Assertions.assertEquals(126, result);
    }


}
