package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task13.CountOddEvenDigitsInNumber;
import org.tasks.Task3.SpiralMatrixSort;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task13Test {
    @Test
    void handleTest(){
        CountOddEvenDigitsInNumber test1 = new CountOddEvenDigitsInNumber(12345);

        int expectedEven = 2;
        int resultEven = test1.getEvenDigits();

        int expectedOdd = 3;
        int resultOdd = test1.getOddDigits();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedEven, resultEven),
                () -> Assertions.assertEquals(expectedOdd, resultOdd)
        );
    }
}
