package com.bl.birdsanctuarysystem;

public class Parrot extends Bird implements Flyable{

    Parrot(String id){
        this.id = id;
        name = "parrot";
        color = Color.GREEN;
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly");
    }
}
