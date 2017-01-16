package edu.cam.femxa.exceptions;

public class CheckedVsUnchecked {
	
	public static void main(String[] args) {
		
		String cadena = null;//"Hola". Error porque "cadena" no tiene espacio de memoria, hay que inicializarla.
		try
		{
			int tamanio = cadena.length(); 
			System.out.println(tamanio);
		}catch (Exception e)
			{
				System.out.println("Excepción producida");
			}
		
	
	
	}
	

}
