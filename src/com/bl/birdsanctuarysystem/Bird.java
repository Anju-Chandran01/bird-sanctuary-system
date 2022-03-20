package com.bl.birdsanctuarysystem;

import java.util.Objects;

public abstract class Bird {

    abstract void fly();

    enum Color { GREEN, WHITE, BLACK_WHITE }

    String id;
    String name;
    Color color;

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id);
    }

    void eat(){
        System.out.println(getClass().getSimpleName() + " can eat");
    }
//
//    void fly(){
//        System.out.println(getClass().getSimpleName() + " can fly");
//    }
//
//    void swim(){
//        System.out.println(getClass().getSimpleName() + " can swim");
//    }
}
