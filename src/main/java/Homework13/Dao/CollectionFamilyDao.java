package Homework13.Dao;

import Homework13.model.*;

import java.io.*;
import java.util.*;

public class CollectionFamilyDao implements FamilyDao , Serializable{
    private static List<Family> familyList = new ArrayList<>();
    private Family family1 = null;
    private Family family2 = null;

    public void createObjects(){
        Human father = new Human(Type.father,"Alex", "Miller","11/03/2001",59);
        Human mother = new Human(Type.mother,"Isabel", "Miller","26/05/1973",65);
        Human child1 = new Human(Type.boy,"Martin", "Miller","08/01/2001",75);
        Human child2 = new Human(Type.boy,"John", "Miller","25/08/2003",56);
        family1 = new Family(mother, father);
        family1.addChild(child1);
        family1.addChild(child2);
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
        family2 = new Family(mother2,father2);
        family2.setPets(pets2);
    }



    @Override
    public void createNewFam() throws IOException {
        if(familyList.isEmpty()){
            createObjects();
            familyList.add(family1);
            familyList.add(family2);
        }
        downloadData(familyList);
    }

    @Override
    public boolean downloadData(List<Family>  families) throws IOException {
        File file = new File("Families.bin");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(families);
            oos.close();
            fos.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong.");
            return false;
        }
    }

    public List<Family> readData() throws IOException, ClassNotFoundException {
        File file = new File("Families.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        familyList=((List<Family>) ois.readObject());
        ois.close();
        fis.close();
        return familyList;
    }

    @Override
    public List<Family> getAllFamilies() throws IOException, ClassNotFoundException {
        readData();
        return familyList;
    }

    @Override
    public Optional<Family> getFamilyById(int id) throws IOException, ClassNotFoundException {
       return  getAllFamilies().stream()
                .filter(family -> family.getId() == id)
                .findAny();
    }

    @Override
    public boolean deleteFamily(int id) throws IOException, ClassNotFoundException {
        boolean b = getAllFamilies().removeIf(family -> family.getId()==id);
        downloadData(familyList);
        return b;
    }

    @Override
    public boolean deleteFamily(Family family) throws IOException, ClassNotFoundException {
        return getAllFamilies().remove(family);
    }

    public static List<Family> getFamilyList() {
        return familyList;
    }

    public static void setFamilyList(List<Family> familyList) {
        CollectionFamilyDao.familyList = familyList;
    }
}
