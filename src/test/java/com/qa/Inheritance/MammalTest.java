package com.qa.Inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class MammalTest {
    private Dog dog = new Dog(7);
    private Dog dog2 = new Dog();
    private Monkey monkey = new Monkey();

    @Test
    public void toStringTest() {
        assertEquals(dog.toString(),"dog, run play bark. 7");
        assertEquals(dog2.toString(),"dog, run play bark. 10");
        assertEquals(monkey.toString(),"Monkey Monkey Monkey");
    }

    @Test
    public void makeNoise() {
        assertEquals(dog.makeNoise(),"bark");
        assertEquals(dog2.makeNoise(),"bark");
        assertEquals(monkey.makeNoise(),"ook");
    }

    @Test
    public void setAge() {
        monkey.setAge(3);
        assertEquals(monkey.getAge(),3);
        dog.setAge(11);
        assertEquals(dog.getAge(),11);
        dog2.setAge(6);
        assertEquals(dog.getAge(),11);
        assertEquals(dog2.getAge(),6);
    }

    @Test
    public void interfaceTest(){
        assertEquals(monkey.interact(),"interface is operational");
    }
}