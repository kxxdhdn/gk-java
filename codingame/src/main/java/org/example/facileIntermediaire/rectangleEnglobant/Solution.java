package org.example.facileIntermediaire.rectangleEnglobant;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {

    public static List<Integer> boundingRectangle(List<List<Integer>> coordinatesPoints) {
        if (coordinatesPoints == null || coordinatesPoints.size() < 2) {
            throw new IllegalArgumentException("Il doit y avoir au moins 2 points.");
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (List<Integer> point : coordinatesPoints) {
            int x = point.get(0);
            int y = point.get(1);

            if (x < minX) {
                minX = x;
            }

            if (y < minY) {
                minY = y;
            }

            if (x > maxX) {
                maxX = x;
            }

            if (y > maxY) {
                maxY = y;
            }
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return Arrays.asList(minX, minY, width, height);
    }

    public static void main(String[] args) {
        List<List<Integer>> coordinatesPoints = new ArrayList<>();
        coordinatesPoints.add(Arrays.asList(1, 3));
        coordinatesPoints.add(Arrays.asList(5, 7));
        coordinatesPoints.add(Arrays.asList(3, 4));
        coordinatesPoints.add(Arrays.asList(9, 6));

        List<Integer> boundingRect = boundingRectangle(coordinatesPoints);

        System.out.println("Rectangle englobant :");
        System.out.println("Coin supérieur gauche : (" + boundingRect.get(0) + ", " + boundingRect.get(1) + ")");
        System.out.println("Largeur : " + boundingRect.get(2));
        System.out.println("Hauteur : " + boundingRect.get(3));

        if(boundingRect.get(0).equals(1) && boundingRect.get(1).equals(3) && boundingRect.get(2).equals(8) && boundingRect.get(3).equals(4)){
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
