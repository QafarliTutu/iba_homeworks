package Homework6;
public class Main {
    public static void main(String[] args) {
            String[] habits = {"eat", "drink", "sleep"};
            String[][] activtes = {{}, {}};

            for (int i = 0; i < 1000000000; i++) {
                Human mother = new Human("Jane ", "Karleone", 60);
                Human father = new Human("Vito ", "Vito ", 60);
                Human[] children = new Human[0];

                Pet dog = new Pet(PetType.DOG, "Rock", 5, 75, habits);
                Human child = new Human("Michael", "Karleone", 1977);

                Family family = new Family(mother, father, children, dog);
            }


            Human mother = new Human("Jane ", "Karleone", 60);
            Human father = new Human("Vito ", "Vito ", 60);
            Human[] children = new Human[0];

            Pet dog = new Pet(PetType.DOG, "Rock", 5, 75, habits);
            Human child = new Human("Michael", "Karleone", 1977);

            Family family = new Family(mother, father, children, dog);
            family.addChilde(child);
            Family x = family;
            System.out.println(family);
            family.deleteChilde(child);
            System.out.println( family);
            System.out.println(family.equals(x));
            family.toString();


    }

}



