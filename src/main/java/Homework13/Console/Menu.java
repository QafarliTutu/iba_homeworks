package Homework13.Console;

public class Menu {
    public static void menu1() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("==========================================================================================\n");
        sb1.append("|                                       MAIN MENU                                        |\n");
        sb1.append("==========================================================================================\n");
        sb1.append("| 1.  Fill with test data.                                                               |\n");
        sb1.append("| 2.  Display  list of families.                                                         |\n");
        sb1.append("| 3.  Display family where the number of people is greater than the specified number.    |\n");
        sb1.append("| 4.  Display family where the number of people is less than the specified number.       |\n");
        sb1.append("| 5.  Calculate the number of families according to members.                             |\n");
        sb1.append("| 6.  Create a new family.                                                               |\n");
        sb1.append("| 7.  Delete a family by its index.                                                      |\n");
        sb1.append("| 8.  Edit a family by its index.                                                        |\n");
        sb1.append("| 9.  Remove all children over the age of majority.                                      |\n");
        sb1.append("| 10. Save data.                                                                         |\n");
        sb1.append("| 11. Exit.                                                                              |\n");
        sb1.append("==========================================================================================\n");
        System.out.println(sb1);
    }

    public static void menu2() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("===================================================\n");
        sb2.append("|                       MENU                      |\n");
        sb2.append("===================================================\n");
        sb2.append("| 1. Give birth to a baby.                        |\n");
        sb2.append("| 2. Adopt a child.                               |\n");
        sb2.append("| 3. Return to main menu.                         |\n");
        sb2.append("===================================================\n");
        System.out.println(sb2);
    }

}
