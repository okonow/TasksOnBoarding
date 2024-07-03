package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task12.ProductAndSumOfNumberDigits;

public class Task12Test {
    @Test
    void handleTest(){
        ProductAndSumOfNumberDigits<Integer> test1 = new ProductAndSumOfNumberDigits<Integer>(12345);
        int expectedSum = 15;
        int resultSum = test1.sum();
        int expectedProduct = 120;
        int resultProduct = test1.product();

        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedSum, resultSum),
                () -> Assertions.assertEquals(expectedProduct, resultProduct)
        );
    }
}
