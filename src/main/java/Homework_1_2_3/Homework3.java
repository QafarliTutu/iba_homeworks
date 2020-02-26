package Homework_1_2_3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0] = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        scedule[1] = new String[]{"do homework.", "go to course; watch a film", "go to gym", "study about Java", "go to library", "go to course", "clean the house"};
        System.out.println("Please, input the day of the week:");
        String dayfinal=Inputs();
        int a =linearsearch(scedule,dayfinal);
        while (a==-1 || a==1){
            switch (a) {
                case(-1):
                    System.out.println("Sorry, I don't understand you, please try again.");
                    dayfinal = Inputs();
                    a = linearsearch(scedule, dayfinal);
                case (1):
                    for (int i = 0; i < scedule[0].length; i++) {
                        if (dayfinal.equalsIgnoreCase(scedule[0][i])) {
                            System.out.println(scedule[1][i]);
                            break;
                        }
                    }
                    System.out.println("Please, input the day of the week:");
                    dayfinal = Inputs();
                    a = linearsearch(scedule, dayfinal);
                    String exit = "exit";
                    if (dayfinal.equals(exit)) {
                        break;
                    }
                    if (dayfinal.startsWith("change")) {
                        String dayNamePart = dayfinal.substring(7);
                        Modify(scedule, dayNamePart);
                        System.out.println("Please, input the day of the week:");
                        dayfinal = Inputs();
                        a = linearsearch(scedule, dayfinal);
                    }
            }String exit = "exit";
            if (dayfinal.equals(exit)) {
                break;
            }

        }
    }
    public static void Modify(String[][] scedule, String change){
            System.out.println("Please, input new tasks for "+ change);
            Scanner input=new Scanner(System.in);
            String newTask=input.nextLine();
        for (int i = 0; i < scedule[0].length; i++) {
            if (change.equalsIgnoreCase(scedule[0][i])) {
                scedule[1][i]=newTask;
                break;
            }
        }
    }

    public static String Inputs(){
        Scanner input = new Scanner(System.in);
        String dayinput = input.nextLine();
        String dayfinal=dayinput.trim();
        return dayfinal;
    }

    public static int linearsearch(String[][] string, String search) {
        int i;
        int flag = 0;
        for (i = 0; i < string[0].length; i++) {
            if (search.equalsIgnoreCase(string[0][i])) {
                flag = 1;
                break;
            }
            else{
                flag=-1;
            }
        }
        return flag;
    }


}