package edu.cam.femxa.ejemplocomandoargs;

public class Principal {
	
	public static void main(String[] args) {
		
		int num_args = 0;
		int num_char = 0;
		int may_char = 0;
		String may_arg = null;
		
		for(int i = 0; i < args.length; i++)
		{
			num_char = args[i].length();
			
			if(num_char > may_char)
				{
					may_char = num_char;
					may_arg = args[i];
				}
			
			num_args = i + 1;
		}
		
		System.out.println("Has introducido " + num_args + " argumento(s)");
		System.out.println("El argumento de mayor longitud es: " + may_arg);
		
		
	}

}
