package Homework8;

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
        Pet pet= new Pet(Species.Dog, "Lucky", 2, 67, habits1) {
            @Override
            public void respond(String nickname) {
            }
        };
        Set<String> habits2 = new HashSet<String>();
        habits2.add("sleeking");
        habits2.add("licking");
        Pet pet1= new Pet(Species.RoboCat, "Nick", 1, 25, habits2) {
            @Override
            public void respond(String nickname) {
            }
        };
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        pets.add(pet1);
        Map schedule=new HashMap();
        schedule.put("Monday","go work");
        schedule.put("Sunday","go gym");
        Man man= new Man();
        man.setName("Alex"); man.setSurname("Miller"); man.setYear(1972); man.setPet(pet1);man.setSchedule(schedule);
        man.greetPet(); pet1.respond(pet1.getNickname()); man.repairCar();
        Human woman= new Woman();
        woman.setName("Isabel"); woman.setSurname("Miller"); woman.setYear(1971); woman.setPet(pet);
        woman.greetPet(); pet.respond(pet.getNickname());
        Family family=new Family(man,woman);
        family.setChildren(children);
        System.out.println(family);

    }
}



