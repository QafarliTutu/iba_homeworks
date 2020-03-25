package Homework12;

import Homework12.controller.FamilyController;
import Homework12.service.FamilyService;
import Homework12.model.Human;
import Homework12.model.Pet;
import Homework12.model.Species;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        FamilyApp familyApp = new FamilyApp();
        familyApp.run();


    }
}
