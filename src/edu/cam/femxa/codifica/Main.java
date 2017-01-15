package edu.cam.femxa.codifica;

public class Main {
	
	public static void main(String[] args) {
		String cadena = "Hola mundo";//introducir cadena
		Codificar codificar = new Codificar(cadena);
		String cadena_codificada = null;
		String cadena_decodificada = null;
		
		cadena_codificada = codificar.codifica(cadena);	//codificar cadena
		System.out.println(cadena_codificada);//mostrar cadena codificada
		cadena_decodificada = codificar.decodifica(cadena_codificada);//decodificar cadena
		System.out.println(cadena_decodificada);//mostrar cadena decodificada
	}

}
