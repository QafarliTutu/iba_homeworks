package Homework13.model;

import java.io.Serializable;

public class Woman extends Human implements Serializable {

    @Override
    public void greetPet() {
        System.out.println("Hello, my naughty cat " + getPet().getNickname());
    }
    public void makeUp(){
        System.out.println("I am going to make up!");
    }

}
