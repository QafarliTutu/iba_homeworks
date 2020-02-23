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
        Pet pet= new Pet("Dog", "Lucky", 2, 67, habits1 );
        Set<String> habits2 = new HashSet<String>();
        habits2.add("sleeking");
        habits2.add("licking");
        Pet pet1= new Pet("Cat","Nick",1,25,habits2);
        Set<Pet> pets = new HashSet<>();
        pets.add(pet);
        pets.add(pet1);
        Map schedule=new HashMap();
        schedule.put("Monday","go work");
        schedule.put("Sunday","go gym");
        Human father= new Human("John", "Miller", 1973,90,schedule);
        Human mother=new Human("Isabel", "Miller", 1971,85, schedule);
        Family family=new Family(mother,father);
        family.setChildren(children);
        family.setPets(pets);
        System.out.println(family);


    }
}



