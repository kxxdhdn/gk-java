package com.gk5.complements;

public class Conteneur<T> {

	T t;

	public void info() {
		System.out.println(this.t);
	}

	public Conteneur(T t) {
		this.t = t;
	}

}
