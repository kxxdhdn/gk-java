package org.example.facileIntermediaire.apparition;

import java.util.*;

/* - Objectif Dans les tâches de traitement de texte, l'une des premières choses à faire est de déterminer la fréquence d'apparition
de chaque mot dans un document donné. Dans cette tâche, vous allez compléter une fonction qui renvoie les fréquences uniques
des mots d'un document de mots tokenisés.
Implémentation Implémentez la méthode count Frequencies (words) qui prend comme entrée un tableau de chaînes de caractères (words),
représentant un document de mots tokenisés. Par exemple: I'the', "dog', "got', "the', "bone"l
Votre méthode countFrequencies doit retourner un tableau d'entiers contenant le nombre d'occurrences de chaque
mot triés par ordre alphabétique. Pour l'exemple ci-dessus, la sortie correcte serait : [1, 1, 1, 2] # bone = 1, dog = 1, got = 1, the = 2 */

public class Exercice {
    public static int[] countFrequencies(String[] words) {
        return null;
    }


    public static void main(String args[]) {
        String[] input = new String[]{"toto", "titi", "tutu", "toto"};
        int[] expected = new int[]{1, 1, 2};
        int[] output = countFrequencies(input);

        if (Arrays.equals(expected, output)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
            for (int i : output) {
            }
        }

    }
}
