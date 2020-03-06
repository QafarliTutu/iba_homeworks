package Homework9.controller;

import Homework9.model.Family;
import Homework9.model.Human;
import Homework9.model.Pet;
import Homework9.service.FamilyService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
      familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int SpecifiedValue) {
        familyService.getFamiliesBiggerThan(SpecifiedValue);
    }

    public void getFamiliesLessThan(int SpecifiedValue) {
        familyService.getFamiliesLessThan(SpecifiedValue);
    }

    public void countFamiliesWithMemberNumber() {
       familyService.countFamiliesWithMemberNumber();
    }

    public void createNewFamily(Human woman, Human man) {
        familyService.createNewFamily(woman, man);
    }

    public Family bornChild(Family family, String type){
        return familyService.bornChild(family,type);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
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

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public Set<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}
