package com.katapios.animals;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public Cat() {
        super(4);
        this.name = "Fluffy";
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
        System.out.println("cat plays!");
    }

    @Override
    public void eat() {
        System.out.println("cat eats fish");
    }
}
