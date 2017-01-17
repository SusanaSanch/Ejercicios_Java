package edu.cam.femxa.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		BufferedReader br = new BufferedReader (new FileReader(file));
		System.out.println(br);
		
		String aux = "";
		int tamanio_array = 0;
		
		while (br.readLine() != null)
			{
			tamanio_array++;
			}
		br.close();
		
		
		BufferedReader br2 = new BufferedReader (new FileReader(file));
		lista_cadena = new String [tamanio_array-1];
		int pos = 0;
		aux = "";
		
		aux = br2.readLine();
		
		while (aux != null)
			{
			lista_cadena[pos] = aux;
			aux = br2.readLine();
			pos ++;
			}
		
		br2.close();
		return lista_cadena;
	}
	
	
	
	
	/**
	 * Pasa la información 
	 * @param lista_cadena
	 * @return
	 * @throws IOException
	 */
	public static boolean fromArray2fichero(String [] lista_cadena) throws IOException
	{
		boolean ok = false;
		File nuevo_fichero = null;
		String nombre_fichero = null;
		boolean fichero_creado = false;
		
		nombre_fichero = "PepitoYPepita";//CrearYBorrar.solicitarNombreFichero();
		
		String ruta = "fichero\\" + nombre_fichero;
		nuevo_fichero = new File (ruta);
		fichero_creado = nuevo_fichero.createNewFile();
		
		if (fichero_creado)
			{
			System.out.println("se ha creado el fichero: " + nombre_fichero);
			}
			else
			{
				System.out.println("no se ha podido crear el fichero");
			}
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(nuevo_fichero));
		String aux = "";
		
		for(int i = 0; i < lista_cadena.length-1; i++)
		{
			aux = lista_cadena[i];
			try
				{
				bw.write(aux);
				ok = true;
				}
				catch (IOException e) 
					{
					e.printStackTrace();
					}
			bw.newLine();
		}
		
		bw.close();
		
		return ok;
	}
	
	
/**
 *lee un fichero, lo guarda en un array. Crea un nuevo fichero y escribe el array guardado. 
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("pepe");
		String [] cadena = null;
		boolean escribir_nuevo_fichero = false;
		
		cadena = fromFichero2Array(file); //info del fichero al array
		
		System.out.println("Imprimiendo array:\n");
		
		for (String cad : cadena)//for each. Para cada String de cadena.
		{	
			System.out.println(cad); //muestra array
		}
		
		escribir_nuevo_fichero = fromArray2fichero(cadena);//info del array a un nuevo fichero
		
		if (escribir_nuevo_fichero)
		{
			System.out.println("se ha creado y escrito el nuevo fichero");
		}
		
		
	}
}
