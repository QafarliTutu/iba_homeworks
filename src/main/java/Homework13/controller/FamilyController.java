package Homework13.controller;

import Homework13.model.Family;
import Homework13.model.Human;
import Homework13.model.Pet;
import Homework13.model.Type;
import Homework13.service.FamilyService;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() throws IOException, ClassNotFoundException {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() throws IOException, ClassNotFoundException {
      familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int SpecifiedValue) throws IOException, ClassNotFoundException {
        familyService.getFamiliesBiggerThan(SpecifiedValue).forEach(family -> System.out.println(family.prettyFormat()));
    }

    public void getFamiliesLessThan(int SpecifiedValue) throws IOException, ClassNotFoundException {
        familyService.getFamiliesLessThan(SpecifiedValue).forEach(family -> System.out.println(family.prettyFormat()));
    }

    public void countAllFamiliesWithMemberNumber() throws IOException, ClassNotFoundException {
        System.out.println(familyService.countAllFamiliesWithMemberNumber());
    }

    public void createNewFamily(Human woman, Human man) throws IOException, ClassNotFoundException {
        familyService.createNewFamily(woman, man);
    }

    public void createNewFam() throws IOException {
        familyService.createNewFam();
    }

    public Family bornChild(Family family, Type type, String name) throws IOException, ClassNotFoundException {
        return familyService.bornChild(family,type,name);
    }

    public void deleteFamilyById(int id) throws IOException, ClassNotFoundException {
        familyService.deleteFamilyById(id);
    }

    public Family adoptChild(Family family, Human child) throws IOException, ClassNotFoundException {
      return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) throws IOException, ClassNotFoundException {
       familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() throws IOException, ClassNotFoundException {
        return familyService.count();
    }

    public Family getFamilyById(int id) throws IOException, ClassNotFoundException {
        return familyService.getFamilyById(id);
    }

    public Set<Pet> getPets(int id) throws IOException, ClassNotFoundException {
        return familyService.getPets(id);
    }

    public void addPet(int id, Pet pet) throws IOException, ClassNotFoundException {
        familyService.addPet(id, pet);
    }

    public void countFamiliesByMemberNumber(int spNumber) throws IOException, ClassNotFoundException {
        familyService.countFamiliesByMemberNumber(spNumber).stream().forEach(family -> System.out.println(family.prettyFormat()));
    }

    public void downloadData() throws IOException, ClassNotFoundException {
         familyService.downloadData();
    }
}
