import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class lesson1classwork {
    public static void main7(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello," + name + "\nNice to meet you!" + name + "\nBye!");


    }



    public static void main2(String[] args) {
        PrintStream out = System.out;
        InputStream in = System.in;
        out.println("How old are you?");
        Scanner sc = new Scanner(in);
        int age = sc.nextInt();
        if(age<18) {
            out.print("Lets go to the cinema!");
        }else if (age>=18){
            out.print("Lets go to the Night Club!");
        }

    }}