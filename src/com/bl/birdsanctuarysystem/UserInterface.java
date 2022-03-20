package com.bl.birdsanctuarysystem;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    int showMainMenu() {
        System.out.println("Select required option");
        System.out.println("   1. Add Bird \n   2. Remove Bird \n   3. Edit Bird \n   4. Print Bird \n   "+ Main.MAINEXIT +". Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }

    void print(Set birdList){
        for(Object bird: birdList){
            System.out.println(bird);
        }
    }

    void printFlyable(Set <Bird> birdList){
        for (Object bird : birdList){
            if(bird instanceof Flyable){
                ((Flyable)bird).fly();
            }
        }
    }

    void printSwimmable(Set <Bird> birdList){
        for (Object bird : birdList){
            if(bird instanceof Swimmable){
                Swimmable swimmableBird = (Swimmable)bird;
                swimmableBird.swim();
            }
        }
    }

//    void printEatable(Set <Bird> birdList){
//        for (Object bird : birdList){
//            bird.eat();
//            }
//        }
//    }
}
