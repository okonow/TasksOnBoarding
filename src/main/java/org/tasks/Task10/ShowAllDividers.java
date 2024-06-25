package org.tasks.Task10;

import java.util.ArrayList;
import java.util.Stack;

public class ShowAllDividers {
    int n, m;
    public ShowAllDividers(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public ArrayList<int[]> Dividers() {

        ArrayList<int[]> dividers = new ArrayList<>();

        for (int number = m; number < n; number++) {
            int[] a = new int[number];
            dividers.add(a);
            for (int divider = 2; divider < number ; divider++) {
                if (n % divider == 0) {
                    dividers.getLast()[divider] = divider;
                }
            }
        }


        return dividers;
    }

}
