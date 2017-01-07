package edu.cam.femxa.menuNavidad;

import java.util.Scanner;

public class pruebas 
{
	public static void insertarPersona(Personas listado[])
	{
		
		Scanner scan = null;
		scan = new Scanner(System.in);
		String nombre = null;
		int edad = 0;
		int cont = 0;
		int pos = 0;
		//obtener posición
		
			for(int i = 0; i < listado.length; i++)
			{
				pos = obtenerPosicion(listado, edad, i);
				
				System.out.println("INTRODUZCA EL NOMBRE DE LA PERSONA: " + (i+1));
				nombre = scan.next();
				
				System.out.println("INTRODUZCA LA EDAD DE LA PERSONA: " + (i+1));
				edad = scan.nextInt();
				
				desplazarDesdeHasta(listado, pos, i);
				listado[pos].setEdad(edad);
				listado[pos].setNombre(nombre);
				
			
				/*
				 * else 
				{
					cont++;
				}
			
				if(cont == (listado.length - 1))
				{
					System.out.println("La base de datos está completa, por favor borre una persona para continuar");
				}
				*/
			}
			
	}
	
	public static int obtenerPosicion (Personas listado[], int edad, int limite)
	{
		int pos = 0;
				
			while ((pos < limite)&&(listado[pos].getEdad() < edad))
			{
				pos++;
			}
		
		return pos;
	}
	
	public static void desplazarDesdeHasta (Personas listado [] , int pos_inicial, int pos_final)
	{
				
		for (int pos = pos_final + 1; pos > pos_inicial; pos--) 
		{
			if (pos < listado.length)
			{
				listado [pos] = listado [pos-1];
			}
		}
		
	}
	
}
