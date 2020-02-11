


import java.util.Scanner;

public class lesson2classwork {
    public static void main(String[] args) {
        System.out.println("Enter width:");
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        System.out.println("Enter height:");
        Scanner in2=new Scanner(System.in);
        int height = in.nextInt();
        double tan=((double) width/height);
        StringBuilder envelope=new StringBuilder();
        for (int i = 0; i <height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1 || j==(int)(i*tan) || j==width-(int)(i*tan) ) {
                  envelope.append("*");//System.out.print("*");
                }else {//System.out.print(" ");
                 envelope.append(" ");
                }
            }
            envelope.append("\n");

        }System.out.println(envelope);

    }}

