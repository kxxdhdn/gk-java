package org.example.difficile.perimetreMinimal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static List<List<Integer>> findMinimumPerimeter(List<List<Integer>> points) {
        // Si le nombre de points est inférieur ou égal à 1, retourner les points tels quels
        if (points.size() <= 1) {
            return points;
        }

        // Trier les points par leur coordonnée x, puis y si les coordonnées x sont égales
        Collections.sort(points, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> p1, List<Integer> p2) {
                int diff = p1.get(0) - p2.get(0);
                if (diff == 0) {
                    return p1.get(1) - p2.get(1);
                }
                return diff;
            }
        });

        // Déterminer le point le plus à gauche et le point le plus à droite
        List<Integer> leftmost = points.get(0);
        List<Integer> rightmost = points.get(points.size() - 1);

        // Trier les points restants par leur pente par rapport à la ligne reliant le point le plus à gauche et le point le plus à droite
        List<List<Integer>> upper = new ArrayList<>();
        List<List<Integer>> lower = new ArrayList<>();
        for (int i = 1; i < points.size() - 1; i++) {
            List<Integer> current = points.get(i);
            int crossProduct = crossProduct(leftmost, rightmost, current);
            if (crossProduct > 0) {
                upper.add(current);
            } else if (crossProduct < 0) {
                lower.add(current);
            }
        }

        // Trier les points supérieurs par leur ordonnée décroissante et les points inférieurs par leur ordonnée croissante
        Collections.sort(upper, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> p1, List<Integer> p2) {
                return p2.get(1) - p1.get(1);
            }
        });
        Collections.sort(lower, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> p1, List<Integer> p2) {
                return p1.get(1) - p2.get(1);
            }
        });

        // Construire le périmètre minimal
        List<List<Integer>> perimeter = new ArrayList<>();
        perimeter.add(leftmost);
        perimeter.addAll(upper);
        perimeter.add(rightmost);
        perimeter.addAll(lower);

        // Calculer la longueur totale du périmètre
        double totalLength = calculatePerimeterLength(perimeter);

        // Ajouter la longueur totale du périmètre à la liste des résultats
        List<Integer> perimeterLength = new ArrayList<>();
        perimeterLength.add((int) totalLength);
        perimeter.add(perimeterLength);

        return perimeter;
    }

    // Méthode pour calculer le produit croisé entre deux vecteurs formés par trois points dans le plan
    private static int crossProduct(List<Integer> p1, List<Integer> p2, List<Integer> p3) {
        return (p2.get(0) - p1.get(0)) * (p3.get(1) - p1.get(1)) - (p3.get(0) - p1.get(0)) * (p2.get(1) - p1.get(1));
    }

    // Méthode pour calculer la longueur totale du périmètre
    private static double calculatePerimeterLength(List<List<Integer>> points) {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            List<Integer> current = points.get(i);
            List<Integer> prev = points.get(i - 1);
            length += Math.sqrt(Math.pow(current.get(0) - prev.get(0), 2) + Math.pow(current.get(1) - prev.get(1), 2));
        }
        return length;
    }

    // Méthode main pour tester la fonction findMinimumPerimeter
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
