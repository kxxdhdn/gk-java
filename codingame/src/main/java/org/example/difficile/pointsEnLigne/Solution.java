package org.example.difficile.pointsEnLigne;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Object> findMostPointsOnLine(List<List<Integer>> points) {
        // Si le nombre de points est inférieur ou égal à 1, retourner les points tels quels
        if (points.size() <= 1) {
            return null;
        }

        int maxPoints = 0; // Nombre maximal de points sur une ligne
        List<Integer> point1 = null; // Premier point sur la ligne
        List<Integer> point2 = null; // Deuxième point sur la ligne

        // Parcourir chaque point et calculer les pentes avec les autres points
        for (int i = 0; i < points.size(); i++) {
            Map<Double, Integer> slopeCount = new HashMap<>(); // Pour stocker le nombre de points ayant la même pente
            int samePointCount = 0; // Compter les points identiques

            for (int j = 0; j < points.size(); j++) {
                if (i == j) {
                    continue; // Ignorer le même point
                }

                List<Integer> p1 = points.get(i);
                List<Integer> p2 = points.get(j);

                // Calculer la pente entre les deux points
                double slope = calculateSlope(p1, p2);

                // Mettre à jour le nombre de points ayant la même pente
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
            }

            // Trouver la pente avec le plus grand nombre de points
            for (Map.Entry<Double, Integer> entry : slopeCount.entrySet()) {
                if (entry.getValue() > maxPoints) {
                    maxPoints = entry.getValue();
                    point1 = points.get(i);
                    point2 = findPointWithSlope(points, point1, entry.getKey());
                }
            }
        }

        return List.of(point1, point2, maxPoints);
    }

    // Méthode pour calculer la pente entre deux points
    private static double calculateSlope(List<Integer> p1, List<Integer> p2) {
        if (p1.get(0) == p2.get(0)) {
            return Double.POSITIVE_INFINITY; // Pente verticale
        } else {
            return (double) (p2.get(1) - p1.get(1)) / (double) (p2.get(0) - p1.get(0));
        }
    }

    // Méthode pour trouver un point sur la ligne avec une pente donnée
    private static List<Integer> findPointWithSlope(List<List<Integer>> points, List<Integer> referencePoint, double slope) {
        for (List<Integer> point : points) {
            if (point.equals(referencePoint)) {
                continue; // Ignorer le point de référence
            }
            if (calculateSlope(referencePoint, point) == slope) {
                return point;
            }
        }
        return null; // Aucun point trouvé avec la pente donnée
    }

    // Méthode main pour tester la fonction findMostPointsOnLine
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
