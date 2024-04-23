package org.example.facileIntermediaire.fibonnacci;


import java.util.List;

/*
Écrivez une méthode qui prend un nombre en entrée et renvoie un tableau contenant la suite de Fibonacci
 jusqu'à ce nombre. Par exemple, si le nombre donné est 7, le tableau retourné serait [0, 1, 1, 2, 3, 5, 8, 13].
 */
public class Exercice {
    public static List<Integer> generateFibonacciSequence(int n) {

        return null;
    }

    public static void main(String[] args) {
        int n = 7;
        List<Integer> fibonacciSequence = generateFibonacciSequence(n);
        System.out.println("La suite de Fibonacci jusqu'à " + n + " est : " + fibonacciSequence);
    }
}
