package org.example.difficile.triangleSurfaceMax;

import java.util.List;

/*
Vous recevez en entrée une liste de points dans un espace bidimensionnel.
Votre tâche est de trouver le triangle formé par trois de ces points ayant la
plus grande surface. Renvoyez les coordonnées de ces trois points et la surface du triangle.

Input : Une liste de listes de deux entiers List<List<Integer>>, qui représente
les coordonnées x et y de chaque point. Output : Une liste contenant quatre items :
trois sous-listes de deux entiers chacune, représentant les coordonnées x et y des
trois points formant le triangle, suivi par la surface du triangle comme double.
 */
public class Exercice {
    public static List<Object> findLargestTriangleArea(List<List<Integer>> points) {
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> points = List.of(
                List.of(0, 0),
                List.of(1, 1),
                List.of(2, 2),
                List.of(3, 0),
                List.of(3, 3)
        );

        List<Object> result = findLargestTriangleArea(points);

        List<Integer> trianglePoint1 = (List<Integer>) result.get(0);
        List<Integer> trianglePoint2 = (List<Integer>) result.get(1);
        List<Integer> trianglePoint3 = (List<Integer>) result.get(2);
        double maxArea = (double) result.get(3);

        System.out.println("Coordonnées du premier point du triangle : " + trianglePoint1);
        System.out.println("Coordonnées du deuxième point du triangle : " + trianglePoint2);
        System.out.println("Coordonnées du troisième point du triangle : " + trianglePoint3);
        System.out.println("Surface du triangle : " + maxArea);
    }
}
