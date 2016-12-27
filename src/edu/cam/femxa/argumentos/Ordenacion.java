package edu.cam.femxa.argumentos;

import java.util.Scanner;

import edu.cam.femxa.adivinanza.Main;

public class Ordenacion {

	public static void main(String[] args) {
		
		int a_ent_a [] = new int [3];
		int longi = a_ent_a.length;
		boolean menor = false;
			a_ent_a [0] = solicitarNumero();		
				
		for (int pos = 0; pos < longi; pos++)
		{
			int num_comparar = 0; 
			int numero_solicitado = 0;
			int pos_array = 0;
					numero_solicitado = solicitarNumero();
			 		num_comparar = a_ent_a[0];
				
			 
			do
			{
				menor = compararNumero(numero_solicitado, num_comparar );
				if (menor)
				{
					a_ent_a[pos_array] = numero_solicitado;
				}
				pos_array++;
			}
			while ((pos_array < longi) && menor);
			
				
				
				
			}
			
			/*
			do 
			{
				pos_mayor++;
			}
			while (a_ent_a[pos] > a_ent_a[pos_mayor]);
			*/
			
		
		
		for (int i = 0; i< a_ent_a.length; i++)
		{
			System.out.println("Numero en pos " + i + " = " + a_ent_a[i]);
		}
		
		
		
	}
	
	
	public static int solicitarNumero()
	{
		int numero = 0;
		Scanner scan = null;
		
				System.out.println("Introduzca un número entero entre el 1 y el 100");
		scan = new Scanner (System.in);
		numero = scan.nextInt();
		return numero;
	}
	
	
	
	public static boolean compararNumero(int num_solicitado, int num_comp)
	{
		boolean menor = false;
		
			if (num_solicitado < num_comp)
			{
				menor = true;
			}
			
		return menor;
	}

	
	/*
	for (int i = 0; i< a_ent_a.length; i++)
	{
		a_ent_a [i] = Main.generarNumero();
	}
	*/
	
}
