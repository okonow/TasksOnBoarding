package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task11.CountDigitsInNumber;

public class Task11Test {
    @Test
    void handleTest(){
        CountDigitsInNumber<Integer> test1 = new CountDigitsInNumber<Integer>(12345);
        int expected = 5;
        int result = test1.count();
        Assertions.assertEquals(expected, result);
    }
}
