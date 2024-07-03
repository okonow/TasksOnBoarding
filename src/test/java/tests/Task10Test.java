package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tasks.task10.ShowAllDividers;

import java.util.ArrayList;

public class Task10Test {
    @Test
    void handleTest(){
        int number;
        ShowAllDividers test1 = new ShowAllDividers(3,20);
        ArrayList<int[]> result = test1.getDividers();
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }
}
