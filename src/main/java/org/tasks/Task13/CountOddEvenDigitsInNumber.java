package org.tasks.Task13;

import java.util.ArrayList;

public class CountOddEvenDigitsInNumber {

    public ArrayList<Integer> oddDigits = new ArrayList<Integer>();
    public ArrayList<Integer> evenDigits = new ArrayList<Integer>();
    int number;
    public CountOddEvenDigitsInNumber(int number) {
        this.number = number;
        OddEvenDigits();
    }

    void OddEvenDigits() {
        StringBuilder stringNumber = new StringBuilder(number + "");
        for (int charIndex = 0; charIndex < stringNumber.length(); charIndex++) {
            int currentDigit = stringNumber.charAt(charIndex) - '0';
            if (currentDigit % 2 == 0) {
                evenDigits.add(currentDigit);
            }
            else {
                oddDigits.add(currentDigit);
            }
        }
    }


}
