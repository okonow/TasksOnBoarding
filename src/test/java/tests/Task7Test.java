package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyLineException;
import org.tasks.task5.FindLongestWord;
import org.tasks.task7.MostSequenceOfSameSymbols;

public class Task7Test {
    @Test
    void handleTest() throws EmptyLineException {
        String line = "sdkfjjdfjjjjsfdfnlsileiee";
        MostSequenceOfSameSymbols test1 = new MostSequenceOfSameSymbols(line);
        int result = test1.lengthSequence();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testEmptyLineException() throws EmptyLineException {
        String line = "";
        EmptyLineException thrown = Assertions.assertThrows(EmptyLineException.class, () -> {
            MostSequenceOfSameSymbols test1 = new MostSequenceOfSameSymbols(line);
        });

        Assertions.assertEquals("Line is empty", thrown.getMessage());
    }
}
