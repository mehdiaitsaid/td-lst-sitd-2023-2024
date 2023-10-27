package td1.tables;

import java.util.Random;

public class Exo4 {

    public static void main(String[] args) {

        int n = 4, m=4;
        Random random = new Random();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(5);
                b[i][j] = random.nextInt(5);
            }
        }

        System.out.println("----------- M = A -----------");
        show(a);
        System.out.println("----------- M = B -----------");
        show(b);
        int[][] s = sum(a,b);

        System.out.println("----------- M = S -----------");
        show(s);
    }

    public static void show(int[][] M){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] sum(int[][] A, int[][] B){
        int[][] M = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                M[i][j] = A[i][j] + B[i][j];

            }

        }
        return M;
    }
}
