package org.example.facileIntermediaire.rectangleEnglobant;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* - Vous devez calculer un rectangle englobant, c'est-à-dire le rectangle contenant un ensemble de points donnés, dans un espace en 2 dimensions.
Vous recevez en paramètre un tableau de nombres entiers, contenant au moins 2 lignes. Chaque ligne contient 2 nombres, représentant les 2 coordonnées (x, y) d'un point.
Vous devez renvoyer un tableau de 4 nombres entiers.
• La plus petite valeur parmi toutes les coordonnées x des points données en parametre.
• La plus petite valeur parmi toutes les coordonnées y des points données en parametre.
• La largeur du rectangle, égale à la plus grande coordonnées x, moins la plus petite des coordonnées x.
• La hauteur du rectangle : le plus grand y - le plus petit y. Implémenter la méthode boundingRectangle.
• Paramètres coordinatesPoints (List<List<Integer>>): Une liste de coordonnées (x, y), définissant des points dans un espace à 2 dimensions
• Valeur de retour rectangleDefinition (List‹Integer>) : Les coordonnées (x, y) du coin supérieur gauche du rectangle, suivi de sa largeur et sa hauteur.
• Contraintes Mémoire RAM disponible: 512 Mo
# Exemple Paramètres * (3) 11...1, 1. 1, 1.11 Valeur de retour * (4) [ 2, 39, 99, 91 1]
*/
public class Exercice {
    public static List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> coordinatesPoints = new ArrayList<>();
        coordinatesPoints.add(Arrays.asList(1, 3));
        coordinatesPoints.add(Arrays.asList(5, 7));
        coordinatesPoints.add(Arrays.asList(3, 4));
        coordinatesPoints.add(Arrays.asList(9, 6));

        List<Integer> boundingRect = boundingRectangle(coordinatesPoints);

        System.out.println("Rectangle englobant :");
        System.out.println("Coin supérieur gauche : (" + boundingRect.get(0) + ", " + boundingRect.get(1) + ")");
        System.out.println("Largeur : " + boundingRect.get(2));
        System.out.println("Hauteur : " + boundingRect.get(3));

        if(boundingRect.get(0).equals(1) && boundingRect.get(1).equals(3) && boundingRect.get(2).equals(8) && boundingRect.get(3).equals(4)){
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
