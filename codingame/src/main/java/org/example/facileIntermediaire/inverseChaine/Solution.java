package org.example.facileIntermediaire.inverseChaine;

public class Solution {
    public static String reverseWordsOrder(String input) {
        // Diviser la chaîne en mots en utilisant l'espace comme délimiteur
        String[] words = input.split(" ");

        // Construire une nouvelle chaîne en parcourant les mots dans l'ordre inverse
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Ajouter un espace entre les mots, sauf pour le dernier mot
            }
        }

        return reversed.toString();
    }

    // Méthode main pour tester la fonction reverseWordsOrder
    public static void main(String[] args) {
        String input = "Je suis en train d'apprendre Java";
        String reversed = reverseWordsOrder(input);
        System.out.println("Chaîne inversée : " + reversed);
    }
}
