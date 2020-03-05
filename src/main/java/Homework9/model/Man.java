package Homework9.model;


public class Man extends Human {
    @Override
    public void greetPet() {
        System.out.println("Hello," + getPet().getNickname());
    }

    public void repairCar(){
        System.out.println("I am going to repair my car!");
    }
}
