package com.ejercicioCoche.Coche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CocheApplication {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 7;
		
		int resultado = suma(num1,num2);
		
		System.out.println("El resultado de la suma es: " + resultado);
		
		Coche miCoche = new Coche(3);
		miCoche.añadirPuerta(1);
		miCoche.printInfo();
		
	}
	
	public static int suma(int a, int b) {
		return a + b;
	}

}
