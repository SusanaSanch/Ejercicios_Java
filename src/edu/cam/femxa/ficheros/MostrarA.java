package edu.cam.femxa.ficheros;

import java.io.File;

public class MostrarA {
	
	/**
	 * comprueba si la cadena contiene tiene el caracter 'A' o 'a'
	 * @param aux String dentro del array f_aux
	 * @param f_aux array del fichero a comprobar
	 * @return si tiene caracter a
	 */
	public static boolean comprobarCaracterA (String aux, File f_aux)
	{
		boolean hay_a = false;
		int j = 0;
			while ((j < aux.length()) && (!hay_a) && (f_aux.isFile()))
			{
					if(aux.charAt(j) == 'a' || aux.charAt(j) == 'A')
					{
						hay_a = true;
					}
					j++;
			}
		return hay_a;
	}
	
	
	/**
	 * dada una ruta, mostrar todos los archivos que contienen la vocal 'a'
	 * @param args
	 */

	public static void main(String[] args)
	{
		
		String carpeta_fichero = null;
		String [] lista_directorio = null;
		
		carpeta_fichero = "fichero";
		File file = null;
		file =	new File(carpeta_fichero);
	
		
		lista_directorio = file.list ();
		String aux = null;
		File f_aux = null;
		
		boolean hay_a;
		
		/*if(file.isDirectory())
		{
			System.out.println(file + " es directorio");
		}
		*/
		for (int i = 0; i < lista_directorio.length; i++)
		{
			aux = lista_directorio[i];
			f_aux = new File (carpeta_fichero + "\\" + aux);
			hay_a =comprobarCaracterA(aux, f_aux);
			
			if(hay_a)
			{
				System.out.println("'" + aux + "'" + " es un fichero que contiene 'a'");
			}
			
		/*	if (f_aux.isFile())
			{
				System.out.println(f_aux + " es fichero");
			}
			else 
			{
				System.out.println(f_aux + " no es fichero");
			}
		*/
			
		}
		
	}

}
