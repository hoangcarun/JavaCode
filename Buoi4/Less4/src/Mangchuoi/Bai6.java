package Mangchuoi;

import java.util.Scanner;

public class Bai6 {
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1; // Bắt đầu với 1 vì 1 là ước số của mọi số nguyên dương

        // Tìm tất cả các ước số và tính tổng
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        // Kiểm tra xem tổng của ước số có bằng số ban đầu không
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thớc của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print(" nhập số " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Các số hoàn hảo trong mảng:");
        for (int value : arr) {
            if (isPerfectNumber(value)) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}
