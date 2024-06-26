package org.tasks.Task11;

public class CountDigitsInNumber<T> {
    T number;

    public CountDigitsInNumber(T number) {
        this.number = number;
    }

    public int count() {
        String stringNumber = number + "";
        int digitsCount = stringNumber.length();
        if (stringNumber.contains(".")) {
            digitsCount--;
        }
        return digitsCount;
    }
}
