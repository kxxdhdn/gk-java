package org.example.difficile.cercleEnglobant;

import java.util.ArrayList;
import java.util.List;

/*
Dans cet exercice, vous recevez en paramètres un tableau contenant des points dans un espace à 2 dimensions.
Chaque point est représenté par 2 nombres, x et y. Vous devez trouver la plus petite circonférence qui englobe
tous les points, en renvoyant le centre du cercle sous la forme (x, y) et le rayon du cercle comme un double.

Input : Une liste de listes de deux entiers List<List<Integer>>, qui représente les coordonnées x et y de chaque point.
Output : Une liste contenant trois items List<Double> : les coordonnées x et y du centre du cercle, suivi par le rayon du cercle.
 */
public class Exercice {
    public static double[] findSmallestEnclosingCircle(List<List<Integer>> points) {

        return null;
    }


    public static void main(String[] args) {
        // Création de quelques points pour tester
        List<List<Integer>> points = new ArrayList<>();
        points.add(List.of(0, 0));
        points.add(List.of(1, 0));
        points.add(List.of(0, 1));

        // Appel de la fonction pour trouver le cercle circonscrit le plus petit
        double[] result = Exercice.findSmallestEnclosingCircle(points);

        // Affichage des résultats
        System.out.println("Centre du cercle : (" + result[0] + ", " + result[1] + ")");
        System.out.println("Rayon du cercle : " + result[2]);
    }
}
