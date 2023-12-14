package td1.loops;

public class Exo10 {
    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    int t = (int) (Math.pow(i,3) + Math.pow(j,3) + Math.pow(k,3));
                    int nbr = Integer.parseInt(""+ i+j+k);

                    if (t == nbr)
                    System.out.println(
                            i+"^3 + "+j+" ^3 + "+ k +"^3 ="+t
                    );

                }
            }
        }



    }
}
