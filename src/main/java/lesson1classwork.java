import java.util.Scanner;

public class lesson1classwork {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello," + name + "\nNice to meet you!" + name + "\nBye!");


    }
}
