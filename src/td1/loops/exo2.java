package td1.loops;

import java.util.Scanner;

public class exo2 {public class SommeDesEntiersImpaires {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire l'entier
        System.out.println("Entrez un entier :");
        int n = scanner.nextInt();

        // Initialiser la somme
        int somme = 0;

        // Parcourir les entiers impairs inférieurs à N
        for (int i = 1; i < n; i += 2) {
            // Ajouter l'entier impair à la somme
            somme += i;
        }

        // Afficher la somme
        System.out.println("La somme des entiers impairs inférieurs à " + n + " est : " + somme);
    }}}

