package edu.cam.femxa.imc;

import java.util.Scanner;

public class EntradaSalida {
	
	public static double obtenerPeso ()
	{
		double peso = 0;
		Scanner scaner = null;
		
			System.out.println("Introduce peso:");
			scaner = new Scanner (System.in);
			peso = scaner.nextDouble();
					
		return peso;
	}
	
	public static double obtenerAltura()
	{
		double altura = 0;
		Scanner scaner = null;
		
			System.out.println("Introduce altura:");
			scaner = new Scanner (System.in);
			altura = scaner.nextDouble();
					
		return altura;
	}
	
	
	public static void mostrarIMC (double imc)
	{
		System.out.println("Su IMC es: " + imc);
	}

}
