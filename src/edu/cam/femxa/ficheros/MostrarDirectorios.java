package edu.cam.femxa.ficheros;

import java.io.File;

public class MostrarDirectorios {
	
	/**
	 * Mostrar todo el directorio y subdirectorio
	 * @param args
	 */

	public static void main(String[] args) {
		
		File file = null;
		String[] listado = null;
		String carpeta = null;
		
		File aux = null;
		String auxiliar = null;
		
		
		carpeta = "fichero";
		file = new File(carpeta);
		
		
		
		listado = file.list();
		
		for (int i = 0; i < listado.length; i++) 
		{
			System.out.println(listado[i]);
			auxiliar = listado[i];
			aux = new File(auxiliar);
			System.out.println(aux.getName());
				if(aux.isFile())
				{
					System.out.println(auxiliar + " es fichero");
					
				}
				else if (aux.isDirectory())
					{
						System.out.println(listado[i] + " es directorio");
					}
		}
		
		
		

	}

}
