package edu.cam.femxa.argumentos;

import java.util.Scanner;

public class Ordenacion {

	public static void desplazarDesdeHasta (int a_ent [] , int pos_inicial, int pos_final)
	{
				
		for (int pos = pos_final+1; pos > pos_inicial; pos--) 
		{
			if (pos < a_ent.length)
			{
				a_ent [pos] = a_ent [pos-1];
			}
		}
		
	}
	
	public static void mostrarArray (int ae [])
	{
		for (int i = 0; i < ae.length; i++) {
			System.out.print(ae[i] + " ");
		}
		System.out.println();
	}
	
	public static int obtenerPosicion (int [] a_ent, int n_usuario, int limite)
	{
		int pos = 0;
				
			while ((pos < limite)&&(a_ent[pos] < n_usuario))
			{
				pos++;
			}
		
		return pos;
	}
	
	public static int pedirNumero()
	{
		int n_pedido = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in);
			n_pedido = scanner.nextInt();
			
		return n_pedido;
	}
	
	public static void main(String[] args) {

		int a_ent[] = new int [10];
		int n_usuario = 0; 
		int pos = 0;
		int longi = 0;
			longi = a_ent.length;
		
		for (int indice = 0; indice < longi; indice++) 
		{
			System.out.println("Dame nº " + indice);
			n_usuario = pedirNumero();
			pos = obtenerPosicion(a_ent, n_usuario, indice);
			
			desplazarDesdeHasta(a_ent, pos, indice);
			a_ent[pos] = n_usuario;
		}
		mostrarArray(a_ent);
	}
	
}
