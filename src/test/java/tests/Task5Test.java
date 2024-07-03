package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyLineException;
import org.tasks.task5.FindLongestWord;

public class Task5Test {

    @Test
    void handleTest() throws EmptyLineException {
        String line = "I love pizza, walking by my tongue!";
        FindLongestWord test1 = new FindLongestWord(line);
        String result = test1.maxLength();
        Assertions.assertEquals("walking", result);
    }
}
