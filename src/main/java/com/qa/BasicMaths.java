package com.qa;

public class BasicMaths {

    public int addition(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    public double addition(double firstDouble, double secondDouble) {
        return firstDouble + secondDouble;
    }

    public int subtraction(int firstInt, int secondInt) {
        return firstInt - secondInt;
    }

    public double subtraction(double firstDouble, double secondDouble) {
        return firstDouble - secondDouble;
    }

    public int multiply(int firstInt, int secondInt) {
        return firstInt * secondInt;
    }

    public double multiply(double firstDouble, double secondDouble) {
        return firstDouble * secondDouble;
    }

    public double divide(int firstInt, int secondInt) {
        return 1.00 * (firstInt / secondInt);
    }

    public double divide(double firstDouble, double secondDouble) {
        return firstDouble / secondDouble;
    }

    public double power(double base, double power){
        return StrictMath.pow(base,power);
    }

    public double squareRoot(double number){
        return StrictMath.sqrt(number);
    }
}

