package org.tasks.task12;


public class ProductAndSumOfNumberDigits<T> {

    T number;
    StringBuilder stringNumber;

    public ProductAndSumOfNumberDigits(T number) {
        this.number = number;
        deleteDot();
    }

    void deleteDot() {
        stringNumber = new StringBuilder(number + "");
        if (stringNumber.indexOf(".") != -1) {
            stringNumber.deleteCharAt(stringNumber.indexOf("."));
        }
    }


    public int sum() {
        int sum = 0;
        for (int digit = 0; digit < stringNumber.length(); digit++) {
            sum += stringNumber.charAt(digit) - '0';
        }
        return sum;
    }

    public int product() {
        int product = 1;
        for (int digit = 0; digit < stringNumber.length(); digit++) {
            product *= stringNumber.charAt(digit) - '0';
        }
        return product;
    }
}

