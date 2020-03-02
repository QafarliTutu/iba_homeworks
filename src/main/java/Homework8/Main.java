package Homework8;
import Homework7.Man;
import Homework7.Woman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human child=new Human("Alex","Miller",2016);
        Human child1=new Human("Martin","Miller",2019);
        List<Human> children = new ArrayList<>();
        children.add(child);
        children.add(child1);
        Set<String> habits1 = new HashSet<String>();
        habits1.add("eating");
        habits1.add("running");
        Pet pet= new Pet(Species.Dog, "Lucky", 2, 67, habits1 );
        Set<String> habits2 = new HashSet<String>();
        habits2.add("sleeking");
        habits2.add("licking");
        Pet pet1= new Pet(Species.RoboCat,"Nick",1,25,habits2);
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        pets.add(pet1);
        Map schedule=new HashMap();
        schedule.put("Monday","go work");
        schedule.put("Sunday","go gym");
        Human man= new Man();
        man.setName("Alex"); man.setSurname("Miller"); man.setYear(1972); man.setPet(pet);
        man.greetPet(); pet.respond(pet.getNickname()); man.repairCar();
        Human woman= new Woman();
        woman.setName("Isabel"); woman.setSurname("Miller"); woman.setYear(1971); woman.setPet(pet1);
        woman.greetPet(); pet1.respond(pet1.getNickname());
        Family family=new Family();
        family.setChildren(children);
        family.setPets(pets);
        System.out.println(family);


    }
}



