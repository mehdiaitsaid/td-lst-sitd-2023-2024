package td1.conditions;

import java.util.Scanner;

public class exo2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire les coefficients de l'équation
    System.out.println("Entrez le coefficient a :");
    double a = scanner.nextDouble();
    System.out.println("Entrez le coefficient b :");
    double b = scanner.nextDouble();
    System.out.println("Entrez le coefficient c :");
    double c = scanner.nextDouble();

    // Calculer les solutions
    double delta = b * b - 4 * a * c;
    if (delta > 0) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Les solutions sont : x1 = " + x1 + " et x2 = " + x2);
    } else if (delta == 0) {
        double x = -b / (2 * a);
        System.out.println("La solution est : x = " + x);
    } else {
        System.out.println("L'équation n'a pas de solution réelle.");
    }
}
}
