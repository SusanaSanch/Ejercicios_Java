package edu.cam.femxa.adivinanza2;

import java.util.concurrent.ThreadLocalRandom;

public class main {

	
	public static final int INTENTOS = 10;
	
	
	public static void main(String[] args) {
		
		int numero = 0;
		int contador = 0;
		boolean acierto = false;
		char respuesta = 0;
		int num_rango_may = 0;
		int num_rango_men = 0;
		
		EntradasSalidas.instruccionesJuego();
		numero = generarNumero();
		num_rango_may = 100; 
		num_rango_men = 1;
		
		do 
		{
			
			EntradasSalidas.mostrarNumero(numero);
			respuesta = EntradasSalidas.recibirRespuesta();
						
			if (respuesta == '>')
			{
				num_rango_may = numero;
				numero = generarMenor(num_rango_may, num_rango_men);
			}
				else if (respuesta == '<')
				{
					num_rango_men = numero;
					numero = generarMayor(num_rango_may, num_rango_men);		
				}
					else if (respuesta == '=')
					{
						acierto = true;
						EntradasSalidas.mostrarDerrota();
					}
			contador++;
			
		}
			while((contador < INTENTOS) && (!acierto));
			
		if(!acierto)
			{
			EntradasSalidas.mostrarVictoria();
			}

	}
	
	
	
	public static int generarNumero ()
	{
		int numero_generado = 0;
			numero_generado = (int) ((100 * Math.random()) + 1);
		return numero_generado;
	}

	
	

	public static int generarMenor(int max, int min)
	{
	
		int num_menor = 0;
					num_menor = (int) ((ThreadLocalRandom.current().nextInt(min, max)));
		return num_menor;
	}
	
	
	
	public static int generarMayor(int max, int min)
	{
		int num_mayor = 0;
			num_mayor = (int) ((ThreadLocalRandom.current().nextInt(min, max)));
		return num_mayor;
	}
}

