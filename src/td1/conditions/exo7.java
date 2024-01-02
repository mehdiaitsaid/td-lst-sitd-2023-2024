package td1.conditions;

import java.util.Scanner;

public class exo7 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lire le numéro du mois
    System.out.println("Entrez le numéro du mois :");
    int mois = scanner.nextInt();

    // Lire l'année
    System.out.println("Entrez l'année :");
    int annee = scanner.nextInt();

    // Déterminer le nombre de jours du mois
    int jours = 0;
    switch (mois) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            jours = 31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            jours = 30;
            break;
        case 2:
            if (annee % 4 == 0) {
                jours = 29;
            } else {
                jours = 28;
            }
            break;
    }

    // Afficher le nombre de jours
    System.out.println("Le mois " + mois + " de l'année " + annee + " a " + jours + " jours.");
}
}
