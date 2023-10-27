package td1.loops;

public class Exo4 {
    public static void main(String[] args) {

        int a =60, b =15, p=1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b %i == 0){
                p = i;
            }
        }
        System.out.println("P ="+p);
    }

}
