import org.w3c.dom.ls.LSOutput;

public class pizzaApp {
    public String name;//fields
    public int size;
    public static int count;

    public pizzaApp() {//konstruktor
        count++;

    }


    @Override
    public String toString() {
        return "pizzaApp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {//obyektlerin yaranmasi
        pizzaApp p1=new pizzaApp(); //p1- is reference //pizzaApp type
        pizzaApp p2=new pizzaApp();
        pizzaApp p3=new pizzaApp();
        System.out.println(p1.name);
    }

}
