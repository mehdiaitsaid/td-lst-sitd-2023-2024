package td1.conditions;

import java.util.Scanner;

public class exo6 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire les deux entiers
    System.out.println("Entrez le premier entier :");
    int a = scanner.nextInt();
    System.out.println("Entrez le deuxième entier :");
    int b = scanner.nextInt();

    // Déterminer le signe du produit
    int signe = 1;
    if (a < 0) {
        signe = -signe;
    }
    if (b < 0) {
        signe = -signe;
    }

    // Afficher le signe
    System.out.println("Le signe du produit est : " + signe);
}
}
