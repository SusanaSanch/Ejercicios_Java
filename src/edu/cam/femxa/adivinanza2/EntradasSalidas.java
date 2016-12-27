package edu.cam.femxa.adivinanza2;

import java.util.Scanner;

public class EntradasSalidas {
	
	public static void instruccionesJuego()
	{
		System.out.println("Piensa en número entero entre el 1 y el 100");
	}
	
	public static void mostrarNumero (int numero)
	{
		System.out.println("¿El número " + numero + " es mayor (>), menor (<), o igual (=) que el pensado?");
	}
	
	public static char recibirRespuesta ()
	{
		char respuesta = 0;
		String cadena = null;
		Scanner scan = null;
			
			scan = new Scanner (System.in);
			cadena = scan.next();
			respuesta = cadena.charAt(0);
		
		return respuesta;
	}
	
	
	public static void mostrarDerrota()
	{
		System.out.println("Has perdido! he adivinado tu número");
	}

	
	public static void mostrarVictoria()
	{
		System.out.println("Enhorabuena! has ganado, no he podido adivinar tu número");
	}
}
