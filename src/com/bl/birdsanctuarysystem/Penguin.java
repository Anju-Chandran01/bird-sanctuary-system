package com.bl.birdsanctuarysystem;

public class Penguin extends Bird implements Swimmable{

    Penguin(String id){
        this.id = id;
        name = "Penguin";
        color = Color.BLACK_WHITE;
    }
    @Override
    void fly(){
        System.out.println("Penguin can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
