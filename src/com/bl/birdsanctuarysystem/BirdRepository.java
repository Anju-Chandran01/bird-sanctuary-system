package com.bl.birdsanctuarysystem;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {

    private Set<Bird> birdSet = new HashSet();

    Set getBirdList(){
        return birdSet;
    }

    void add(Bird bird){
        birdSet.add(bird);
    }

    void remove(Bird bird){
        birdSet.remove(bird);
    }

//    Bird getBird(String id) {
//        for (Bird bird: birdSet){
//            if(bird.id equals(id)){
//            }
//        }
//        return null;
//    }
}
