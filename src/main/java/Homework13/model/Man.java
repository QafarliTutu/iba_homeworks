package Homework13.model;


import java.io.Serializable;

public class Man extends Human implements Serializable {
    @Override
    public void greetPet() {
        System.out.println("Hello," + getPet().getNickname());
    }

    public void repairCar(){
        System.out.println("I am going to repair my car!");
    }
}
