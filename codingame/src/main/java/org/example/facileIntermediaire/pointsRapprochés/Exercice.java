package org.example.facileIntermediaire.pointsRapprochés;

import java.util.List;

/*
On donne une liste de points dans un espace bidimensionnel. Votre tâche est de trouver les deux points les plus proches l'un de l'autre.
Renvoyez les coordonnées de ces points et leur distance.

Input : Une liste de listes de deux entiers List<List<Integer>>, qui représente les coordonnées x et y de chaque point.
Output : Une liste contenant trois items : deux sous-listes de deux entiers chaque, représentant les coordonnées x et y
des deux points les plus proches, suivi par la distance entre ces deux points comme double.
 */
public class Exercice {

    public static List<Object> findClosestPoints(List<List<Integer>> points) {
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> points = List.of(
                List.of(1, 1),
                List.of(3, 3),
                List.of(5, 5),
                List.of(7, 7)
        );

        List<Object> result = findClosestPoints(points);

        List<Integer> closestPoint1 = (List<Integer>) result.get(0);
        List<Integer> closestPoint2 = (List<Integer>) result.get(1);
        double minDistance = (double) result.get(2);

        System.out.println("Coordonnées du premier point le plus proche : " + closestPoint1);
        System.out.println("Coordonnées du deuxième point le plus proche : " + closestPoint2);
        System.out.println("Distance entre les deux points : " + minDistance);
    }
}
