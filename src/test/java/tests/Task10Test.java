package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.Task10.ShowAllDividers;
import org.tasks.Task3.SpiralMatrixSort;
import org.tasks.Task7.MostSequenceOfSameSymbols;

import java.util.ArrayList;

public class Task10Test {
    @Test
    void handleTest(){
        int number;
        ShowAllDividers test1 = new ShowAllDividers(3,20);
        ArrayList<int[]> result = test1.Dividers();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }
}
