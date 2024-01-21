package com.gk;

public class Voiture {

    // Les attributs d'instance

    String marque;
    String modele;
    int numCirculation;
    double prix;

    // Les constructeurs : une méthode spéciale permettant de créer notre
    // objet(instance)

    public Voiture() // constructeur par défaut
    {
        System.out.println("Nouvelle voiture vide");
    }

    public Voiture(String mq, String mdl, double pr, int numc) // constructeur avec paramètres
    {
        marque = mq;
        modele = mdl;
        numCirculation = numc;
        prix = pr;
    }

    // méthodes d'instance

    public void info() {
        System.out.println("Marque : " + marque + " Modèle : " + modele + " NumCirculation : " + numCirculation
                + " prix : " + prix);
    }

    public double prixVoiture() {
        return prix;
    }

    public String marqueVoiture() {
        return marque;
    }
}