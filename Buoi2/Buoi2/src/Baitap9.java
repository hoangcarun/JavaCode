import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn (1-6): ");
            luaChon = scanner.nextInt();
            xuLyLuaChon(luaChon);

        } while (luaChon != 6);

        scanner.close();
    }

    static void hienThiMenu() {
        System.out.println("Cuối tuần bạn muốn làm gì?");
        System.out.println("1. Đi học Java");
        System.out.println("2. Đi chơi Công viên ngắm gái.");
        System.out.println("3. Đi nhà nghỉ");
        System.out.println("4. Ra sông Hồng tắm tiên");
        System.out.println("5. Ngủ cả ngày.");
        System.out.println("6. Thoát.");
    }

    static void xuLyLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                System.out.println("Bạn đã chọn đi học Java.");
                break;
            case 2:
                System.out.println("Bạn đã chọn đi chơi Công viên ngắm gái.");
                break;
            case 3:
                System.out.println("Bạn đã chọn đi nhà nghỉ.");
                break;
            case 4:
                System.out.println("Bạn đã chọn ra sông Hồng tắm tiên.");
                break;
            case 5:
                System.out.println("Bạn đã chọn ngủ cả ngày.");
                break;
            case 6:
                System.out.println("Bạn đã chọn thoát. Kết thúc chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập từ 1 đến 6.");
        }
    }
}
