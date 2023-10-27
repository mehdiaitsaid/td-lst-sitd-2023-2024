package td1.loops;

public class Exo10 {
    public static void main(String[] args) {
        int n = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.println(
                            i+"^3 + "+j+"^3 "+ k +"^3 ="+ (Math.pow(i,3)+Math.pow(j,3)+ Math.pow(k,3))
                    );
                    n ++;
                }
            }
        }

        System.out.println(n);

    }
}
