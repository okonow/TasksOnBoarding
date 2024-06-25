package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task12.ProductAndSumOfNumberDigits;
import org.tasks.Task3.SpiralMatrixSort;

public class Task12Test {
    @Test
    void handleTest(){
        ProductAndSumOfNumberDigits<Integer> test1 = new ProductAndSumOfNumberDigits<Integer>(12345);
        int expectedSum = 15;
        int resultSum = test1.Sum();
        int expectedProduct = 120;
        int resultProduct = test1.Product();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedSum, resultSum),
                () -> Assertions.assertEquals(expectedProduct, resultProduct)
        );
    }
}
