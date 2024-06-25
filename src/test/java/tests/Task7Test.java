package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task3.SpiralMatrixSort;
import org.tasks.Task7.MostSequenceOfSameSymbols;
import org.tasks.Task9.CountStairSteps;

public class Task7Test {
    @Test
    void handleTest(){
        String line = "sdkfjjdfjjjjsfdfnlsileiee";
        MostSequenceOfSameSymbols test1 = new MostSequenceOfSameSymbols(line);
        int result = test1.LengthSequence();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }
}
