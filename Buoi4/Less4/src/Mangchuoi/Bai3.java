package Mangchuoi;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhâp kích thước từ mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
