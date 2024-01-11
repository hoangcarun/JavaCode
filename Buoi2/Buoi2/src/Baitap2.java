import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số:");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("la so nguyen to");
        }
        else{
            System.out.println("khong phai la so nguyen to");
        }
    }
}
