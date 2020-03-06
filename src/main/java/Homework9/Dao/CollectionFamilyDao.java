package Homework9.Dao;

import Homework9.model.Family;
import Homework9.model.Human;
import Homework9.model.Pet;
import Homework9.model.Species;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> familyList = new ArrayList<>();

    {
        Human father = new Human("Alex", "Miller",1972);
        Human mother = new Human("Isabel", "Miller",1973);
        Human child1 = new Human("Martin", "Miller",2001);
        Human child2 = new Human("John", "Miller",2003);
        Family family = new Family(mother, father);
        family.addChild(child1);
        family.addChild(child2);
        familyList.add(family);

        Human father1 = new Human("Niki", "Black",1990);
        Human mother1 = new Human("Kate", "Black",1995);
        Human child1_1 = new Human("Maya", "Black",2014);
        Family family1 = new Family(mother1, father1);
        family1.addChild(child1_1);
        familyList.add(family1);

        Human father2 = new Human("Steven", "Jack",1995);
        Human mother2 = new Human("Alice", "Jack",1998);
        Set<String> habits = new HashSet<String>();
        habits.add("eating");
        habits.add("running");
        Pet pet = new Pet(Species.Dog, "Lucy", 2, 56, habits) {

            @Override
            public void respond(String nickname) {

            }
        };
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        Family family2 = new Family(mother2,father2);
        family2.setPets(pets);
        familyList.add(family2);

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
