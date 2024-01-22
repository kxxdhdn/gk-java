package com.gk5.lesAnimaux;

public abstract class Animal {
	String espece;
	int age;

	public void manger() {
		System.out.println("J'ai faim, je veux bien manger");
	}

	public void dormir() {
		System.out.println("Il est un peu tard, je vais faire dodo");
	}

	public abstract void seDeplacer(); // méthode abstraite

}
