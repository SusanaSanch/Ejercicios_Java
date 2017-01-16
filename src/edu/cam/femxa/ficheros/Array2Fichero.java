package edu.cam.femxa.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Array2Fichero {
	
	/*Leer un fichero 
	 * enviar a un array
	 * leer el array
	 * enviar el array a un nuevo fichero que hay que crear
	 */
	
	
	
	public static String [] fromFichero2Array (File file) throws IOException
	{
		String [] lista_cadena = null;
		//Utilizar bufferedReader
		
		BufferedReader br = new BufferedReader (new FileReader(file));
		
		return lista_cadena;
	}
	
	
	
	
	
	public static boolean fromArray2fichero(String [] lista_cadena)
	{
		boolean ok = false;
		
		
		return ok;
	}

}
