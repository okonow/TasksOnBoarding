package tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.tasks.Task3.SpiralMatrixSort;
import static tests.CreateSquareMatrix.createMatrix;

public class Task3Test {

    int[][] matrix = createMatrix(7);

    @Test
    void handleTest(){
        SpiralMatrixSort test1 = new SpiralMatrixSort(matrix);
        Assertions.assertEquals("", "");
    }

}
