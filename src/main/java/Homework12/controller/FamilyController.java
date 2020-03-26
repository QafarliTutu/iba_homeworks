package Homework12.controller;

import Homework12.model.Family;
import Homework12.model.Human;
import Homework12.model.Pet;
import Homework12.model.Type;
import Homework12.service.FamilyService;

import java.util.List;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
      familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int SpecifiedValue) {
        familyService.getFamiliesBiggerThan(SpecifiedValue).forEach(family -> System.out.println(family.prettyFormat()));
    }

    public void getFamiliesLessThan(int SpecifiedValue) {
        familyService.getFamiliesLessThan(SpecifiedValue).forEach(family -> System.out.println(family.prettyFormat()));
    }

    public void countAllFamiliesWithMemberNumber() {
        System.out.println(familyService.countAllFamiliesWithMemberNumber());
    }

    public void createNewFamily(Human woman, Human man) {
        familyService.createNewFamily(woman, man);
    }

    public void createNewFam(){
        familyService.createNewFam();
    }

    public Family bornChild(Family family, Type type, String name){
        return familyService.bornChild(family,type,name);
    }

    public void deleteFamilyById(int id) {
        familyService.deleteFamilyById(id);
    }

    public Family adoptChild(Family family, Human child) {
      return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
       familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    public Set<Pet> getPets(int id) {
        return familyService.getPets(id);
    }

    public void addPet(int id, Pet pet) {
        familyService.addPet(id, pet);
    }

    public void countFamiliesByMemberNumber(int spNumber) {
        familyService.countFamiliesByMemberNumber(spNumber).stream().forEach(family -> System.out.println(family.prettyFormat()));
    }
}
