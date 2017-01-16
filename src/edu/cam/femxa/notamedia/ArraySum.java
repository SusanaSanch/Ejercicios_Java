package edu.cam.femxa.notamedia;

public class ArraySum {
	
	private static int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
	
	/**
	 * calcula la media de las notas introducidas
	 * @param array de notas
	 * @return media aritméticas de las notas introducidas en el array
	 */
	public static float calculaMedia (int[] notas)
	{
		float media = 0;
		float suma_notas = 0;
		float aux = 0;
		
		for(int i = 0; i < notas.length; i++)
		{
			aux = (float) notas[i];
			suma_notas = suma_notas + aux;
		}
		
		media = (suma_notas / (notas.length));  
		
		return media;
	}
	
	
	/**
	 * muestra la media
	 * @param media nota media
	 */
	public static void mostrarMedia(float media)
	{
		System.out.println("La media es: " + media);
	}
	
	
	/**
	 * Método que devuelve la nota media del array_notas
	 * @param args
	 */
	public static void main(String[] args) 
	{
		float media = 0;
		media = calculaMedia(array_notas);//calcular media
		mostrarMedia(media);//mostrar media
	}

}

