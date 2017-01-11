package edu.cam.femxa.ficheros;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		String carpeta_fichero = null;
		String [] lista_directorio = null;
		boolean b_existe = false;
		
		carpeta_fichero = "fichero";
		File file = null;
		file =	new File(carpeta_fichero);
		b_existe = file.exists();
		
		if (b_existe)
		{
			System.out.println("Existe");
		}else
			{
			 System.out.println("No existe");	
			}
		
		lista_directorio = file.list ();
		
		for (int i = 0; i < lista_directorio.length; i++)
		{
			System.out.println(lista_directorio[i]);
		}
		

	}

}
