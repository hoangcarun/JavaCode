package Mangchuoi;

public class Dachieu {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("a[%d][%d] = %d", i, j, a[i][j]);
            }
            System.out.println();
        }
    }
}