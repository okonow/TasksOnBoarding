package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task7.MostSequenceOfSameSymbols;

public class Task7Test {
    @Test
    void handleTest(){
        String line = "sdkfjjdfjjjjsfdfnlsileiee";
        MostSequenceOfSameSymbols test1 = new MostSequenceOfSameSymbols(line);
        int result = test1.lengthSequence();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }
}
