package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task4.FindWordByIndex;

public class Task6Test {

    @Test
    void handleTest() {
        String line = "I love pizza, pizzing by my pizza!";
        FindWordByIndex test1 = new FindWordByIndex(line);
        String result = test1.find(2);
        Assertions.assertEquals("pizza", result);
    }
}
