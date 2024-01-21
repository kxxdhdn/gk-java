package com.gk2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Application {

    public static void main(String[] args) {
        // Partie 1 : La classe String

        String ecole = "global knowledge";
        System.out.println(ecole);
        System.out.println(ecole.toUpperCase());

        String formateur = "Mohamed Amine MEZGHICH";
        System.out.println(formateur);
        System.out.println(formateur.toLowerCase());
        System.out.println(formateur.length());
        System.out.println(formateur.charAt(0)); // premier caractère
        System.out.println(formateur.charAt(formateur.length() - 1)); // dernier caractère

        String prenom = formateur.substring(8, 13);
        System.out.println(prenom);
        String nom = formateur.substring(14);
        System.out.println(nom);

        String word = "\t tabulation debut et fin\t";
        System.out.println(word);
        System.out.println(word.trim()); // la fct trim() permet de supprimer les espaces au début et fin ainsi que les
                                         // tabulations/retour

        String w1 = "java";
        String w2 = "JAVA";
        System.out.println(w1.equals(w2)); // false
        System.out.println(w1.equalsIgnoreCase(w2)); // true

        // Partie 2 : Les Date & Time

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate dateAnniversaire = LocalDate.of(1985, Month.JULY, 10);
        System.out.println(dateAnniversaire);

        System.out.println(date.plusYears(3));
        System.out.println(date.minusMonths(1));

        Period period = Period.of(2, 1, 10);
        date = date.plus(period);
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time.truncatedTo(ChronoUnit.SECONDS));
        LocalTime t2 = LocalTime.of(11, 36, 10);
        System.out.println(t2);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt2 = LocalDateTime.of(1985, 7, 10, 15, 30);
        System.out.println(ldt2);

        // Partie 3 : Héritage en Java

        // Partie 4 : Les 4 modificateurs de visibilité

    }

}
