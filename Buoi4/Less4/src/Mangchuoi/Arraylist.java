package Mangchuoi;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));

        //for-each
        for (String s : list) {
            System.out.println(s);


        }
    }
}
