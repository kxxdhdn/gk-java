package org.example.facileIntermediaire.procheZero;



/* Implémentez la méthode closestToZero pour renvoyer l'entier du tableau plus proche de zéro.
• S'il y a deux entiers tout aussi proches de zéro, considérez l'entier positif comme étant le plus proche de zéro (par exemple silints contient -5 et 5, retournez 5).
• Si ints est null ou vide, retournez 0 (zero). e Données : les entiers dans ints ont des valeurs allant de -2147483647 à 2147483647.
 */

public class Exercice {


    static int closestToZero(int[] ints) {

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 2, -1, -8, 1};
        int result = closestToZero(arr);
        System.out.println("Le nombre le plus proche de zéro est : " + result);
        if(result == 1){
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
