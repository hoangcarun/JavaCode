import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều cao của tam giác cân: ");
        int chieuCao = scanner.nextInt();

        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < 2 * chieuCao - 1; j++) {
                System.out.print((i == chieuCao - 1 || i + j == chieuCao - 1 || j - i == chieuCao - 1) ? '*' : ' ');
            }
            System.out.println();
        }

        scanner.close();
    }
}
