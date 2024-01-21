package com.gk.exo1;

public class Animal {

    // Attributs d'instance
    public String espece;
    public int age;

    public static int total;

    // Constructeur avec 2 paramètres
    public Animal(String espece, int age) {
//        super();
        this.espece = espece;
        this.age = age;
        total++;
    }

    @Override // On redefinie la méthode de la classe mère Objects (qui affiche le hashCode)
    public String toString() {
        return "Animal [espece=" + espece + ", age=" + age + "]";
    }

    public static void affichageTotal() {
        System.out.println("Nombre total des animaux : " + total);
    }

}
