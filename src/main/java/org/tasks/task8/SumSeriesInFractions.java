package org.tasks.task8;

public class SumSeriesInFractions {

    int n;
    int dividend = 1;

    public SumSeriesInFractions(int n) {
        this.n = n;
    }

    String fractionReduce(int divider) {

        int integer = 0, remainder = 0;
        if (divider != 0) {
            integer = dividend / divider;
            remainder = dividend & divider;
        }
        String frac = "";
        if (integer != 0) {
            frac += integer;
        }
        if (remainder != 0) {

            frac += "(" + remainder + "/" + divider + ")";
        }
        return frac;
    }

    public double rowSum() {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }


}
