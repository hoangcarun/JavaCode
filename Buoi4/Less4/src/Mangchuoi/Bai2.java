package Mangchuoi;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Mảng được tạo ngẫu nhiên:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
