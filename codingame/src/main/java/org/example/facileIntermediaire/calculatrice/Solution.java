package org.example.facileIntermediaire.calculatrice;

public class Solution {

    public class Calculatrice {

        public static int addition(int a, int b) {
            return a + b;
        }

        public static int soustraction(int a, int b) {
            return a - b;
        }

        public static int multiplication(int a, int b) {
            return a * b;
        }

        public static double division(int a, int b) {
            if (b == 0) {
                System.out.println("Erreur: division par zéro");
                return Double.NaN;
            } else {
                return (double) a / b;
            }
        }

        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            System.out.println("Addition : " + addition(a, b));
            System.out.println("Soustraction : " + soustraction(a, b));
            System.out.println("Multiplication : " + multiplication(a, b));
            System.out.println("Division : " + division(a, b));
        }
    }

}
