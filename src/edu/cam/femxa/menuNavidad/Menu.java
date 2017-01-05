package edu.cam.femxa.menuNavidad;

import java.util.Scanner;

public class Menu {
	
public enum Eleccion {UNO, DOS, TRES, CUATRO, CINCO}
	
	public static boolean ejecutarMenu(String opcion)
	{
		boolean salir = false;
		
			switch (opcion)
			{
			case "UNO":
				//TODO insertarPersona;
				break;
			case "DOS":
				//TODO listarPersona;
				break;
			case "TRES":
				//TODO buscarPersona;
				break;
			case "CUATRO":
				//TODO borrarPersona;
				break;
			case "CINCO":
				salir = true;
				break;
			}
			
		return salir;
	}
	
	
	
	/*
	 * Cambiar persona por persona de array
	 */
	public static void insertarPersona()
	{
		
		Scanner scan = null;
		scan = new Scanner(System.in);
		Personas persona = null;
		String nombre = null;
		int edad = 0;
				
		System.out.println("INTRODUZCA EL NOMBRE DE LA PERSONA:");
		nombre = scan.next();
		
		System.out.println("INTRODUZCA LA EDAD DE LA PERSONA:");
		edad = scan.nextInt();
		
		persona = new Personas (nombre, edad);
		
	}

}
