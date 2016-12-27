package edu.cam.femxa.adivinanza;

public class Main {

	
	
	public static final int INTENTOS = 5;
	
	/**
	 *Adivinanza de n�mero. El usuario debe adivinar un n�mero entre 1 y 100 
	 * @param args
	 */
		
	public static void main(String[] args) 
	{
		//generar un n�mero entre 1 y 100
		//solicitar un n�mero al usuario
		//responder al usuario si el n�mero es > < =
		
		int num_adivinar = 0;
		int num_usuario = 0;
		boolean numero_adivinado = false;
		int contador = 0;
		
			
			num_adivinar = generarNumero();
						
			do
			{			
				num_usuario = EntradaSalida.solicitarNumero();
				numero_adivinado = compararNumero(num_adivinar, num_usuario);
					
					if (numero_adivinado)
						{
							EntradaSalida.numAdivinado();
						}
						else if (contador < 4)
							{
								EntradaSalida.pruebaDeNuevo(contador);
							}
							else
								{
									EntradaSalida.perdiste();
									EntradaSalida.numeroCorrecto(num_adivinar);
								}
							
					contador++;
			}
				while ((contador < INTENTOS) && !numero_adivinado);
		

	}
	
	
	/**
	 * genera n�mero aleatorio entre 1 y 100
	 * @return n�mero aleatorio a adivinar
	 */
	
	public static int generarNumero()
	{
		int num_generado = 0;
		
			num_generado = (int) (100 * Math.random() + 1);
		
		return num_generado;
	}

	
	/**
	 * compara los n�meros
	 * @param num_adivinar numero generado aleatorio
	 * @param num_usuario n�mero introducido por el usuario
	 * @return la sentencia si ha adivinado o no ha adivinado
	 */
	public static boolean compararNumero (int num_adivinar, int num_usuario)
	{
		boolean adivinado = false;
			
		if(num_usuario < num_adivinar)
		{
			EntradaSalida.esMenor();
		}	
			else if (num_usuario > num_adivinar)
			{
				EntradaSalida.esMayor();
			}
				else
				{
					adivinado = true;
				}
				
		return adivinado;
	}
	
}
