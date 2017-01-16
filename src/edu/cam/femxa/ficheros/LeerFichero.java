package edu.cam.femxa.ficheros;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeerFichero {
	
	
	/**
	 * imprimir el texto y el número que suman todas las letras
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		
//		File fichero = new File ("pepe");
//		FileReader file = new FileReader (fichero);
		FileReader file = new FileReader (new File ("pepe"));
		int aux = 0;
		int total_caract = 0;
		
		aux = file.read();
		
		while(aux != -1)
			{
				char c = (char) aux; //casting en el que convierto el int en un caracter
				System.out.println(c);
				total_caract = total_caract + aux;
				aux = file.read();
			}
		
		System.out.println("La suma es: " + total_caract);
		file.close();
		

	}

}
