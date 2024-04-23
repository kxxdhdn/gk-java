package org.example.difficile.cercleEnglobant;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static double[] findSmallestEnclosingCircle(List<List<Integer>> points) {
        // Convertir les points en tableau de doubles pour faciliter les calculs
        double[][] coords = new double[points.size()][2];
        for (int i = 0; i < points.size(); i++) {
            coords[i][0] = points.get(i).get(0);
            coords[i][1] = points.get(i).get(1);
        }

        // Initialiser le centre et le rayon du cercle
        double[] center = {0.0, 0.0};
        double radius = 0.0;

        // Appliquer l'algorithme Welzl pour trouver le cercle circonscrit le plus petit
        if (coords.length > 0) {
            center[0] = coords[0][0];
            center[1] = coords[0][1];
            for (int i = 1; i < coords.length; i++) {
                if (dist(center, coords[i]) > radius) {
                    center[0] = coords[i][0];
                    center[1] = coords[i][1];
                    radius = 0;
                    for (int j = 0; j < i; j++) {
                        if (dist(center, coords[j]) > radius) {
                            center[0] = (coords[i][0] + coords[j][0]) / 2.0;
                            center[1] = (coords[i][1] + coords[j][1]) / 2.0;
                            radius = dist(center, coords[j]);
                            for (int k = 0; k < j; k++) {
                                if (dist(center, coords[k]) > radius) {
                                    center[0] = (coords[i][0] + coords[j][0] + coords[k][0]) / 3.0;
                                    center[1] = (coords[i][1] + coords[j][1] + coords[k][1]) / 3.0;
                                    radius = dist(center, coords[k]);
                                }
                            }
                        }
                    }
                }
            }
        }

        // Retourner le résultat
        double[] result = {center[0], center[1], radius};
        return result;
    }

    // Méthode pour calculer la distance entre deux points
    private static double dist(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
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
