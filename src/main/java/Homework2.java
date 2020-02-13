
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        System.out.println("Enter a line for fire: ");
        int line = Inputs();
        System.out.println("Enter a number for shooting bar: ");
        int shoot = Inputs();
        char [][] table = new char[6][6];
        String a="012345";
        table[0]=a.toCharArray();
        for (int i=1;i<table.length;i++){
            table[i][0]=a.charAt(i);
        }

        for (int r =1; r < table.length; r++) {
            for (int c = 1; c < table.length; c++) {
                table[r][c] = '-';
            }

        }
                Random random = new Random();
                int randomline = random.nextInt(4)+1;
                int randomshoot = random.nextInt(4)+1;
                while (randomline!=line || randomshoot!=shoot){
                table[line][shoot] = '*';
                printArray(table);
                System.out.println("Enter a line for fire: ");
                line = Inputs();
                System.out.println("Enter a number for shooting bar: ");
                shoot = Inputs();
                randomline = random.nextInt(4)+1 ;
                randomshoot = random.nextInt(4)+1 ;

                }
                if (randomline == line && randomshoot == shoot) {
                    table[line][shoot] = 'X';
                    printArray(table);
                    System.out.println("You have won!");
                }

    }
    public static int Inputs() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (a >5 || a < 0) {
            System.out.println("Sorry. Your number is not the correct size. Try again!");
            a = input.nextInt();
        }return a;
    }
    public static void printArray(char [][] table){
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table.length; j++){
                System.out.print("|"+table[i][j] + "|");
            }System.out.println();
        }
    }
}


