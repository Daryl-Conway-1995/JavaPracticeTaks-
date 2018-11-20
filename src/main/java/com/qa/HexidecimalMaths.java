package com.qa;

public class HexidecimalMaths {

    public String addition(String firstInt, String secondInt) {
        return convertToHex(convertFromHex(firstInt) + convertFromHex(secondInt));
    }


    public String subtraction(String firstInt, String secondInt) {
        return convertToHex(convertFromHex(firstInt) - convertFromHex(secondInt));
    }

    public String multiply(String firstInt, String secondInt) {
        return convertToHex(convertFromHex(firstInt) * convertFromHex(secondInt));
    }

    private int convertFromHex(String number) {
        return Integer.parseInt(number, 16);
    }

    private String convertToHex(int number) {
        return Integer.toHexString(number);
    }
}
