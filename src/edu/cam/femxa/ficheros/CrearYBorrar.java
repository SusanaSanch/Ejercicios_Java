package edu.cam.femxa.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearYBorrar {
	
	
	public static String solicitarNombreFichero()
	{
		String nombre = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del nuevo fichero:");
		nombre = sc.nextLine();
		sc.close();
		
		return nombre;
	}
	
	public static boolean preguntarBorrarFichero()
	{
		boolean borrar = false;
		String si_no = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Quieres borrar el fichero? (S = si, N = no)");
		si_no = sc.nextLine();
		sc.close();
		
		
		if(si_no.equals("S"))
		{
			borrar = true;
		}
			else if (si_no.equals("N"))
			{
				borrar = false;
			}
				else
				{
					System.out.println("Caracter no permitido, fichero no borrado");
					borrar = false;
				}

		return borrar;
	}

	
	public static void main(String[] args) throws IOException {
		
		File file_new = null;
		boolean borrar_fichero = false;
		String nombre_fichero = null;
		boolean fichero_creado = false;
		boolean fichero_borrado = false;
		
		nombre_fichero = solicitarNombreFichero();
		
		String ruta = "fichero\\" + nombre_fichero;
		file_new = new File (ruta);
		
		fichero_creado = file_new.createNewFile();
		if (fichero_creado)
			{
			System.out.println("se ha creado el fichero: " + nombre_fichero);
			}
			else
			{
				System.out.println("no se ha podido crear el fichero");
			}
		
		borrar_fichero = preguntarBorrarFichero(); 
		if (borrar_fichero)
		{
			fichero_borrado = file_new.delete();
			if (fichero_borrado)
			{
				System.out.println("fichero " + nombre_fichero + " borrado");
			}
		}

	}

}
