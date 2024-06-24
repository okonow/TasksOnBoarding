package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task4.FindWordByIndex;
import org.tasks.Task5.FindLongestWord;

public class Task5Test {

    @Test
    void handleTest() {
        String line = "I love pizza, walking by my tongue!";
        FindLongestWord test1 = new FindLongestWord(line);
        String result = test1.MaxLength();
        Assertions.assertEquals("walking", result);
    }
}
