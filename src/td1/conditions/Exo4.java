package td1.conditions;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m>=16) System.out.println("TB");
        else if (m>= 14) System.out.println("B");
        else if (m>= 12) System.out.println("Ab");
        else if (m>=10) System.out.println("P");
        else System.out.println("NV");
    }
}
