package Homework7;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet(Species.Dog, "Rocky", 2, 55, new String[]{"eat", "drink", "sleep"}) {
            @Override
            public void respond() {
                System.out.println("Hello owner!" );
            }
        };
        Pet pet2 = new Pet(Species.DomesticCat, "Lucy", 1, 80, new String[]{"eat", "drink", "jump"}) {
            @Override
            public void respond() {
                System.out.println("Hello my lowely owner!" );
            }
        };
        Man man= new Man();
        man.setName("Alex"); man.setSurname("Miller"); man.setYear(1972); man.setPet(pet1);
        man.greetPet(); pet1.respond(); man.repairCar();
        Human woman= new Woman();
        woman.setName("Isabel"); woman.setSurname("Miller"); woman.setYear(1971); woman.setPet(pet2);
        woman.greetPet(); pet2.respond();
        Human[] children=new Human[1];
        Family family=new Family();
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        family.addChild(child1);
        family.setFather(man);
        family.setMother(woman);
        System.out.println(family);
        System.out.println(pet1.getNickname());
        pet1.setNickname("Luky");
        System.out.println(pet1.getNickname());










    }
}
