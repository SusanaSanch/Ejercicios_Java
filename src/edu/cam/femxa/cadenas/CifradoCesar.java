package edu.cam.femxa.cadenas;

public class CifradoCesar {
	
	public void mostrarCodChars (String cadena)
	{
		int longi = cadena.length();
		int numero_carac = 0;
		char caracter = 0;
		
			for (int pos = 0; pos < longi; pos++)
			{
				caracter = cadena.charAt(pos);
				numero_carac = (int) caracter;
				System.out.println(caracter  + " = " + numero_carac);
			}
			
	}
	
	
	
	public String cifraCesar (String cadena, int clave)
	{
		String cod_cifrado = null;
		int longi = cadena.length();
		char caracter_original = 0;
		char caract_cifrado = 0;
		int num_original = 0;
		int num_cifrado = 0;
				
			cod_cifrado = new String ();
			
			for (int pos = 0; pos < longi; pos++)
			{		
					
					caracter_original = cadena.charAt(pos);
					
					if (caracter_original != ' ')
					{
						num_original = (int) caracter_original;
						num_cifrado = num_original + clave; 
						caract_cifrado = (char) num_cifrado;
						cod_cifrado = cod_cifrado + caract_cifrado;
					}
					else
					{						
						cod_cifrado = cod_cifrado + caracter_original;
					}
			}
		
		
		return cod_cifrado;
		
	}
	
	

	public static void main(String[] args) {
		
		CifradoCesar cesar = null;
		cesar = new CifradoCesar ();
		String cod_cifrado = null;
		
		//cesar.mostrarCodChars ("LOLIPOP");
		//int j = 81;
		//char c = (char)j;
		//System.out.println(c);
		cod_cifrado = cesar.cifraCesar("HOLA hola", 1);
		System.out.println(cod_cifrado);

	}

}
