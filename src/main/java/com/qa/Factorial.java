package com.qa;

public class Factorial {
    public boolean isThisFactorial(int number) {
        if (number < 1) return false;
        int compared = 1, step = 2;

        while (compared < number) {
            compared = compared * step;
            step++;
        }

        return  (compared == number);
    }
}
