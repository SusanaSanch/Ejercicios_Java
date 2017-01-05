package edu.cam.femxa.menuNavidad;

import java.util.Scanner;

public class Main {

	

	/**
	 * Muestra el men� al usuario
	 */
	public static void mostrarMenu()
	{
	System.out.println("Elija una opci�n del men�:");
	System.out.println("1.INSERTAR PERSONA");
	System.out.println("2.LISTAR PERSONA");
	System.out.println("3.BUSCAR PERSONA POR NOMBRE");
	System.out.println("4.BORRAR PERSONA");
	System.out.println("5.SALIR");
	}
	
	/**
	 * selecci�n de opci�n
	 * @return el n�mero de la opci�n del men�
	 */
	
	public static int seleccionarOpcion()
	{
		int opcion = 0;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
			opcion = scanner.nextInt();
		return opcion;
	}
	
	/**
	 * convierte el n�mero introducido en uno de los diferentes enumerados
	 * @param opcion n�mero elegido del men�
	 * @return enumerado elegido
	 */
	public static String convertirOpcion (int opcion)
	{
		String opcionL = null;
			switch(opcion)
			{
			case 1:
				opcionL = "UNO";
				break;
			case 2:
				opcionL = "DOS";
				break;
			case 3:
				opcionL = "TRES";
				break;
			case 4:
				opcionL = "CUATRO";
				break;
			case 5:
					opcionL = "CINCO";
					break;		
			}
			
		return opcionL;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		String listado[] = new String[5]; //Crea array de 5 personas
		boolean salir = false;
		int opcion = 0;
		String opcionLetras = null;
		
		do //Bucle de men�
		{
		
			mostrarMenu(); //Muestra el men�
		/*
		 * TODO SELECCIONAR OPCION, CONVERTIR OPCI�N EN ENUM
		 */
			opcion = seleccionarOpcion();
			opcionLetras = convertirOpcion(opcion);
			Menu.ejecutarMenu(opcionLetras);			
			
		/*
		 * TODO SWITCH ENUM
		 */
			
		}
		while (salir);
		System.out.println("PROGRAMA FINALIZADO");
	}

}
