package Mangchuoi;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số tại index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Các số chẵn trong mảng:");
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}
