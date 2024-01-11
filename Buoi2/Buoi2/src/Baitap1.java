public class Baitap1 {
    int ucln(int x, int y) {
        int ucln = 1;
        int n = x < y ? x : y;
        for (int i = n; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                ucln = i;
                System.out.println("uoc x,y:" + i);
                break;
            }

        }
        return ucln;
    }
    int bcnn(int x, int y){
        int bcnn = 1;
        int n = x * y ;
        for (int i = 1 ;i < n; i++){
            if (i % x == 0&& i % y == 0 ){
                bcnn = 1 ;
                System.out.println("bcnn:" + bcnn);
                break;
            }
        }
        return bcnn;
    }

    public static void main(String[] args) {
        Baitap1 baiTap1 = new Baitap1();
        baiTap1.ucln(20, 30);
    }
}