package com.qa.Inheritance;

public class Dog extends Mammal {
    public Dog(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Dog() {
        maxSpeed = 10;
    }

    private int maxSpeed;

    @Override
    public String makeNoise() {
        return "bark";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "dog, run play bark. " + maxSpeed;
    }
}
