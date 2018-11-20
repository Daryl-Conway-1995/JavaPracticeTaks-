package com.qa;

public class BinaryMaths {

    public int addition(int firstInt, int secondInt) {
        return convertFromBinary(firstInt) + convertFromBinary(secondInt);
    }

    public int subtraction(int firstInt, int secondInt) {
        return convertFromBinary(firstInt) - convertFromBinary(secondInt);
    }

    public int multiply(int firstInt, int secondInt) {
        return convertFromBinary(firstInt) * convertFromBinary(secondInt);
    }


    public int additionBaseX(int firstInt, int secondInt, int base) {
        return convertFromBaseX(firstInt, base) + convertFromBaseX(secondInt, base);
    }

    public int convertToBinary(int number) {
        return Integer.parseInt(Integer.toBinaryString(number));
    }

    private int convertFromBinary(int binaryBase) {
        String binaryString = String.valueOf(binaryBase);
        return Integer.parseInt(binaryString, 2);
    }

    private int convertFromBaseX(int inputNumber, int currentBase) {
        String binaryString = String.valueOf(inputNumber);
        return Integer.parseInt(binaryString, currentBase);
    }
}
