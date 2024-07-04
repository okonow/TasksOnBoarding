package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.exceptions.WrongCountOfCubesException;
import org.tasks.task3.SpiralMatrixSort;
import org.tasks.task9.CountStairSteps;

public class Task9Test {
    @Test
    void handleTest() throws WrongCountOfCubesException {
        CountStairSteps test1 = new CountStairSteps(5);
        int result = test1.count();
        int expected = 2;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void handleZeroCubesTest() throws WrongCountOfCubesException {
        CountStairSteps test1 = new CountStairSteps(0);
        int result = test1.count();
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testNegativeCubeCountException() throws EmptyMatrixException {

        WrongCountOfCubesException thrown = Assertions.assertThrows(WrongCountOfCubesException.class, () -> {
            CountStairSteps test1 = new CountStairSteps(-5);
        });
        Assertions.assertEquals("Such a number of cubes cannot exist", thrown.getMessage());
    }
}
