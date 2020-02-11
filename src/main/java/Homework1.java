
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner in1 = new Scanner(System.in);
        String name = in1.nextLine();
        System.out.println("Let the game begin!");
        int[] array1 = new int[10];//for bigger ones
        int[] array2 = new int[10];//for lower ones
        int index1 = 0;
        int index2 = 0;
        Random rand = new Random();
        int random_number = rand.nextInt(99) + 1;
        System.out.println("Enter your number!");
        Scanner in2 = new Scanner(System.in);
        int num=in2.nextInt();
        while (num!=random_number) {
            if (num > random_number) {
                array1 = addNumberToArray1(array1,index1,num);
                index1++;
                System.out.println("Your number is too big.Please try again!");

            } else {
                array2 = addNumberToArray2(array2,index2,num);
                index2++;
                System.out.println("Your number is too small.Please try again!");
            }
            in2 = new Scanner(System.in);
            num=in2.nextInt();
        }
            System.out.println("Congratulations, " + name);
            System.out.println("There are your all entering numbers" + Arrays.toString(array1) + "\n" + Arrays.toString(array2));

    }
    public static int [] addNumberToArray1(int []array1, int index1, int n){
        array1 = inlargeArray1(array1, index1 );
        array1[index1] = n;
        return array1;
    }
    public static int[] inlargeArray1(int[] array1, int index1 ) {
        if (index1 == array1.length) {
            int[] array1_2 = Arrays.copyOf(array1, array1.length +1);
            return array1_2;
        } else return array1;
    }
    public static int [] addNumberToArray2(int []array2, int index2, int m) {
        array2 = inlargeArray2(array2, index2);
        array2[index2] = m;
        return array2;
    }
    public static int[] inlargeArray2(int[] array2, int index2 ) {
        if (index2 == array2.length) {
            int[] array2_2 = Arrays.copyOf(array2, array2.length + 1);
            return array2_2;
        } else return array2;

    }

}







