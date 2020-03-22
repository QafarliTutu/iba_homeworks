package Homework10;

import Homework10.controller.FamilyController;
import Homework10.model.Human;
import Homework10.model.Pet;
import Homework10.model.Species;
import Homework10.service.FamilyService;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {
        FamilyController familyController = new FamilyController(new FamilyService());
        Human woman = new Human();
        woman.setName("Maya");woman.setSurname("Miller");woman.setBirthDate("11/03/2001");
        Human man = new Human();
        Human child = new Human("Amy","Jackson","15/04/2006",74);
        familyController.displayAllFamilies();
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.countFamiliesWithMemberNumber();
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.getFamiliesBiggerThan(3);
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.getFamiliesLessThan(3);
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.createNewFamily(woman,man);
        familyController.displayAllFamilies();
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.deleteFamilyByIndex(3);
        familyController.displayAllFamilies();
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.bornChild(familyController.getFamilyById(2),"masculine");
        familyController.bornChild(familyController.getFamilyById(2),"masculine");
        familyController.displayAllFamilies();
        System.out.println("---------------------------------------------------------------------------------------");
        familyController.deleteAllChildrenOlderThan(18);
        familyController.displayAllFamilies();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(familyController.count());
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(familyController.getFamilyById(2));
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(familyController.getPets(2));
        System.out.println("---------------------------------------------------------------------------------------");
        Pet pet = new Pet(Species.DomesticCat, "Luky") {

            @Override
            public void respond(String nickname) {

            }
        };
        familyController.addPet(1, pet);
        System.out.println(familyController.getFamilyById(1));
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(familyController.adoptChild(familyController.getFamilyById(2),child));

    }
}



