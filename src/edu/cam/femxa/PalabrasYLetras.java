package edu.cam.femxa;


public class PalabrasYLetras 
{
	
	/*public static String pedirPalabra()
	{
		String palabra_introducida = null;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
		palabra_introducida = scanner.nextLine();
		
		System.out.println("Escribe una palabra");
		return palabra_introducida;
	}
	*/
	
	/*public static char pedirLetra()
	{
		char letra_introducida = ;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
		letra_introducida = scanner.nextLine();
		
		System.out.println("Escribe una letra");
		return letra_introducida;		
		
	}
	
	*/
	
	
	
	public static boolean verificarPalabra (String palabra, char letra)
	{
		boolean b_letra_contenida = false;
		int longitud_palabra = 0;
		char letra_palabra = 0;
		int contador_letras = 0;
		
			longitud_palabra = palabra.length();
			
		while  ((contador_letras < longitud_palabra) && (!b_letra_contenida))
			{
				letra_palabra = palabra.charAt (contador_letras);
				if (letra_palabra == letra)
				{
					b_letra_contenida = true;
					
				}
				contador_letras ++;
			
			}
			
					
		return b_letra_contenida;
	}
	
	
	public static void main(String[] args) 
	{
	
		String palabra = null;
		char letra = 0;
		
		//palabra = pedirPalabra ();
		//letra = pedirLetra ();
		
		palabra = "hambre";
		letra = 'r';
		
		if (verificarPalabra (palabra, letra) == true)
		{
			System.out.println("La palabra " + palabra + " contiene la letra " + letra);
		}
		else
		{
			System.out.println("La palabra " + palabra + " NO contiene la letra " + letra);
		}
	}
}
