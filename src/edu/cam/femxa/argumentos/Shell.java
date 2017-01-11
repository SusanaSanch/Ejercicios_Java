package edu.cam.femxa.argumentos;

import edu.cam.femxa.adivinanza.Main;

public class Shell
{

	public static void main(String[] args) 
	{
		int a_ent_a [] = new int[10];
		
		
		//inicializo el array con números aleatorios
		for (int i = 0; i < a_ent_a.length; i++) 
		{
			a_ent_a[i] = Main.generarNumero();
		}
		
		
		System.out.println("Estos son los números creados:");
		for (int i = 0; i < a_ent_a.length; i++)
		{
			System.out.println("Num en pos " + i + " " + a_ent_a[i]);
		}
		
		ordenaShell(a_ent_a);
		
		//muestro
		System.out.println("Estos son los números ordenados");
		for (int i = 0; i < a_ent_a.length; i++)
		{
			System.out.println("Num en pos " + i + " " + a_ent_a[i]);
		}
	}

	
	public static void ordenaShell (int[] a_ent_a)
	{
		int aux = 0;
		
		for(int i = 0; i < a_ent_a.length; i++)
		{
			for(int j = a_ent_a.length - 1; j > 0; j--)
			{
				if (a_ent_a[j] < a_ent_a[j-1])
				{
					aux = a_ent_a[j];
					a_ent_a[j] = a_ent_a[j-1];
					a_ent_a[j - 1] = aux;
				}
			}
		}
	}
}

