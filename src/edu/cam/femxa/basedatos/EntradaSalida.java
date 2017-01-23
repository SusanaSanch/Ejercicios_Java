package edu.cam.femxa.basedatos;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	
	public static int mostrarMenu()
	{
		int opcion = 0;
		System.out.println("Elija una opción del menú:");
		System.out.println("1. Alta empleado.");
		System.out.println("2. Baja empleado.");
		System.out.println("3. Salir.");
		opcion = recogerInt();
		
		
		return opcion;
	}
	
	public static int recogerInt()
	{
		int dato = 0;
		Scanner sc = null;
		sc = new Scanner(System.in);
				dato = sc.nextInt();
		
		return dato;
	}

	
	public static int solicitaId ()
	{
		Scanner sc = null;
		int id = 0;
		System.out.println("Introduzca ID");
		sc = new Scanner(System.in);
		id = sc.nextInt();
		return id;
	}
	
	
	public static String solicitaNombre ()
	{
		Scanner sc = null;
		String nombre = null;
		System.out.println("Introduzca Nombre:");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		return nombre;
	}
	
	public static boolean preguntarContinuar ()
	{
		boolean continuar = false;
		Scanner sc = null;
		String respuesta = null;
		System.out.println("¿Continuar introduciendo empleados? (S = Sí / N = No)");
		sc = new Scanner(System.in);
		respuesta = sc.nextLine();
		
		if(respuesta == "S" || respuesta == "s")
			{
				continuar = true;
			}
		
		return continuar;
	}
	
	
}
