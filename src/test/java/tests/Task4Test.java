package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyLineException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.exceptions.IndexNotExistException;
import org.tasks.task2.DiagonalMatrixSort;
import org.tasks.task4.FindWordByIndex;

public class Task4Test {

    @Test
    void handleTest() throws EmptyLineException, IndexNotExistException {
        String line = "I love pizza, walking by my tongue!";
        FindWordByIndex test1 = new FindWordByIndex(line);
        String result = test1.find(2);
        Assertions.assertEquals("pizza", result);
    }

    @Test
    void testEmptyLineException() throws EmptyLineException {
        String line = "";

        EmptyLineException thrown = Assertions.assertThrows(EmptyLineException.class, () -> {
            FindWordByIndex test1 = new FindWordByIndex(line);
        });

        Assertions.assertEquals("Line is empty", thrown.getMessage());
    }

    @Test
    void testIndexNotExistException() throws EmptyLineException {
        String line = "ok";
        FindWordByIndex test1 = new FindWordByIndex(line);
        IndexNotExistException thrown = Assertions.assertThrows(IndexNotExistException.class, () -> {
            String result = test1.find(2);
        });

        Assertions.assertEquals("There is no word with this index", thrown.getMessage());
    }


}
