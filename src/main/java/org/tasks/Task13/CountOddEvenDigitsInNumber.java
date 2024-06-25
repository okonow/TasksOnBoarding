package org.tasks.Task13;

import java.util.ArrayList;

public class CountOddEvenDigitsInNumber {

    //ArrayList<Integer> oddDigits = new ArrayList<Integer>();
    //ArrayList<Integer> evenDigits = new ArrayList<Integer>();
    int oddDigits, evenDigits;
    int number;

    public int getOddDigits() {
        return oddDigits;
    }

    public int getEvenDigits() {
        return evenDigits;
    }


    public CountOddEvenDigitsInNumber(int number) {
        this.number = number;
        OddEvenDigits();
    }

    void OddEvenDigits() {

        StringBuilder stringNumber = new StringBuilder(number + "");
        evenDigits = 0;
        oddDigits = 0;
        for (int charIndex = 0; charIndex < stringNumber.length(); charIndex++) {
            int currentDigit = stringNumber.charAt(charIndex) - '0';
            if (currentDigit % 2 == 0) {
                evenDigits++;
            }
            else {
                oddDigits++;
            }
        }
    }


}
