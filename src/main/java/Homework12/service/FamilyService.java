package Homework12.service;

import Homework12.Dao.CollectionFamilyDao;
import Homework12.Dao.FamilyDao;
import Homework12.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> System.out.println(family.prettyFormat() + "\n"));
    }

    public List<Family> getFamiliesBiggerThan(int SpecifiedValue) {
        List<Family> BiggerFamilies = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()>SpecifiedValue)
                .collect(Collectors.toList());
        return BiggerFamilies;
    }

    public List<Family> getFamiliesLessThan(int SpecifiedValue) {
        List<Family> LessFamilies = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()<SpecifiedValue)
                .collect(Collectors.toList());
        return LessFamilies;
    }

    public List<Integer> countAllFamiliesWithMemberNumber() {
        List<Integer> counts = new ArrayList<>();
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> counts.add(family.countFamily()));
        return counts;
    }

    public void createNewFamily(Human woman, Human man) {
        Family newfamily = new Family(woman, man);
        familyDao.getAllFamilies().add(newfamily);
    }

    public void createNewFam(){
        familyDao.createNewFam();
    }

    public void deleteFamilyById(int id) {
        familyDao.deleteFamily(id);
    }

    public Family bornChild(Family family, Type type, String name) {
        Human child= new Human(type, name, family.getFather().getSurname(), String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        family.getChildren().add(child);
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.getChildren().add(child);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> family.getChildren().removeIf(child -> 2020 - child.getBirthDate().getYear() > age));
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int id) {
        return familyDao.getFamilyById(id).orElseThrow(()->new IllegalArgumentException("Family cannot found."));
    }

    public Set<Pet> getPets(int id) {
      return familyDao.getFamilyById(id).get().getPet();

    }

    public void addPet(int id, Pet pet) {
        familyDao.getFamilyById(id).get().getPet().add(pet);
    }

    public List<Family> countFamiliesByMemberNumber(int spNumber) {
        List<Family> families = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()==spNumber)
                .collect(Collectors.toList());
        return families;
    }
}
