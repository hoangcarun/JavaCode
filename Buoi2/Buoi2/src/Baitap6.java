import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int chieuDai = scanner.nextInt();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int chieuRong = scanner.nextInt();

        veHinhChuNhat(chieuDai, chieuRong);

        scanner.close();
    }

    static void veHinhChuNhat(int chieuDai, int chieuRong) {
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print((i == 0 || i == chieuRong - 1 || j == 0 || j == chieuDai - 1) ? '*' : ' ');
            }
            System.out.println();
        }
    }
}
