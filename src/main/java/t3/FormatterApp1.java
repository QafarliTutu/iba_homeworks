package t3;

public class FormatterApp1 {
    public static void main(String[] args) {
        // task3
        System.out.println(new Formatter1("Hello"));  // hello
        System.out.println(new Formatter2("Hello"));  // HELLO
        System.out.println(new Formatter3("Hello"));  // ***********
                                                      // *  Hello  *
                                                      // ***********
    }
}
