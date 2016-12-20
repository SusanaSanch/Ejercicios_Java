package edu.cam.femxa;

public class PalabraCadena {

	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR

	/**
	 * Dada una cadena, muestra cada una de las letras con un bucle for
	 * @param palabra Cadena a mostrar
	 */
	
	public static void mostrarLetrasFor (String palabra)
	{
		
		int longi = palabra.length();
		char letra = 0;
		
		for (int index = 0; index < longi; index ++)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
		}
	}
	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N PRIMEROS NÚMEROS DE LA CADENA
	
	/**
	 * Dada una cadena y un número N, muestra los N primeros números de la cadena
	 * @param palabra Cadena a mostrar
	 * @param n Número de caracteres a mostrar de la cadena
	 */
	
	public static void mostrarLetrasHastaN (String palabra, int n)
	{
		char letra = 0;
		int longi = palabra.length();
		
		if (n < longi)
		{
			for (int index = 0; index < n; index ++) 
			{
				letra = palabra.charAt(index);
				System.out.println("Letra " + index + " = "+ letra);
				
			}
		}
			else
			{
				System.out.println("El número de letras de la cadena es inferior al número dado");
			}
		
	}
	
	
	//HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N ÚLTIMOS NÚMEROS DE LA CADENA
	
	/**
	 * Dada una cadena y un número n, muestra los n últimos números de la cadena
	 * @param palabra cadena dada
	 * @param n número de últimas letras que tienen que mostrase
	 */
		
	public static void mostrarUltimasNLetras (String palabra, int n)
	{
		
		int longi = palabra.length();
		char letra = 0;
		int index = longi - n;
			
			if (n <= longi)
				{
				while (index < longi)
				//for (int i = longi - 1; i <longi; i++)
					{
						letra = palabra.charAt(index);
						System.out.println("La letra nº " + index + " es " + letra);
						index++;
					}
				}
				else 
				{
					System.out.println("El número n es mayor que la longitud de la palabra");
				}
	}
		
	public static void mostrarUltimasNLetrasAlt (String palabra, int n)
	{
		
		int longi = palabra.length();
		char letra = 0;
		int index = longi - 1;
		
			
			if (n <= longi)
				{
				while (index >= longi - n )
				//for (int i = longi - 1; i <longi; i++)
					{
						letra = palabra.charAt(index);
						System.out.println("La letra nº " + index + " es " + letra);
						index--;
					}
				}
				else 
				{
					System.out.println("El número n es mayor que la longitud de la palabra");
				}
	}
	
	

	//HACED UN MÉTODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL NÚMERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
	 
	/**
	 * Método que dada una cadena y una letra, devuelve el número de veces que aparece la letra en la cadena
	 * @param palabra 
	 * @param letra
	 */
	
	public static int vecesApareceLetraEnPalabra (String palabra, char letra)
	{
		int longi = palabra.length ();
		int contador_letra = 0;
		
		for (int i = 0; i < longi; i++)
		{
			if (letra == palabra.charAt(i))
			{
				contador_letra++;	
			}
		}
		
		System.out.println("La letra " + letra + " aparece " + contador_letra + " veces el la palabra " + palabra);
		return contador_letra;
	}
	
	
	/**
	 * Muestra las letras de la palabra hasta encontrar la letra dada.
	 * @param Palabra palabra a mostrar.
	 * @param letra_encontrada Letra a encontrar en la palabra.
	 */
	
	public static void mostrarLetrasPalabraHastaEncontrarLetra (String palabra, char letra_encontrada)
	{
		boolean b_letra_encontrada = false;
		int index = 0;
		int longi = palabra.length();
		char letra_mostrada = 0;
		
		
		while ((index < longi) && (!b_letra_encontrada))
		{
			letra_mostrada = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra_mostrada);
			index = index + 1;
			if (letra_encontrada == letra_mostrada)
			{
				b_letra_encontrada = true;
			}
		}
		
		
	}
	
	
	public static void mostrarLetrasPalabra (String palabra)
	{
		int index = 0;
		int longi = palabra.length();
		char letra = 0; //la letra es un número en el fondo, recuerda
		
		while (index < longi)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
			index = index + 1;
		}
		
	}
	

	public static void palabra_inversa (String palabra)
	{
		int longi = 0;
		longi = palabra.length();
		
		for (int i = longi - 1; i >= 0; i = i - 1)
		{
			System.out.println(palabra.charAt(i));	
		}
	}
	

	public static void main(String[] args)
	{
			int veces_aparece_letra = 0;
					
			//mostrarLetrasPalabra("VALENTINO");
			//mostrarLetrasPalabraHastaEncontrarLetra("VALENTINO", 'L');
			//mostrarLetrasFor ("RESILIENCIA");
			//mostrarLetrasHastaN("RESILIENCIA", 5);
			//mostrarUltimasNLetras("RESILIENCIA", 3);
			mostrarUltimasNLetrasAlt("RESILIENCIA", 6);
			//veces_aparece_letra = vecesApareceLetraEnPalabra("RESILIENCIA", 'K');
			//palabra_inversa ("RESILIENCIA");
			
			
	}





}





