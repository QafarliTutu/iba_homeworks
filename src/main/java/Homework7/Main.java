package Homework7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setNickname("Luky");
        dog.setAge(1);
        dog.setSpecies(Species.Dog);
        DomesticCat cat = new DomesticCat();
        cat.setNickname("Lucy");
        cat.setAge(2);
        cat.setSpecies(Species.DomesticCat);
        Man man= new Man();
        man.setName("Alex"); man.setSurname("Miller"); man.setYear(1972); man.setPet(dog);
        man.greetPet(); dog.respond(); man.repairCar();
        Human woman= new Woman();
        woman.setName("Isabel"); woman.setSurname("Miller"); woman.setYear(1971); woman.setPet(cat);
        woman.greetPet(); cat.respond();
        Human[] children=new Human[1];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        family.addChild(child1);
        family.setFather(man);
        family.setMother(woman);
        System.out.println(family);
        System.out.println(dog.getNickname());
        System.out.println(cat.getNickname());










    }
}
