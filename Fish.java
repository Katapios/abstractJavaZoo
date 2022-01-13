package com.katapios.animals;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
        name = "Goldy";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public void play() {
        System.out.println("fish don't play");
    }

    @Override
    public void walk() {
        System.out.println("fish don't walk");
    }

    @Override
    public void eat() {
        System.out.println("fish eats feeder");
    }
}
