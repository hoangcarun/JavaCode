package Mangchuoi;

import java.util.Scanner;

public class Bai5 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Math.sqrt(number) để tính căn bậc 2
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }


        System.out.println("Prime Numbers in the Array:");
        for (int value : arr) {
            if (isPrime(value)) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}
//bài5: nhập mảng  có n phần tử các số nguyên , in ra phần tử là số nguyên tố của mảng