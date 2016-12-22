package edu.cam.femxa.adivinanza;

import java.util.Scanner;

public class EntradaSalida 
{
	
	public static int solicitarNumero()
	{
		int num_usuario = 0;
		Scanner scan = null;
		
			System.out.println("Introduzca un número entero entre el 1 y el 100");
			scan = new Scanner (System.in);
			num_usuario = scan.nextInt();
		
		return num_usuario;	
	}
	
	
	
	public static void esMenor()
	{
		Scanner scan = null;
		
			System.out.println("Tu número es menor");
	}
	
	
	
	public static void esMayor()
	{
		Scanner scan = null;
		
			System.out.println("Tu número es mayor");							
	}
	
	
	
	public static void numAdivinado()
	{
		Scanner scan = null;
		
			System.out.println("¡¡¡Enhorabuena, has acertado!!!");
			System.out.println(":)");					
	}
	
	
	
	public static void pruebaDeNuevo(int contador)
	{
		Scanner scan = null;
		
			System.out.println("Te quedan " + (4 - contador) + " intentos");
	}
	
	
	
	public static void perdiste()
	{	
		Scanner scan = null;
		
			System.out.println("Perdiste!");
			System.out.println(":(");					
	}
	
}
