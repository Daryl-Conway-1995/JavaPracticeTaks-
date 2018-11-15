package com.qa;

public class UniqueSum {
    public int calculateSum(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) return 0;
        if (firstNumber == secondNumber) return thirdNumber;
        if (firstNumber == thirdNumber) return secondNumber;
        if (secondNumber == thirdNumber) return firstNumber;
        return firstNumber + secondNumber + thirdNumber;
    }
}
