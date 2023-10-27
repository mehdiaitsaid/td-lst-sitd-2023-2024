package td1.loops;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        int n , s=0 , f=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The N:");
        n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            f *= i;
            if (i%2!=0){
                s += i;
            }
        }

        System.out.println("f= "+ f + " s= "+s);


    }
}
