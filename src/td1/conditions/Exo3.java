package td1.conditions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer la valeur de a: ");
        int a = input.nextInt();
        System.out.println("entrer la valeur de b: ");
        int b = input.nextInt();
        System.out.println("1.\tde savoir si la somme a + b est paire ;\n" +
                "2.\tde savoir si le produit ab est pair ;\n" +
                "3.\tde connaître le signe de la somme a + b ;\n" +
                "4.\tde connaître le signe du produit ab.\n ");

        int option = input.nextInt();
        switch (option){
            case 1: if((a+b)%2==0) System.out.println( "la somme est paire");
            else System.out.println( "la somme est impaire");
                break;
            case 2: if((a*b)%2==0) System.out.println( "le produit est paire");
            else System.out.println( "le produit est impaire");
                break;

            case 3: if((a+b)>0) System.out.println( "le sommme est positive");
            else System.out.println( "le somme est negative");
                break;

            case 4: if((a*b)>0) System.out.println( "le produit est positif");
            else System.out.println( "le produit est negatif ");
                break;
            case 5:
                String s = (a*b)>0 ? "le produit est positif" : "le produit est negatif ";
                System.out.println( s);

                break;

            default:
                System.out.println("Done");
                break;

        }
    }
}
