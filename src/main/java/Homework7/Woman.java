package Homework7;

public class Woman extends Human {

    @Override
    public void greetPet() {
        System.out.println("Hello, my naughty cat " + getPet().getNickname());
    }
    public void makeUp(){
        System.out.println("I am going to make up!");

    }
}
