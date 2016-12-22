package edu.cam.femxa.cadenas;

public class Cesar {
	
	public static void main(String[] args) {
		Cesar cesar = null;
			cesar = new Cesar();
			String resultado = cesar.cifradoCesar("PAPI CHULO", 1);
			System.out.println(resultado);
	}
	
	
	
	public char traduceCharCesar (char c, int k)
	{
		char caract_cifr = 0;
		int numero_caracter = 0;
		
			numero_caracter = (int) c;
			numero_caracter = numero_caracter + k;
			caract_cifr = (char)numero_caracter;
						
		return caract_cifr;
	}
	
	
	
	public String cifradoCesar (String palabra, int clave)
	{
		String palabra_cifrada = null;
		int longi = palabra.length();
		char caracter_actual = 0;
		char caracter_cifrado = 0;
		
			palabra_cifrada = new String();
			
			for (int pos = 0; pos < longi; pos++)
			{
				caracter_actual = palabra.charAt(pos);
				
				if (caracter_actual != ' ')
				{
					caracter_cifrado = traduceCharCesar (caracter_actual, clave);
					palabra_cifrada = palabra_cifrada + caracter_cifrado;
				} 
					else
						{ 
							palabra_cifrada = palabra_cifrada + caracter_actual;}
						}
		
		return palabra_cifrada;
	}

}
