import java.util.Random;
import java.util.stream.IntStream;

public class lesson4classwork {
    public static void main(String[] args) {
        Random random=new Random();
        int a=random.nextInt();
        StringBuilder sb = new StringBuilder( );
        for(int i=0;i<=30;i++){
            sb.append(a);
            System.out.println(sb);

        }

    }
    public static char randomSmallLetter(){
        String alpha=alphabetSmall();
        return alpha.charAt((int)(Math.random()*alpha.length()));

    }
    public static char randomCapitalLetter(){
        String alpha=alphabetCapital();
        return alpha.charAt((int)(Math.random()*alpha.length()));

    }
    public static char randomletter(){
        return ((int)(Math.random()*2)==0) ? // 0 or 1
                randomSmallLetter() : randomCapitalLetter();

    }

    public static boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isSmall(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isLetter(char c) {
        return isCapital(c) || isSmall(c);
    }

    public static boolean isVowel(char c) {
        final String vowels = "aeoiu";
        return vowels.indexOf(Character.toLowerCase(c)) >= 0;
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static String alphabetSmall() {
        StringBuilder alpha = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            alpha.append(i);
        }
        return alpha.toString();
    }

    public static String alphabetCapital() {
        return alphabetSmall().toUpperCase();
    }



}
