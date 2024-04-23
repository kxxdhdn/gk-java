package org.example.difficile.perimetreMinimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Étant donné un tableau contenant des points dans un espace à 2 dimensions,
trouvez l'ensemble de points formant le périmètre le plus petit possible qui englobe
tous les points. Renvoyez la liste de ces points et la longueur totale du périmètre.

Input : Une liste de listes de deux entiers List<List<Integer>>, qui représente les coordonnées x et y de chaque point.
Output : Une liste contenant n + 1 items (où n est le nombre des points formant le périmètre minimal),
n sous-listes de deux entiers chacune représentant les coordonnées x et y des points formant le
périmètre, suivies par la longueur totale du périmètre comme double.
 */
public class Exercice {

    public static List<List<Integer>> findMinimumPerimeter(List<List<Integer>> points) {
        return null;
    }


    public static void main(String[] args) {
        List<List<Integer>> points = new ArrayList<>();
        points.add(List.of(0, 0));
        points.add(List.of(0, 1));
        points.add(List.of(1, 0));
        points.add(List.of(1, 1));

        List<List<Integer>> perimeter = findMinimumPerimeter(points);

        System.out.println("Points formant le périmètre minimal : ");
        for (List<Integer> point : perimeter) {
            System.out.println(point);
        }
    }
}
