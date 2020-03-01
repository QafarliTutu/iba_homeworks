package Homework6;
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            Human mother = new Human("Jane ", "Karleone", 60);
            Human father = new Human("Vito ", "Vito ", 60);
            Human[] children = new Human[0];
            String[] habits = {"eat", "drink", "sleep"};
            String[][] activtes = {{}, {}};

            Pet dog = new Pet(PetType.DOG, "Rock", 5, 75, habits);
            Human child = new Human("Michael", "Karleone", 1977);
            Family family = new Family(mother, father, children, dog);
        }


    }

}



