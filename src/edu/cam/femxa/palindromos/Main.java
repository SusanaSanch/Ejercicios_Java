package edu.cam.femxa.palindromos;

import java.util.Scanner;

public class Main 
{

	public static String solicitarFrase()
	{
		String frase = null;
		Scanner scan = null;
			
			scan = new Scanner(System.in);
			System.out.println("Introduce cadena:");
			frase = scan.nextLine();
		
		return frase;
	}
	

	
	public static boolean verificarPalindromo(String cadena)
	{
		boolean palindromo = false;
		int ini = 0;
		int fin = 0;
		
		fin = cadena.length() - 1;
		
		do
		{
			if(cadena.charAt(ini) == cadena.charAt(fin))
			{
				palindromo = true;
			}
				else
				{
					palindromo = false;
				}
			
			ini++;
			fin--;
		}
		while (ini != fin && palindromo);
		
		return palindromo;
	}
	
	
	public static void mostrarResultado(boolean palindromo)
	{
		if(palindromo)
		{
			System.out.println("Es un palíndromo");
		}
			else
			{
				System.out.println("No es un palíndromo");
			}
	}
	
	public static void main(String[] args) 
	{
		String cadena = null;
		String cadena_reves = null;
		boolean palindromo = false;
		
		cadena = solicitarFrase();
		palindromo = verificarPalindromo(cadena);
		//cadena_reves = darLaVuelta(cadena);
		//palindromo = verificarFrase(cadena, cadena_reves);
		mostrarResultado(palindromo);

	}

}
