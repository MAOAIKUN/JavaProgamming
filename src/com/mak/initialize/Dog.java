package com.mak.initialize;


public class Dog {
    private Toy toy = new Toy();

    public Dog(){
        System.out.println("dog constructor");
    }


    public static void main(String[] args) {
        new Dog();
    }
}

class Toy{

    public Toy(){
        System.out.println("toy constructor");
    }
}
