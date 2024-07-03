package org.tasks.task14;

import java.util.ArrayList;

public class DisplayFibonacciNumbersSeries {

    int n;

    public DisplayFibonacciNumbersSeries(int n) {
        this.n = n;
    }

    public ArrayList<Integer> writeFibonacciSeries() {
        ArrayList<Integer> fibonacciSeries = new ArrayList<Integer>();
        fibonacciSeries.add(0);
        if (n == 1 || n == 2 || n > 2) {
            for (int i = 0; i < 2; i++) {
                fibonacciSeries.add(1);
            }

            if (n > 2) {
                for (int i = 3; i < n + 1; i++) {
                    fibonacciSeries.add(fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2));
                }
            }

        }

        return fibonacciSeries;
    }

}