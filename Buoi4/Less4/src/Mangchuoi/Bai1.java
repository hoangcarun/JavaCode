package Mangchuoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap phan tu thu" + i);
            int a = Integer.parseInt(sc.nextLine());
            list.add(a);

        }
        System.out.println("mang vua nhap");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("phan tu thu %d: %d\n", i,list.get(i));
        }
    }
}