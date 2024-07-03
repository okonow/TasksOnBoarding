package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task9.CountStairSteps;

public class Task9Test {
    @Test
    void handleTest(){
        CountStairSteps test1 = new CountStairSteps(5);
        int result = test1.count();
        int expected = 2;
        Assertions.assertEquals(expected, result);
    }
}
