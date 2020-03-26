package Homework12;

import Homework12.controller.FamilyController;
import Homework12.model.*;
import Homework12.Console.*;
import Homework12.Console.Menu;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class FamilyApp {
    private FamilyController familyController = new FamilyController();
    private Menu menu = new Menu();
    private Inputs inputs = new Inputs();
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean flag1 = true;
        while (flag1) {
            menu.menu1();
            String menuItem1 = scanner.nextLine();
            switch (menuItem1) {
                case "1":
                    familyController.createNewFam();break;
                case "2":
                    familyController.displayAllFamilies();break;
                case "3":
                    familyController.getFamiliesBiggerThan(inputs.spNumber());break;
                case "4":
                    familyController.getFamiliesLessThan(inputs.spNumber());break;
                case "5":
                    familyController.countFamiliesByMemberNumber(inputs.spNumber());break;
                case "6":
                    System.out.println("Enter mother's information->");
                    Human mother = new Human(Type.mother,inputs.name(), inputs.surname(), inputs.birthYear(), inputs.birthMonth(), inputs.birthDay(), inputs.iq());
                    System.out.println("Enter father's information->");
                    Human father = new Human(Type.father,inputs.name(), inputs.surname(), inputs.birthYear(), inputs.birthMonth(), inputs.birthDay(), inputs.iq());
                    familyController.createNewFamily(mother,father);
                    break;
                case "7":
                    try{
                        familyController.deleteFamilyById(inputs.familyId());
                    }catch (Exception ex){ System.out.println("Family doesn't exist."); }
                    break;
                case "8":
                    boolean flag2 = true;
                    while (flag2){
                        menu.menu2();
                        String menuItem2 = scanner.nextLine();
                        switch (menuItem2){
                            case "1":
                                try{
                                    familyController.bornChild(familyController.getFamilyById(inputs.familyId()),inputs.type(),inputs.name());
                                } catch (Exception ex){ System.out.println("Family doesn't exist."); }
                                break;
                            case "2":
                                try {
                                    familyController.adoptChild(familyController.getFamilyById(inputs.familyId()),new Human(inputs.type(),inputs.name(),inputs.surname(),inputs.birthDate(),inputs.iq()));
                                }catch (DateTimeParseException ex){ System.out.println("Invalid date format! Please enter like this 'dd/MM/yyyy'.");
                                }catch (Exception ex){ System.out.println("Family doesn't exist."); }
                                break;
                            case "3" :
                                flag2=false;break;
                            default:
                                System.out.println("Invalid menu item! Please enter menu item: ");break;
                        }
                    }break;
                case "9":
                    familyController.deleteAllChildrenOlderThan(inputs.spNumber());break;
                case "10":
                    flag1=false;break;
                default:
                    System.out.println("Invalid menu item! Please enter menu item: ");break;
            }
        }
    }
}



