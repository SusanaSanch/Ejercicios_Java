package edu.cam.femxa.dni;

import java.util.Scanner;

public class LetraDNI {
	
	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";

	/**
	 * solicita al usuario el número de DNI
	 * @return número DNI
	 */
	public static int solicitarDni()
	{
		int dni = 0;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su DNI sin letra");
			dni = sc.nextInt();
			sc.close();
			
		return dni;
	}
	
	/**
	 * calcula la letra del DNI
	 * @param dni número de DNI
	 * @return letra correspondiente al DNI
	 */
	public static char calcularLetraDni(int dni)
	{
		char letra_dni = 0;
		int num_pos = 0;
			
		num_pos = dni % 23;
		letra_dni = caracteresDNI.charAt(num_pos);
			
		return letra_dni;
	}
	
	/**
	 * muestra el DNI completo y la letra del DNI
	 * @param dni número de DNI
	 * @param letra letra correspondiente al DNI
	 */
	public static void mostrarDniConLetra(int dni, char letra)
	{
		System.out.println("La letra de su DNI es: " + letra);
		System.out.println("Su DNI completo es: " + dni + "-" + letra);
	}
	
	/**
	 * calcula la letra correspondiente a un DNI dado
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int dni = 0;
		char letra_dni = 0;
	
		dni = solicitarDni();//solicitar DNI
		letra_dni = calcularLetraDni(dni);//calcular letra DNI
		mostrarDniConLetra(dni, letra_dni);//mostrar DNI con  letra
		

	}

}
