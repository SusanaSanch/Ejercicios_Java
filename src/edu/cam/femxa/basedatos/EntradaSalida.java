package edu.cam.femxa.basedatos;

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

	public static int solicitaDatosAlta()
	{
		Scanner sc = null;
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca datos de nuevo Empleado:");
		System.out.println("Introduzca Nombre:");
		
		System.out.println("Introduzca ID");
	}
}
