package edu.cam.femxa;

public class Cadenas {

	public static void main(String[] argumentos) 
	{
		/*
		System.out.println("Palabra 1 = " + argumentos [0]);
		System.out.println("Palabra 2 = " + argumentos [1]);
		System.out.println("Palabra 3 = " + argumentos [2]);
		*/	
		
		int posicion_inicial = 0;
		int posicion_final = argumentos.length;
		String palabra_actual = null;
		
		for (int i = posicion_inicial; i < posicion_final; i++)
		
		{
			palabra_actual = argumentos [i];
			System.out.println("La palabra "+ i + " es " + palabra_actual);
		}
	}

}
