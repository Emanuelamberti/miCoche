package com.ejercicioCoche.Coche;

public class Coche {
	private int puertas;

	public Coche() {

	}
	
	public Coche(int puertas) {
		this.puertas = puertas;
	}

	public void añadirPuerta(int puertas) {
		this.puertas += puertas;
	}

	public void printInfo() {
		System.out.println("La cantidad de puertas que tiene el coche es de: " + puertas);
	}
	
}
