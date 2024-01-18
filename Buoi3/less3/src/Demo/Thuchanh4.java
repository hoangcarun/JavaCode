package Demo;

import java.util.Scanner;

public class Thuchanh4 {
        private String ID;
        private String name;
        private String address;
        private int age;
        private double salary;

        // Hàm input() với 5 tham số
        public void input(String ID, String name, String address, int age, double salary) {
            this.ID = ID;
            this.name = name;
            this.address = address;
            this.age = age;
            this.salary = salary;
        }

        // Hiển thị thông tin
        public void display() {
            System.out.println("Customer Information:");
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }


    class CustomerManager {
        // Biến toàn cục
        private static Thuchanh4 globalCus = new Thuchanh4();

        // Hàm input() với 5 tham số cho globalCus
        public static void input(String ID, String name, String address, int age, double salary) {
            globalCus.input(ID, name, address, age, salary);
        }


        public static void inputCustomer() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Customer ID: ");
            String ID = scanner.nextLine();
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Customer Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Customer Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Customer Salary: ");
            double salary = scanner.nextDouble();

            input(ID, name, address, age, salary);
        }

        // Hàm main
        public static void main(String[] args) {
            // Gọi hàm nhập thông tin từ bàn phím và hiển thị thông tin của globalCus
            inputCustomer();
            globalCus.display();
        }
    }
//Viết 1 hàm cùng tên là input() nhưng có 5 tham số truyền vào tương ứng với class Customer - thể hiện tính đa hình trong java.
// Khai báo 1 đối tượng Customer như một biến toàn cục tên là globalCus ở class CustomerManager.
// Viết 1 hàm inputCustomer() bên class CustomerManager để nhập thông tin từ bàn phím rồi gán các giá trị đó vào hàm input() có 5 tham số ở trên của biến globalCus.
// Trong hàm main của class CustomerManager gọi và sử dụng hàm nhập.
//Bước 1: Viết thêm 1 hàm có cùng tên input() nhưng yêu cầu truyền vào 5 tham số (cho 5 thuộc tính của Customer).
//ID,name ,address,age,salary
//Bước 2: kghai báo 1 biến globalcus trong customemanager
// Bước 3: viết hàm inputcustomer() trong customermanager để nhập dữ liệu từ scamner rồi gọi hàm input() đã tạo ở trên
// Bước 4: trong main() gọi tới inputcustomer() và chạy thử

