package Homework10.service;

import Homework10.Dao.CollectionFamilyDao;
import Homework10.Dao.FamilyDao;
import Homework10.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().stream().forEach(family -> System.out.println(getAllFamilies().indexOf(family) + " " + family + "\n"));
    }

    public List<Family> getFamiliesBiggerThan(int SpecifiedValue) {
        List<Family> BiggerFamilies = familyDao.getAllFamilies().stream().filter(family -> family.countFamily()>SpecifiedValue).collect(Collectors.toList());
        System.out.println(BiggerFamilies);
        return BiggerFamilies;
    }

    public List<Family> getFamiliesLessThan(int SpecifiedValue) {
        List<Family> LessFamilies = familyDao.getAllFamilies().stream().filter(family -> family.countFamily()>SpecifiedValue).collect(Collectors.toList());
        System.out.println(LessFamilies);
        return LessFamilies;
    }

    public List<Integer> countFamiliesWithMemberNumber() {
        List<Integer> counts = new ArrayList<>();
        familyDao.getAllFamilies().stream().forEach(family -> counts.add(family.countFamily()));
        System.out.println(counts);
        return counts;
    }

    public void createNewFamily(Human woman, Human man) {
        Family newfamily = new Family(woman, man);
        familyDao.getAllFamilies().add(newfamily);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.getAllFamilies().remove(index);
    }

    public Family bornChild(Family family, String type) {
        String[] ManNames = {"Robert","Michael","David","Richard","Jackson","Thomas","Mark","Paul","Kevin","Brian"};
        String[] WomanNames = {"Linda","Barbara","Lisa","Nancy","Helen","Laura","Jessica","Amy","Angela","Martha"};
        Random generator = new Random();
        Human human = null;
        if (type.equals("masculine")) {
            human=new Man();
            int randomIndex = generator.nextInt(ManNames.length);
            human.setName(ManNames[randomIndex]);
        } else if (type.equals("feminine")) {
            human=new Woman();
            int randomIndex = generator.nextInt(WomanNames.length);
            human.setName(WomanNames[randomIndex]);
        }
        human.setSurname(family.getFather().getSurname());
        human.setMother(family.getMother().getName());
        human.setFather(family.getFather().getName());
        family.getChildren().add(human);
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        family.getChildren().add(child);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies().stream().forEach(family -> family.getChildren().removeIf(child -> 2020 - child.getBirthDate().getYear() > age));
    }

    public int count() {
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index) {
        return familyDao.getFamilyByIndex(index).getPets();
    }

    public void addPet(int index, Pet pet) {
        familyDao.getFamilyByIndex(index).getPets().add(pet);
    }


}
