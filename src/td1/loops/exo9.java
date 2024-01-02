package td1.loops;

public class exo9 { public static void main(String[] args) {
    int nombre = 25418;  // Remplacez cette valeur par le nombre entier de votre choix

    int somme = calculerSommeChiffres(nombre);

    System.out.println("La somme des chiffres de " + nombre + " est : " + somme);
}

    public static int calculerSommeChiffres(int n) {
        int somme = 0;

        while (n != 0) {
            somme += n % 10;  // Ajoute le dernier chiffre à la somme
            n /= 10;          // Supprime le dernier chiffre
        }

        return somme;
    }
}
