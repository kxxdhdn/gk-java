package com.gk;

import java.util.Scanner;

public class LectureClavier {

    public static void main(String[] args) {
        // Lire une information depuis le clavier
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre nom svp ? ");

        String nom = scanner.nextLine();
        
        System.out.println("Vous êtes : " + nom);
        
        scanner.close();

    }

}
