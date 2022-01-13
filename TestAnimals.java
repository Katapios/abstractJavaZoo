package com.katapios.animals;

public class TestAnimals {

    //object must be static in static main method
    static Cat cat = new Cat("Janki");
    static Cat homelessCat = new Cat();

    //spider does not implements Pet class
    static Spider spidy = new Spider();

    //lets put it in Animal object
    //dont forget to cust it to Fish
    static Animal myFish = new Fish();

    public static void main(String[] args) {
        //cat.setName("Vasya");
        System.out.println(cat.getName());
        cat.eat();
        cat.play();
        cat.walk();
        System.out.println("");

        System.out.println(homelessCat.getName());
        homelessCat.eat();
        homelessCat.walk();
        homelessCat.play();
        System.out.println("");

        spidy.eat();
        spidy.walk();

        System.out.println("");

        //dont forget to cust it to Fish because Animal dosn't have "set/get name" and "play" methods;
        ((Fish) myFish).setName("Flaunders");

        System.out.println(((Fish) myFish).getName());
        myFish.eat();
        ((Fish) myFish).play();
        myFish.walk();
    }

}
