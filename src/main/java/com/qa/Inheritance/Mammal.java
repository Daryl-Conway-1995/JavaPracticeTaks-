package com.qa.Inheritance;

abstract public class Mammal {
    private int age;

    @Override
    public String toString() {
        return "abstract class detetcted, an error has occured";
    }

    abstract public String makeNoise();

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
