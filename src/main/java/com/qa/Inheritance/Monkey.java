package com.qa.Inheritance;

public class Monkey extends Mammal implements AnimalInterface {
    private int height;

    @Override
    public String makeNoise() {
        return "ook";
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Monkey Monkey Monkey";
    }

    @Override
    public String interact() {
        return "interface is operational";
    }
}
