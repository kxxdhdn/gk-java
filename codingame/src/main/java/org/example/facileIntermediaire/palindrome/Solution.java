package org.example.facileIntermediaire.palindrome;

public class Solution {
    public static boolean isPalindrome(String word) {
        // Convertir le mot en minuscules pour ignorer la casse
        word = word.toLowerCase();

        // Initialiser les indices pour comparer les caractères du début et de la fin du mot
        int i = 0;
        int j = word.length() - 1;

        // Parcourir le mot depuis les deux extrémités
        while (i < j) {
            // Ignorer les caractères non alphabétiques
            while (i < j && !Character.isLetterOrDigit(word.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(word.charAt(j))) {
                j--;
            }

            // Vérifier si les caractères aux indices actuels sont différents
            if (word.charAt(i) != word.charAt(j)) {
                return false; // Si les caractères sont différents, le mot n'est pas un palindrome
            }

            // Déplacer les indices vers l'intérieur
            i++;
            j--;
        }

        return true; // Si le mot a passé toutes les vérifications, c'est un palindrome
    }

    // Méthode main pour tester la fonction isPalindrome
    public static void main(String[] args) {
        String word = "radar";
        boolean isPal = isPalindrome(word);
        if (isPal) {
            System.out.println(word + " est un palindrome.");
        } else {
            System.out.println(word + " n'est pas un palindrome.");
        }
    }
}
