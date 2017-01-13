package edu.cam.femxa.dalenombre;

public class Palindromo //nombre original DaleNombre
{ 
		
		private static boolean esPalindromo (String cad)
		{
			boolean bd = true;
			
			int i = 0;
			int j = cad.length()-1;
			
			while ((i<=j)&&(bd))
			{
				bd = cad.charAt(i)==cad.charAt(j);
				i++;
				j--;
			}
			
			
			return bd;
		}
		
		
		/**método alternativo
		 * Verifica si la cadena es palíndromo
		 * @param cadena cadena a comprobar
		 * @return verdadero si es palíndromo, falso si no lo es
		 */
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
		
	
		public static boolean esPalindromoRecursivo(String cadena)
		{
			boolean palindromo = false;
			int j = 0;
			int i = 0;
			
			j = cadena.length()-1;
			
			if (cadena.charAt(i) == cadena.charAt(j))
			{
				palindromo = true;
			}
			
			boolean mayor = false;
			mayor = (i <= j);
			if (mayor && palindromo)
			{
				cadena = cadena.substring(i+1,j);
				esPalindromoRecursivo(cadena);
			}
			return palindromo;
		}
		
		
		
		public static void main(String[] args) {
			if (esPalindromoRecursivo("poop"))//nombre original adivinaQueHace
			{
				System.out.println("VERDADERO");
			} else 
			{
				System.out.println("FALSO");
			}
		}

}
