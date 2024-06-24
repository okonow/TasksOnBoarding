package org.tasks;


import org.tasks.Task3.SpiralMatrixSort;
import org.tasks.Task4.FindWordByIndex;
import org.tasks.Task5.FindLongestWord;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[][] createMatrix(int size) {
        int [][] matrix = new int[size][size];
        for (int rowCount = 0; rowCount < size; rowCount++) {
            for (int colCount = 0; colCount < size; colCount++) {
                matrix[rowCount][colCount] = colCount + rowCount;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {



        int[][] matrix = createMatrix(4);

        //SpiralMatrixSort test = new SpiralMatrixSort(matrix);
        //test.Sort();
        //System.out.println(Arrays.deepToString(test.matrix));
        String line = "I love pizza, walking on my tongue";
        FindWordByIndex line1 = new FindWordByIndex(line);
        System.out.printf(line1.indexedWords[2]);

        FindLongestWord line2 = new FindLongestWord(line);
        System.out.printf(line2.MaxLength());

    }
}