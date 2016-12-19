package edu.cam.femxa;

public class PruebaString {

	public static void main(String[] args) 
	{
		
		String palabra = null;
		
		palabra = "HOLA";
		
		System.out.println(palabra);
				
		char letrita = palabra.charAt (2);
		
		if (letrita == 'A')
		{
			System.out.println("La letra es A");
		}
		else
		{
			System.out.println("La letra NO es A");
		}
		
		int longitud = palabra.length();
		
		System.out.println(longitud);
		System.out.println("La letra es " + letrita);
		
	}

}
