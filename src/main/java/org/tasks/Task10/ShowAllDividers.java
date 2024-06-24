package org.tasks.Task10;

import java.util.ArrayList;
import java.util.Stack;

public class ShowAllDividers {
    int n, m;
    public ShowAllDividers(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public ArrayList<String> Dividers() {

        ArrayList<String> dividers = new ArrayList<>();

        for (int i = 2; i < n/2 ; i++) {
            if (n % i == 0) {
                dividers.add(i + "");
            }
        }

        return dividers;
    }

}
