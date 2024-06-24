package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task1.SquareMatrixSum;
import org.tasks.Task4.FindWordByIndex;

public class Task4Test {

    @Test
    void handleTest(){
        String line = "I love pizza, walking by my tongue!";
        FindWordByIndex test1 = new FindWordByIndex(line);
        String result = test1.Find(2);
        Assertions.assertEquals("pizza", result);
    }
}
