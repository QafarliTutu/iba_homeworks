package Homework6;
;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(Species.DOG, "Rocky", 2, 55, new String[]{"eat","drink","sleep"});
        Human mother=new Human("Isabel", "Miller", 1971);
        mother.setIq(85);
        mother.setSchedule(new String[][]{{Day_of_week.MONDAY.name(),"task1"},{Day_of_week.FRIDAY.name(),"task2"}});
        mother.setPet(pet);
        Human father=new Human("John", "Miller", 1973);
        father.setIq(95);
        father.setSchedule(new String[][]{{Day_of_week.THURSDAY.name(),"task1"},{Day_of_week.SATURDAY.name(),"task2"}});
        father.setPet(pet);
        Human[] children=new Human[1];
        Family family=new Family(mother,father);
        family.setChildren(children);
        Human child1=new Human("Alice","Miller",2013);
        family.addChild(child1);
        System.out.println(family);
        for (int i = 0; i <10 ; i++) {
             mother=father;

        }
    }

}
