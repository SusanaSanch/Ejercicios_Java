package edu.cam.femxa.argumentos;

public class Argumentos {


	
	public static void main(String[] args) {
		
		int pos_final = 0;
		String palabra_analizar = null;
		
			
		pos_final = args.length;
			
			for(int pos_args = 0; pos_args < pos_final; pos_args++)
			{
				palabra_analizar = args[pos_args];
				if(palabraTienei(palabra_analizar))
				{
					System.out.println(palabra_analizar);
				}
			}
		
	}
	
	
	
	
	public static boolean palabraTienei (String palabra_analizar)
	{
		int longi_palabra = 0;
		int pos_palabra = 0;
		boolean tiene_i = false;
		char car_aux = 0;	
			
			longi_palabra = palabra_analizar.length();
				
			while ((pos_palabra < longi_palabra) && (!tiene_i))
					
				{
					car_aux = palabra_analizar.charAt(pos_palabra);
					if((car_aux == 'i') || (car_aux == 'I'))
					{
						tiene_i = true;
					}
							
					pos_palabra++;
			}
		return tiene_i;
	}
}
