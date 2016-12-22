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
	
	public static void numNoAdivinado()
	{
		
		Scanner scan = null;
		
			System.out.println("El número no es correcto");
					
		
		
	}
	
	public static void numAdivinado()
	{
		
		Scanner scan = null;
		
			System.out.println("¡¡¡Enhorabuena, has acertado!!!");
			System.out.println(":)");
					
				
	}
	
}
