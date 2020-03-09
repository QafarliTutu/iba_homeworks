package Homework7;

public class DomesticCat extends Pet {


    @Override
    public void respond() {
        System.out.println("Hello my lovely owner!");
    }

    @Override
    public void foul() {
        super.foul();
    }
}
