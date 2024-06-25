package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task11.CountDigitsInNumber;
import org.tasks.Task3.SpiralMatrixSort;

public class Task11Test {
    @Test
    void handleTest(){
        CountDigitsInNumber<Integer> test1 = new CountDigitsInNumber<Integer>(12345);
        int expected = 5;
        int result = test1.Count();
        Assertions.assertEquals(expected, result);
    }
}
