package edu.cam.femxa.sinespacios;

public class main {

	public static void main(String[] args) 
	{
		String frase = null;
		String frase_sin_espacios = null;
		
		frase = "ESTO ES UNA FRASE";
		
		frase_sin_espacios = eliminaEspacios(frase);
		
		System.out.println("Frase original: " + frase);
		System.out.println("Frase sin espacios: " + frase_sin_espacios);
		
	}
	
	
	
	public static String eliminaEspacios(String frase_original)
	{
		String frase_convertida = "";
			
			for (int i = 0; i < frase_original.length(); i++)
			{
				char aux = 0;
				aux = frase_original.charAt(i);
				if(aux != ' ')
				{
					frase_convertida = frase_convertida + aux;
				}
			}
		return frase_convertida;
	}

}
