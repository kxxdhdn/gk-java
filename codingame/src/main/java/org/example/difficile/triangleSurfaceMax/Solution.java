package org.example.difficile.triangleSurfaceMax;

import java.util.List;

public class Solution {
    public static List<Object> findLargestTriangleArea(List<List<Integer>> points) {
        // Si le nombre de points est inférieur à 3, retourner null
        if (points.size() < 3) {
            return null;
        }

        List<Integer> trianglePoint1 = null; // Coordonnées du premier point du triangle
        List<Integer> trianglePoint2 = null; // Coordonnées du deuxième point du triangle
        List<Integer> trianglePoint3 = null; // Coordonnées du troisième point du triangle
        double maxArea = 0.0; // Surface maximale du triangle

        // Parcourir toutes les combinaisons de trois points et calculer la surface du triangle formé
        for (int i = 0; i < points.size() - 2; i++) {
            List<Integer> point1 = points.get(i);
            for (int j = i + 1; j < points.size() - 1; j++) {
                List<Integer> point2 = points.get(j);
                for (int k = j + 1; k < points.size(); k++) {
                    List<Integer> point3 = points.get(k);
                    double area = calculateTriangleArea(point1, point2, point3);
                    // Mettre à jour les points du triangle et la surface maximale si la surface calculée est plus grande
                    if (area > maxArea) {
                        maxArea = area;
                        trianglePoint1 = point1;
                        trianglePoint2 = point2;
                        trianglePoint3 = point3;
                    }
                }
            }
        }

        // Retourner les coordonnées des trois points du triangle et la surface du triangle
        return List.of(trianglePoint1, trianglePoint2, trianglePoint3, maxArea);
    }

    // Méthode pour calculer la surface d'un triangle à l'aide de la formule de la surface d'Heron
    private static double calculateTriangleArea(List<Integer> p1, List<Integer> p2, List<Integer> p3) {
        double a = calculateDistance(p1, p2);
        double b = calculateDistance(p2, p3);
        double c = calculateDistance(p1, p3);
        double s = (a + b + c) / 2.0; // Demi-périmètre
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Formule de la surface d'Heron
    }

    // Méthode pour calculer la distance entre deux points
    private static double calculateDistance(List<Integer> p1, List<Integer> p2) {
        return Math.sqrt(Math.pow(p1.get(0) - p2.get(0), 2) + Math.pow(p1.get(1) - p2.get(1), 2));
    }

    // Méthode main pour tester la fonction findLargestTriangleArea
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
