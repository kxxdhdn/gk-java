package org.example.difficile.pointsEnLigne;

import java.util.List;

/*
Étant donné une liste de points dans un espace bidimensionnel, trouvez la ligne qui contient
le plus grand nombre de ces points. Renvoyez les coordonnées de deux points sur cette ligne
ainsi que le nombre de points sur la ligne.

Input : Une liste de listes de deux entiers List<List<Integer>>, qui représente les coordonnées x et y de chaque point.
Output : Une liste contenant trois items : deux sous-listes de deux entiers chacune, représentant
les coordonnées x et y de deux points sur la ligne, suivies par le nombre total des points sur cette ligne comme entier.
 */
public class Exercice {
    public static List<Object> findMostPointsOnLine(List<List<Integer>> points) {
        return null;
    }

    public static void main(String[] args) {
        List<List<Integer>> points = List.of(
                List.of(1, 1),
                List.of(2, 2),
                List.of(3, 3),
                List.of(4, 4),
                List.of(5, 5)
        );

        List<Object> result = findMostPointsOnLine(points);

        List<Integer> point1 = (List<Integer>) result.get(0);
        List<Integer> point2 = (List<Integer>) result.get(1);
        int maxPoints = (int) result.get(2);

        System.out.println("Coordonnées du premier point sur la ligne : " + point1);
        System.out.println("Coordonnées du deuxième point sur la ligne : " + point2);
        System.out.println("Nombre total de points sur cette ligne : " + maxPoints);
    }
}
