package edu.cam.femxa;

public class PalabrasYLetras2 {

	
	public static void main(String[] args) 
	{
	
		String palabra = null;
		
		palabra = "hambre";
		
		
		int longitud_palabra = 0;
		int contador_letras = 0;
		boolean encontrada_s = false;
		
			longitud_palabra = palabra.length();
			
			while  ((contador_letras < longitud_palabra) && !encontrada_s)
			{
			
				System.out.println(palabra.charAt (contador_letras));
				if (palabra.charAt(contador_letras) == 's')
				{
				System.out.println("S encontrada");
				}
				contador_letras ++;
			}
					
				
	}
}


