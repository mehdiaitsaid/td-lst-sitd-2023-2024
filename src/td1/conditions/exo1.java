package td1.conditions;

import java.util.Scanner;

public class exo1 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire les trois variables
    System.out.println("Entrez la première variable :");
    int a = scanner.nextInt();
    System.out.println("Entrez la deuxième variable :");
    int b = scanner.nextInt();
    System.out.println("Entrez la troisième variable :");
    int c = scanner.nextInt();

    // Calculer le maximum
    int maximum = a;
    if (b > maximum) {
        maximum = b;
    }
    if (c > maximum) {
        maximum = c;
    }

    // Afficher le maximum
    System.out.println("Le maximum des trois variables est : " + maximum);
}
}
