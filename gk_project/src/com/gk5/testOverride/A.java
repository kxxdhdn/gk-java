package com.gk5.testOverride;

public class A {

	public void info() {
		System.out.println("Je suis A");
	}

	public void info(int a) {
		System.out.println("Je suis A");
	}

	@Override
	public String toString() {
		return "A [Classe de Test]";
	}

}
