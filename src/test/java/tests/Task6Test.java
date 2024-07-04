package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyLineException;
import org.tasks.exceptions.IndexNotExistException;
import org.tasks.task4.FindWordByIndex;
import org.tasks.task5.FindLongestWord;
import org.tasks.task6.FindSubstringRewriteOthers;

import java.nio.charset.StandardCharsets;

public class Task6Test {

    @Test
    void handleTest() throws EmptyLineException, IndexNotExistException {
        StringBuilder line = new StringBuilder("Big fly flies in the sky");

        FindSubstringRewriteOthers test1 = new FindSubstringRewriteOthers(line, "fly", "elephant");
        StringBuilder result = new StringBuilder(test1.replace());
        StringBuilder expected = new StringBuilder("Big elephant flies in the sky");
        Assertions.assertEquals(expected.toString(), result.toString());
    }

    @Test
    void testEmptyLineException() throws EmptyLineException {
        StringBuilder line = new StringBuilder("");

        EmptyLineException thrown = Assertions.assertThrows(EmptyLineException.class, () -> {
            FindSubstringRewriteOthers test1 = new FindSubstringRewriteOthers(line, "fly", "elephant");
        });

        Assertions.assertEquals("Line is empty", thrown.getMessage());
    }
}
