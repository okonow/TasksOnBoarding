package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task8.SumSeriesInFractions;

public class Task8Test {
    @Test
    void handleTest(){
        SumSeriesInFractions test1 = new SumSeriesInFractions(3);
        double result = test1.rowSum();
        double expected = 1.0 + 1.0/2 + 1.0/3;
        Assertions.assertEquals(expected, result);
    }
}
