package edu.cam.femxa.ficheros;

import java.util.Scanner;

public class EntradaSalida {
	
	
	public static String introduce_cadena ()
	{
		String nombre;
		Scanner sc = null;
		
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		
		return nombre;
	}

	
	public static String solicita_nombre ()
	{
		String nombre;
		System.out.println("Introduzca su nombre de Usuario para el registro:");
		nombre = introduce_cadena();
		return nombre;
	}
	
	public static String solicita_password ()
	{
		String psw;
		System.out.println("Introduzca su contraseña:");
		psw = introduce_cadena();
		return psw;
	}
	
	
	public static int muestraMenu ()
	{
		int opcion;
		Scanner sc = null;
		
		System.out.println("Elija una opción del menú:");
		System.out.println("1. Registrar nuevo usuario");
		System.out.println("2. Acceder con usuario");
		System.out.println("3. Salir");
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		return opcion;
	}
}
