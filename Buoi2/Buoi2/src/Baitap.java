public class Baitap {
    int tongN(int n){
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s = s + i;
        }
        return s;
    }

    public static void main(String[] args) {
        Baitap baiTap = new Baitap();
        int s = baiTap.tongN( 10);
        System.out.printf("Tong tu 1 - 10: %d", s);
//
    }
}

//       void xuatTongN(int n){
//            int s = 0;
//            for (int i = 1; i <= 10; i++) {
//                s = s + i;
//            }
//            System.out.println("tong tu 1 - %d", n , s);
//        }


//        int s = 0;
//        for (int i = 1; i<=10 ;i ++){
//            s = s + i;
//        }
//        System.out.println("tong tu 1 - 10:" + s);