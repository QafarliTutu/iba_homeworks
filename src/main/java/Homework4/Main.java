package Homework4;

public class Main {
    public static void main(String[] args) {
        Human adding=new Human();
        Pet pet = new Pet("dog", "Dreyk", 5, 55, new String[]{"eat","drink","sleep"});
        System.out.println(pet);
        Human father = new Human("John", "Miller", 1973);
        father.setIq(96);
        father.setPet(pet);
        Human mother = new Human("Isabel", "Miller", 1971);
        mother.setIq(90);
        mother.setPet(pet);
        Human child = new Human("Alice", "Miller", 2006, father, mother);
        child.setPet(pet);
        child.setIq(92);
        System.out.println(child);
        child.describePet();
        child.greetPet();
        Pet.respond(pet.getNickname());
        Pet.foul();
        Pet.eat();



    }
}

