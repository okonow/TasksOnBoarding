package org.tasks.Task12;



public class ProductAndSumOfNumberDigits<T> {

    T number;
    StringBuilder stringNumber;

    public ProductAndSumOfNumberDigits(T number) {
        this.number = number;
        DeleteDot();
    }

    void DeleteDot() {
        stringNumber = new StringBuilder(number + "");
        if (stringNumber.indexOf(".") != -1) {
            stringNumber.deleteCharAt(stringNumber.indexOf("."));
        }
    }


    public int Sum() {
        int sum = 0;
        for (int digit = 0; digit < stringNumber.length(); digit++ ) {
            sum += stringNumber.charAt(digit) - '0';
        }
        return sum;
    }

    public int Product() {
        int product = 1;
        for (int digit = 0; digit < stringNumber.length(); digit++ ) {
            product *= stringNumber.charAt(digit) - '0';
        }
        return product;
    }
}

