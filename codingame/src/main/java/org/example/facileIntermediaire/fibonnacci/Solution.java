package org.example.facileIntermediaire.fibonnacci;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> generateFibonacciSequence(int n) {
        List<Integer> fibonacciSequence = new ArrayList<>();

        // Ajouter les deux premiers nombres de la suite de Fibonacci
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        // Générer les nombres suivants jusqu'à ce que le dernier nombre de la suite soit supérieur à n
        int i = 2;
        while (true) {
            int nextFibonacci = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            if (nextFibonacci <= n) {
                fibonacciSequence.add(nextFibonacci);
                i++;
            } else {
                break;
            }
        }

        return fibonacciSequence;
    }

    // Méthode main pour tester la fonction generateFibonacciSequence
    public static void main(String[] args) {
        int n = 7;
        List<Integer> fibonacciSequence = generateFibonacciSequence(n);
        System.out.println("La suite de Fibonacci jusqu'à " + n + " est : " + fibonacciSequence);
    }
}
