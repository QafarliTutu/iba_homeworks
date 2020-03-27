package Homework13.model;


import java.io.Serializable;

public class Dog extends Pet implements Serializable {


    @Override
    public void respond(String nickname) {

    }

    @Override
    public void foul() {
        super.foul();
    }
}
