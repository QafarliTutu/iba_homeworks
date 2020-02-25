package Newlesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder total=new StringBuilder();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<31 ; i++){
            int a= (int)(Math.random() * (((-10) - 10) + 1)) + 10;
            arr.add(a);
//            total.append(a);
//            total.append(" ");
        }
        total.append(arr);total.append("\n");
        Set<Integer> new_list = new HashSet<>(arr);
        total.append(new_list);
        TreeSet ts1 = new TreeSet(new_list);
        total.append(ts1);
        System.out.println(total);

//        ArrayList<String>names=new ArrayList<>(Arrays.asList("Emma", "Olivia", "Ava", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Mila", "Ella"))
//        Random rand




    }




}
