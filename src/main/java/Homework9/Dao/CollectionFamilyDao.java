package Homework9.Dao;

import Homework9.model.Family;
import Homework9.model.Human;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> familyList=new ArrayList<>();

    {
        Human father = new Human("Alex", "Miller",1990);
        Human mother = new Human("Isabel", "Miller",1995);
        Human child = new Human("Martin", "Miller",2000);
        Human child2 = new Human("John", "Miller",2003);
        Family family = new Family(mother, father);
        family.addChild(child);
        family.addChild(child2);
        familyList.add(family);
        Human father1 = new Human("Niki", "Black",1973);
        Human mother1 = new Human("Kate", "Black",1972);
        Human child1 = new Human("Maya", "Black",2014);
        Family family1 = new Family(mother1, father1);
        family.addChild(child1);
        familyList.add(family1);
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (familyList.contains(familyList.get(index))) {
            return familyList.get(index);
        } else return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return familyList.remove(familyList.get(index));
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }
}
