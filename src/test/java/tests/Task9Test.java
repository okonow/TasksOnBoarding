package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task3.SpiralMatrixSort;
import org.tasks.Task9.CountStairSteps;

public class Task9Test {
    @Test
    void handleTest(){
        CountStairSteps test1 = new CountStairSteps(5);
        int result = test1.Count();
        int expected = 2;
        Assertions.assertEquals(expected, result);
    }
}
