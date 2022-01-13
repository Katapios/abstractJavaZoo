package com.katapios.animals;

public class Hedgehog implements Pet {

    private static String name;

    public static void hedgehogName() {
        System.out.println("hi, i am hedgehog! my name is " + name);
    }

    public static void gettingApple() {
        System.out.println("I have got an apple!");
    }

    @Override
    public String getName() {
        return "it name is: " + name;
    }

    @Override
    public void setName(String n) {
        Hedgehog.name = n;
    }

    @Override
    public void play() {
        System.out.println("I am playing like a hedgehog!");
    }
}
