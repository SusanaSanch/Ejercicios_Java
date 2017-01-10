package edu.cam.femxa.menunavidad;

import java.util.Scanner;

public class pruebas 
{
//	public static void insertarPersona(Persona listado[])
//	{
//		
//		Scanner scan = null;
//		scan = new Scanner(System.in);
//		String nombre = null;
//		int edad = 0;
//		int cont = 0;
//		int pos = 0;
//		//obtener posición
//		
//			for(int i = 0; i < listado.length; i++)
//			{
//				pos = obtenerPosicion(listado, edad, i);
//				
//				System.out.println("INTRODUZCA EL NOMBRE DE LA PERSONA: " + (i+1));
//				nombre = scan.next();
//				
//				System.out.println("INTRODUZCA LA EDAD DE LA PERSONA: " + (i+1));
//				edad = scan.nextInt();
//				
//				desplazarDesdeHasta(listado, pos, i);
//				listado[pos].setEdad(edad);
//				listado[pos].setNombre(nombre);
//				
//			
//				/*
//				 * else 
//				{
//					cont++;
//				}
//			
//				if(cont == (listado.length - 1))
//				{
//					System.out.println("La base de datos está completa, por favor borre una persona para continuar");
//				}
//				*/
//			}
//			
//	}
//	
//	public static int obtenerPosicion (Persona listado[], int edad, int limite)
//	{
//		int pos = 0;
//				
//			while ((pos < limite)&&(listado[pos].getEdad() < edad))
//			{
//				pos++;
//			}
//		
//		return pos;
//	}
//	
//	public static void desplazarDesdeHasta (Persona listado [] , int pos_inicial, int pos_final)
//	{
//				
//		for (int pos = pos_final + 1; pos > pos_inicial; pos--) 
//		{
//			if (pos < listado.length)
//			{
//				listado [pos] = listado [pos-1];
//			}
//		}
//		
//	}
//	
//	
//	/**
//	 * convierte el número introducido en uno de los diferentes enumerados
//	 * @param opcion número elegido del menú
//	 * @return enumerado elegido
//	 */
//	public static String convertirOpcion (int opcion)
//	{
//		String opcionL = null;
//			switch(opcion)
//			{
//			case 1:
//				opcionL = "UNO";
//				break;
//			case 2:
//				opcionL = "DOS";
//				break;
//			case 3:
//				opcionL = "TRES";
//				break;
//			case 4:
//				opcionL = "CUATRO";
//				break;
//			case 5:
//				opcionL = "CINCO";
//				break;		
//			}
//			
//		return opcionL;
//	}
//	
//	public static void insertarPersona(Persona [] listado)
//	{
//		
//		Scanner scan = null;
//		scan = new Scanner(System.in);
//		String nombre = null;
//		int edad = 0;
//		int cont = 0;
//		
//			for(int i = 0; i < listado.length; i++)
//			{
//				
//				if((listado[i].getEdad() == 0) && (listado[i].getNombre() == null))
//				{
//				System.out.println("INTRODUZCA EL NOMBRE DE LA PERSONA: " + (i+1));
//				nombre = scan.next();
//				
//				System.out.println("INTRODUZCA LA EDAD DE LA PERSONA: " + (i+1));
//				edad = scan.nextInt();
//				
//				listado[i].setEdad(edad);
//				listado[i].setNombre(nombre);
//				}
//				else 
//				{
//					cont++;
//				}
//			
//				if(cont == (listado.length - 1))
//				{
//					System.out.println("La base de datos está completa, por favor borre una persona para continuar");
//				}
//			}
//			
//	}
	
}
