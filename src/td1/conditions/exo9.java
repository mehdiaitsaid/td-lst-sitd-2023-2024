package td1.conditions;

import java.util.Scanner;

public class exo9 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire les deux variables
    System.out.println("Entrez la première variable :");
    int a = scanner.nextInt();
    System.out.println("Entrez la deuxième variable :");
    int b = scanner.nextInt();

    // Comparer les deux variables
    int comparaison = a;

    // Afficher les deux variables dans l'ordre croissant
    if (comparaison < 0) {
        System.out.println("Les deux variables dans l'ordre croissant sont : " + a + " et " + b);
    } else {
        System.out.println("Les deux variables dans l'ordre croissant sont : " + b + " et " + a);
    }
}
}
