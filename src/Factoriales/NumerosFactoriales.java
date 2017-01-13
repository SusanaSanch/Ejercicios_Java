package Factoriales;

import java.util.Scanner;

public class NumerosFactoriales {
	
	/**
	 * solicita n�mero al usuario
	 * @return devuelve el n�mero dado por el usuario
	 */
	
	public static int solicitarNumero()
	{
		int num = 0;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introduzca un n�mero");
		
		num = scan.nextInt();
		scan.close();
		return num;
	}

	
	/**
	 * calcula el factorial para un n�mero dado
	 * @param numero numero del que calcular el factorial
	 * @return factorial del n�mero dado
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
	 * muestra el factorial de un n�mero dado
	 * @param factorial factorial del n�mero dado
	 * @param num n�mero dado
	 */
	
	public static void mostrarFactorial(int factorial, int num)
	{
		System.out.println("el factorial de " + num + " es: " + factorial);
	}
	
	
	/**
	 * Solicita un n�mero, calcula su factorial y lo muestra
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		int numero_usuario = 0;
		int factorial = 0;
		
		numero_usuario = solicitarNumero();//solicitar n�mero para ver su factorial
		factorial = calcularFactorial(numero_usuario);//calcular factorial
		mostrarFactorial(factorial, numero_usuario);//mostrar factorial
	}

}
