package org.example.facileIntermediaire.pointsRapprochés;

import java.util.List;

public class Solution {
    public static List<Object> findClosestPoints(List<List<Integer>> points) {
        // Si le nombre de points est inférieur ou égal à 1, retourner null
        if (points.size() <= 1) {
            return null;
        }

        List<Integer> closestPoint1 = null; // Coordonnées du premier point le plus proche
        List<Integer> closestPoint2 = null; // Coordonnées du deuxième point le plus proche
        double minDistance = Double.MAX_VALUE; // Distance minimale entre deux points

        // Parcourir chaque paire de points et calculer la distance entre eux
        for (int i = 0; i < points.size() - 1; i++) {
            List<Integer> point1 = points.get(i);
            for (int j = i + 1; j < points.size(); j++) {
                List<Integer> point2 = points.get(j);
                double distance = calculateDistance(point1, point2);
                // Mettre à jour la paire de points la plus proche et la distance minimale
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPoint1 = point1;
                    closestPoint2 = point2;
                }
            }
        }

        // Retourner les coordonnées des deux points les plus proches et leur distance
        return List.of(closestPoint1, closestPoint2, minDistance);
    }

    // Méthode pour calculer la distance entre deux points
    private static double calculateDistance(List<Integer> point1, List<Integer> point2) {
        int deltaX = point1.get(0) - point2.get(0);
        int deltaY = point1.get(1) - point2.get(1);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Méthode main pour tester la fonction findClosestPoints
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
