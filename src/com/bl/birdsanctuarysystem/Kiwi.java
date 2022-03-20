package com.bl.birdsanctuarysystem;

public class Kiwi extends Bird implements Flyable{

    Kiwi(String id){
        this.id = id;
        name = "kiwi";
        color = Color.WHITE;
    }

    @Override
    public void fly() {

    }
}
