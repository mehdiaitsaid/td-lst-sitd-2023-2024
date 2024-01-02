package td1.conditions;

import java.util.Scanner;

public class exo8 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire l'entier
    System.out.println("Entrez un entier de trois chiffres non nul :");
    int n = scanner.nextInt();

    // Déterminer les trois chiffres
    int centaine = n / 100;
    int dizaine = (n % 100) / 10;
    int unite = n % 10;

    // Générer les permutations des trois chiffres
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (i != j && j != k && i != k) {
                    System.out.println(centaine * 100 + dizaine * 10 + unite);
                }
            }
        }
    }
}
}
