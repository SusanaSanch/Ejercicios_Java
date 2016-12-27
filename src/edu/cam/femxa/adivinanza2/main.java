package edu.cam.femxa.adivinanza2;

public class main {

	
	public static final int INTENTOS = 5;
	
	
	public static void main(String[] args) {
		
		int numero = 0;
		int contador = 0;
		boolean acierto = false;
		char respuesta = 0;
		
		EntradasSalidas.instruccionesJuego();
		numero = generarNumero();
		
		do 
		{
			
			EntradasSalidas.mostrarNumero(numero);
			respuesta = EntradasSalidas.recibirRespuesta();
						
			if (respuesta == '>')
			{
				numero = generarMenor(numero);
			}
				else if (respuesta == '<')
				{
					numero = generarMayor(numero);
				}
					else if (respuesta == '=')
					{
						acierto = true;
						EntradasSalidas.mostrarDerrota();
					}
			contador++;
			
		}
			while((contador < INTENTOS) && (!acierto));
			EntradasSalidas.mostrarVictoria();

	}
	
	
	
	public static int generarNumero ()
	{
		int numero_generado = 0;
			numero_generado = (int) ((100 * Math.random()) + 1);
		return numero_generado;
	}

	
	

	public static int generarMenor(int numero)
	{
		int num_menor = 0;
			num_menor = (int) (((numero - 1) * Math.random()) + 1);
		return num_menor;
	}
	
	
	
	public static int generarMayor(int numero)
	{
		int num_mayor = 0;
			do
			{
			num_mayor = (int) ((100 * Math.random()) + 1);
			}while (num_mayor > numero);
		return num_mayor;
	}
}

