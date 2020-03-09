package Homework7;

public class Dog extends Pet{
    @Override
    public void respond() {
        System.out.println("Hello owner!");
    }

    @Override
    public void foul() {
        super.foul();
    }
}
