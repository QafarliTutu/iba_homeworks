package Homework13.service;

import Homework13.Dao.CollectionFamilyDao;
import Homework13.Dao.FamilyDao;
import Homework13.model.Family;
import Homework13.model.Human;
import Homework13.model.Pet;
import Homework13.model.Type;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static Homework13.Dao.CollectionFamilyDao.getFamilyList;

public class FamilyService  {
    private FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() throws IOException, ClassNotFoundException {
        return familyDao.getAllFamilies();
    }
    public void displayAllFamilies() throws IOException, ClassNotFoundException {
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> System.out.println(family.prettyFormat() + "\n"));
    }

    public List<Family> getFamiliesBiggerThan(int SpecifiedValue) throws IOException, ClassNotFoundException {
        List<Family> BiggerFamilies = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()>SpecifiedValue)
                .collect(Collectors.toList());
        return BiggerFamilies;
    }

    public List<Family> getFamiliesLessThan(int SpecifiedValue) throws IOException, ClassNotFoundException {
        List<Family> LessFamilies = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()<SpecifiedValue)
                .collect(Collectors.toList());
        return LessFamilies;
    }

    public List<Integer> countAllFamiliesWithMemberNumber() throws IOException, ClassNotFoundException {
        List<Integer> counts = new ArrayList<>();
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> counts.add(family.countFamily()));
        return counts;
    }

    public void createNewFamily(Human woman, Human man) throws IOException, ClassNotFoundException {
        Family newfamily = new Family(woman, man);
        familyDao.getAllFamilies().add(newfamily);
        familyDao.downloadData(getFamilyList());
    }

    public void createNewFam() throws IOException {
        familyDao.createNewFam();
    }

    public void deleteFamilyById(int id) throws IOException, ClassNotFoundException {
        familyDao.deleteFamily(id);
    }

    public Family bornChild(Family family, Type type, String name) throws IOException, ClassNotFoundException {
        Human child= new Human(type, name, family.getFather().getSurname(), String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        familyDao.getFamilyById(family.getId()).get().getChildren().add(child);
        familyDao.downloadData(getFamilyList());
        return family;
    }

    public Family adoptChild(Family family, Human child) throws IOException, ClassNotFoundException {
        familyDao.getFamilyById(family.getId()).get().getChildren().add(child);
        familyDao.downloadData(getFamilyList());
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) throws IOException, ClassNotFoundException {
        familyDao.getAllFamilies()
                .stream()
                .forEach(family -> family.getChildren().removeIf(child -> 2020 - child.getBirthDate().getYear() > age));
        familyDao.downloadData(getFamilyList());
    }

    public int count() throws IOException, ClassNotFoundException {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int id) throws IOException, ClassNotFoundException {
        return familyDao.getFamilyById(id).orElseThrow(()->new IllegalArgumentException("Family cannot found."));
    }

    public Set<Pet> getPets(int id) throws IOException, ClassNotFoundException {
      return familyDao.getFamilyById(id).get().getPet();

    }

    public void addPet(int id, Pet pet) throws IOException, ClassNotFoundException {
        familyDao.getFamilyById(id).get().getPet().add(pet);
        familyDao.downloadData(getFamilyList());
    }

    public List<Family> countFamiliesByMemberNumber(int spNumber) throws IOException, ClassNotFoundException {
        List<Family> families = familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily()==spNumber)
                .collect(Collectors.toList());
        return families;
    }

    public void downloadData() throws IOException, ClassNotFoundException {
        familyDao.downloadData(familyDao.getAllFamilies());
    }
}
