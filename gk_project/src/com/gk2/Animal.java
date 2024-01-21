package com.gk2;

public class Animal {

    // Attributs d'instance
    public String espece;
    public int age;
    public double poids;
    
    // Méthodes d'instance
    
    public void manger()
    {
        System.out.println("J'ai faim, je veux manger. ");
    }
    
    public void info()
    {
        System.out.println(this.espece);
    }
}
