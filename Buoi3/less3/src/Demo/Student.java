package Demo;

import java.util.Scanner;

public class Student {
    String firsName;
    String lastName;
    String address;

    public Student(String firsName, String lastName, String address) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.address = address;
    }
    public Student(){}

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Frist Name");
        firsName = scanner.nextLine();

        System.out.println("Last Name");
        lastName = scanner.nextLine();

        System.out.println("Adress");
        address = scanner.nextLine();
    }

    public void display(){
        String name = lastName + "" +firsName;
        System.out.println("ten cua hoc sinh" + name);
        System.out.println("co dia chi" + address);
    }



    public static void main(String[] args) {
        Student student = new Student("Hoang","Huy","HaNoi");
        Student student1 = new Student();
        Student student2 = new  Student();


        student.display();
        student2.input();
        System.out.println("Student1");
        student2.display();
        student1.input();
        System.out.println("Student2");
        student1.display();
    }

}

