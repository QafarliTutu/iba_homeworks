package Homework12.Dao;

import Homework12.model.*;

import java.util.*;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> familyList = new ArrayList<>();


    @Override
    public void createNewFam() {
        Human father = new Human(Type.father,"Alex", "Miller","11/03/2001",59);
        Human mother = new Human(Type.mother,"Isabel", "Miller","26/05/1973",65);
        Human child1 = new Human(Type.boy,"Martin", "Miller","08/01/2001",75);
        Human child2 = new Human(Type.boy,"John", "Miller","25/08/2003",56);
        Family family = new Family(mother, father);
        family.addChild(child1);
        family.addChild(child2);
        familyList.add(family);
        Human father2 = new Human(Type.father,"Steven", "Jack","22/02/1995",84);
        Human mother2 = new Human(Type.mother,"Alice", "Jack","28/12/1998",40);
        Set<String> habits2 = new HashSet<String>();
        habits2.add("eating"); habits2.add("running");
        Pet pet2 = new Pet(Species.Dog, "Rocky", 2, 56, habits2) {
            @Override
            public void respond(String nickname) {
            }
        };
        Set<Pet> pets2 = new HashSet<>();
        pets2.add(pet2);
        Family family2 = new Family(mother2,father2);
        family2.setPets(pets2);
        familyList.add(family2);
    }

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Optional<Family> getFamilyById(int id) {

       return  familyList.stream()
                .filter(family -> family.getId() == id)
                .findAny();
    }

    @Override
    public boolean deleteFamily(int id) {
        return familyList.removeIf(family -> family.getId()==id);
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }
}
