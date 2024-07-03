package org.tasks;


import org.tasks.task2.DiagonalMatrixSort;
import org.tasks.exceptions.EmptyArrayException;
import org.tasks.exceptions.EmptyMatrixException;
import org.tasks.task3.SpiralMatrixSort;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws EmptyMatrixException, EmptyArrayException {

        int[][] matrix = {{12,11,4,12},{43,3,6,5},{76,20,45,12},{68,63,15,70}};
        SpiralMatrixSort bebe = new SpiralMatrixSort(matrix);
        bebe.showMatrix();
        bebe.sort();
        bebe.showMatrix();

    }
}