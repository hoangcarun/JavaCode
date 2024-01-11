import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số N
        System.out.print("Nhập vào số N (N > 0): ");
        int N = scanner.nextInt();

        // a. In ra các số lẻ < N
        System.out.print("Các số lẻ < N: ");
        for (int i = 1; i < N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // b. Tính tổng bình phương của các số lẻ
        int tongBinhPhuong = 0;
        for (int i = 1; i < N; i += 2) {
            tongBinhPhuong += i * i;
        }
        System.out.println(" Tổng bình phương của các số lẻ: " + tongBinhPhuong);

        // c. In ra các số chẵn lớn hơn trung bình cộng
        double trungBinhCong = (double) (N + 1);
        System.out.print(" Các số chẵn lớn hơn trung bình cộng: ");
        for (int i = 2; i <= N; i += 2) {
            if (i > trungBinhCong) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
