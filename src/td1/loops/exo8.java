package td1.loops;

public class exo8 { public static void main(String[] args) {
    int n = 5;  // Changer la valeur selon le nombre d'étoiles que vous souhaitez afficher

    // Affichage croissant
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print('*');
        }
        System.out.println();
    }

    // Affichage décroissant
    for (int i = n - 1; i > 0; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
}
