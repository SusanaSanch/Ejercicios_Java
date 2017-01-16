package edu.cam.femxa.codifica;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

//		FileReader fichero = new FileReader (new File ("pepe"));
//		int aux = 0;
//		String cadena = "";
//		
//		aux = fichero.read();
//		while(aux != -1)
//		{
//			char c = (char) aux; //casting en el que convierto el int en un caracter
//			cadena = cadena + c;
//			aux = fichero.read();
//		}
//		
//		System.out.println(cadena);
//		
//		
//		String cadena_codificada = null;
//		String cadena_decodificada = null;
//		
//		cadena_codificada = Codificar.codifica(cadena);	//codificar cadena
//		System.out.println(cadena_codificada);//mostrar cadena codificada
//		
//		FileWriter escribir = new FileWriter("pepe");
//		escribir.write(cadena_codificada);
//		
//		
//		cadena_decodificada = Codificar.decodifica(cadena_codificada);//decodificar cadena
//		System.out.println(cadena_decodificada);//mostrar cadena decodificada
//		escribir.write(cadena_decodificada);
//		escribir.close();
//		fichero.close();
		
		String cadena = null;
		String cadena_codificada;
		String cadena_decodificada;
		
		cadena = "Pepe y Pepa";
		cadena_codificada = Codificar.codifica(cadena);
		System.out.println(cadena_codificada);
		cadena_decodificada = Codificar.decodifica(cadena_codificada);
		System.out.println(cadena_decodificada);
		
	}

}
