package edu.cam.femxa.ficheros;

import java.io.File;

public class Ocultos {
	
	/**
	 * dada una ruta, mostrar sólo los subdirectorios ocultos
	 * @param args
	 */

	public static void main(String[] args)
	{
		
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
		String aux = null;
		
		for (int i = 0; i < lista_directorio.length; i++)
		{
			aux = lista_directorio[i];
			if(aux.charAt(0) == '.')
					{
						System.out.println(lista_directorio[i]);
					}
		}
		
	}

}
