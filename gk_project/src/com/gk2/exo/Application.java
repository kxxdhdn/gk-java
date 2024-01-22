package com.gk2.exo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // AniMAL -> Animal
        String w1 = " AniMAL ";
        System.out.println(w1.trim().substring(0, 1) + w1.trim().substring(1, w1.trim().length()).toLowerCase());

        // Faite la lecture de votre nom et prénom en miniscule à partir du clavier
        // Convertir le premier caractère en majuscule
        // et ajouter le prefixe "Ingénieur" et afficher le résultat à la console.
        // Utiliser la classe Scanner de java.util
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Saisir votre prénom : ");
        String prenom = scanner.nextLine();
        System.out.println("Ingénieur " + prenom.trim().substring(0, 1).toUpperCase() + prenom.trim().substring(1) + " "
                + nom.trim());
//                + nom.trim().substring(0, 1).toUpperCase() + nom.trim().substring(1));
        scanner.close();

    }

}
