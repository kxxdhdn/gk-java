package com.gk.exo1;

import java.util.Scanner;

public class TestAnimal {

    public static void main(String[] args) {
//        Animal a1 = new Animal("Chien", 3);
        Animal a2 = new Animal("Dorade", 1);
        Animal a3 = new Animal("Canari", 4);

        // Lire une information depuis le clavier
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taper une espèce d'animal : ");
        String espece = scanner.nextLine(); // nextLine() : méthode qui permet de lire une chaine de caractère depuis clavier

        System.out.println("Taper âge de l'animal : ");
        int age = scanner.nextInt(); // nextInt() : méthode qui permet de lire à partir du clavier un entier
        
        Animal a1 = new Animal(espece, age);
        System.out.println(); // appel de la méthode toString()
        
        Animal[] animaux = { a1, a2, a3 };
        
        for (int i = 0; i < animaux.length; i++) {
            System.out.println(animaux[i].toString());
        }

        Animal.affichageTotal();
        System.out.println("Animal total : " + Animal.total);
//        System.out.println(a1);
//        System.out.println(a1.toString());
        
        scanner.close();

    }

}
