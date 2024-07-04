package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.exceptions.WrongCountOfCubesException;
import org.tasks.task10.ShowAllDividers;
import org.tasks.task9.CountStairSteps;

import java.util.ArrayList;

public class Task10Test {
    @Test
    void handleTest() {
        int number;
        ShowAllDividers test1 = new ShowAllDividers(3, 20);
        ArrayList<int[]> result = test1.getDividers();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void handleZeroTest() {
        ShowAllDividers test1 = new ShowAllDividers(0,4);
        ArrayList<int[]> result = test1.getDividers();
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }
}
