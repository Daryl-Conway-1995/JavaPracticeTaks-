package com.qa;


public class PrimeChecker {
    public boolean isThisPrime(int inputNumber) {
        if (inputNumber <= 1) return false;

        for (int checkingNumber = 2; checkingNumber <= java.lang.Math.sqrt(inputNumber); checkingNumber++) {
            if (inputNumber % checkingNumber == 0) return false;
        }
        return true;
    }


    public String findPrimesBetween(int lowest, int highest) {
        int currentNumber;
        String outputString = "";
        for (currentNumber = lowest; currentNumber <= highest; currentNumber++) {
            if (isThisPrime(currentNumber)) {
                outputString += currentNumber + ",";
            }
        }
        return outputString;
    }
}
