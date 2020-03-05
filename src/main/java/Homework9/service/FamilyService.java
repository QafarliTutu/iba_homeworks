package Homework9.service;


import Homework9.Dao.CollectionFamilyDao;
import Homework9.Dao.FamilyDao;
import Homework9.model.*;

import java.util.List;
import java.util.Set;

public class FamilyService {
    private FamilyDao familyDao = new CollectionFamilyDao();
    String masculine;
    String feminine;

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        for (Family family : familyDao.getAllFamilies()) {
            System.out.println(getAllFamilies().indexOf(family) + " " + family + "\n");
        }
    }

    public void getFamiliesBiggerThan(int SpecifiedValue) {
        for (Family family : familyDao.getAllFamilies()) {
            if (family.countFamily() > SpecifiedValue) {
                System.out.println(family);
            }
        }
    }

    public void getFamiliesLessThan(int SpecifiedValue) {
        for (Family family : familyDao.getAllFamilies()) {
            if (family.countFamily() < SpecifiedValue) {
                System.out.println(family);
            }
        }
    }

    public void countFamiliesWithMemberNumber() {
        for (Family family : familyDao.getAllFamilies()) {
            System.out.println(family.countFamily() + "\n");
        }
    }

    public void createNewFamily(Human woman, Human man) {
        Family newfamily = new Family(woman, man);
        familyDao.getAllFamilies().add(newfamily);
    }

    public void deleteFamilyByIndex(int index) {
        familyDao.getAllFamilies().remove(index);
    }

    public Family bornChild(Family family, String type) {
        Human human = null;
        if (type.equals(masculine)) {
            human=new Man();
        } else if (type.equals(feminine)) {
            human=new Woman();
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
        for (Family family : familyDao.getAllFamilies()) {
            family.getChildren().removeIf(child -> 2020 - child.getYear() > age);
        }
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
