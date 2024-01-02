package td1.tables;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Demander à l'utilisateur la taille du tableau
    System.out.print("Entrez le nombre d'étudiants : ");
    int nombreEtudiants = scanner.nextInt();

    // Créer un tableau pour stocker les moyennes des étudiants
    double[] moyennes = new double[nombreEtudiants];

    // Lire les moyennes des étudiants depuis l'utilisateur
    for (int i = 0; i < nombreEtudiants; i++) {
        System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
        moyennes[i] = scanner.nextDouble();
    }

    // Demander à l'utilisateur le seuil
    System.out.print("Entrez le seuil de moyenne : ");
    double seuil = scanner.nextDouble();

    // Compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
    int nombreEtudiantsSupSeuil = 0;
    for (int i = 0; i < nombreEtudiants; i++) {
        if (moyennes[i] >= seuil) {
            nombreEtudiantsSupSeuil++;
        }
    }

    // Afficher le résultat
    System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + nombreEtudiantsSupSeuil);
}
}
