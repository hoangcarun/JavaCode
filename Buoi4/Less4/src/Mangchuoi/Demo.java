package Mangchuoi;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int a[] = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mang:");
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("xuat mang");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%d ", a[i]);
        }
        int b[] = {1,2,3,4,5};

        System.out.println("\nmangb:");
        for (int i = 0; i<b.length; i++){
            System.out.printf("%d ", b[i]);
        }
    }
}