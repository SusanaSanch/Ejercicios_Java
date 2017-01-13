package Factoriales;

import java.util.Scanner;

public class NumerosFactoriales {
	
	/**
	 * solicita número al usuario
	 * @return devuelve el número dado por el usuario
	 */
	
	public static int solicitarNumero()
	{
		int num = 0;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introduzca un número");
		
		num = scan.nextInt();
		scan.close();
		return num;
	}

	
	/**
	 * calcula el factorial para un número dado
	 * @param numero numero del que calcular el factorial
	 * @return factorial del número dado
	 */
	
	public static int calcularFactorial(int numero)
	{
		int factorial = 1;
	
			if(numero > 1)
			{
				factorial = numero * calcularFactorial(numero-1);
			}
						
		return factorial;
	}
	
	
	/**
	 * muestra el factorial de un número dado
	 * @param factorial factorial del número dado
	 * @param num número dado
	 */
	
	public static void mostrarFactorial(int factorial, int num)
	{
		System.out.println("el factorial de " + num + " es: " + factorial);
	}
	
	
	/**
	 * Solicita un número, calcula su factorial y lo muestra
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		int numero_usuario = 0;
		int factorial = 0;
		
		numero_usuario = solicitarNumero();//solicitar número para ver su factorial
		factorial = calcularFactorial(numero_usuario);//calcular factorial
		mostrarFactorial(factorial, numero_usuario);//mostrar factorial
	}

}
