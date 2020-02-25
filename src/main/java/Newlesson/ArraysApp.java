package Newlesson;

public class ArraysApp {
    public static void main1(String[] args) {
        int[] a = new int[10];
        for(int i=0; i<a.length; i++){
           a[i]=(int)(Math.random()*(10+1));
            System.out.println(a[i]);
        }
    }


    public static void main5(String[] args) {
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (30 + 1));
            if (a[i] % 2 == 0) {
                System.out.println("Fizzy");
            } else if (a[i] % 3 == 0) {
                System.out.println("Buzzy");
            } else if  (a[i] % 2 == 0 && a[i] % 3 == 0){
                System.out.println("Fizzy,Buzzy");
            }
        }
    }

    public static void maink(String[] args) {
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
            if (a[i] % 2 == 0 && a[i] < 0) {
                System.out.println(a[i] + " is odd negative number");
            } else if (a[i] % 2 == 0 && a[i] > 0) {
                System.out.println(a[i] + " is odd positie number");
            } else if (a[i] % 2 == 1 && a[i] < 0) {
                System.out.println(a[i] + " is even negative number");
            } else if (a[i] % 2 == 1 && a[i] > 0) {
                System.out.println(a[i] + " is even positive number");
            }

        }
    }}



