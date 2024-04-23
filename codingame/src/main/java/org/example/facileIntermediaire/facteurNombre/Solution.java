package org.example.facileIntermediaire.facteurNombre;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        // Parcourir de 1 à la moitié du nombre pour trouver les facteurs
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        // Ajouter le nombre lui-même comme facteur
        factors.add(number);

        return factors;
    }

    // Méthode main pour tester la fonction findFactors
    public static void main(String[] args) {
        int number = 12;
        List<Integer> factors = findFactors(number);
        System.out.println("Les facteurs de " + number + " sont : " + factors);
    }
}
