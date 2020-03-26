package Homework12.Console;

import Homework12.model.Type;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputs {
    Scanner scanner = new Scanner(System.in);

    public int familyId(){
        System.out.println("Enter family ID:");
        return commoninput();
    }
    public int spNumber(){
        System.out.println("Enter specified number:");
        return commoninput();
    }
    public String birthDate() {
        String birthDate;
        System.out.println("Enter birth date:");
        return birthDate = scanner.next();
    }
    public String name() {
        String name;
        System.out.println("Enter name:");
        return name = scanner.next();
    }
    public String surname(){
        String surname;
        System.out.println("Enter surname:");
        return surname = scanner.next();
    }
    public int birthYear(){
        System.out.println("Enter birth year:");
         return commoninput();
    }
    public int birthMonth(){
        System.out.println("Enter birth month:");
        return commoninput();
    }
    public int birthDay(){
        System.out.println("Enter birthday:");
        return commoninput();
    }
    public int iq(){
        System.out.println("Enter IQ:");
        return commoninput();
    }

    public Type type() {
        System.out.println("Enter child's gender:");
        Type type= null;
        boolean flag = true;
        while(flag){
            try {
                type = Type.valueOf(scanner.next().trim().toLowerCase());
                flag = false;
            }catch (Exception ex){
                System.out.println("Invalid gender type! Please enter 'boy' or 'girl':");
                scanner.nextLine();
                continue;
            }
        }
        return type;
    }

    private int commoninput(){
        int commonNum = 0 ;
        boolean flag = true;
        while(flag) {
            try {
                commonNum = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException ex) {
                System.out.println("Please enter number:");
                scanner.nextLine();
                continue;
            }
        }
        return commonNum;
    }


}
