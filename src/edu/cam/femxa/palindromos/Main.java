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
	
	
	public static String quitarEspacios (String frase)
	{
		String frase_sin_espacios = "";
		char aux = 0;
		for (int i  = 0; i < frase.length(); i++)
				
			{
				if (frase.charAt(i) != ' ')
				{
				aux = frase.charAt(i);
				frase_sin_espacios = frase_sin_espacios + aux;
				}
			}
			System.out.println("frase sin espacios: " + frase_sin_espacios);
		return frase_sin_espacios;
	}
	
	
	public static String darLaVuelta(String frase_sin_espacios)
	{
		String frase_reves = "";
		char aux = 0;
		
			
		for (int i = frase_sin_espacios.length() - 1; i >= 0; i--)	
			{
				aux = frase_sin_espacios.charAt(i);
				frase_reves = frase_reves + aux;
			}
			System.out.println(frase_reves);
				
		return frase_reves;	
	}
	
	
	public static boolean verificarFrase(String frase, String frase_reves)
	{
		boolean palindromo = false;
		int cont = 0;
			
		do
		{
			if(frase.charAt(cont) == frase_reves.charAt(cont))
			{
				palindromo = true;
			}
				else
				{
					palindromo = false;
				}
			
			cont++;
		}
		while (cont < frase.length() && palindromo);
		return palindromo;
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
		while (ini <= fin && palindromo);
		
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
		String cadena_sin_espacios = null;
		boolean palindromo = false;
		
		cadena = solicitarFrase();
		palindromo = verificarPalindromo(cadena);
//		cadena_sin_espacios = quitarEspacios(cadena);
//		cadena_reves = darLaVuelta(cadena_sin_espacios);
//		palindromo = verificarFrase(cadena_sin_espacios, cadena_reves);
		mostrarResultado(palindromo);

	}

}
