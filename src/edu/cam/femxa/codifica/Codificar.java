package edu.cam.femxa.codifica;

public class Codificar {

private String cadena;


	
	public Codificar(String cadena) {
	super();
	this.cadena = cadena;
}

	

	/**
	 * Haced el cuerpo de los métodos
	 * y un pequeño main para probarse
	 * de forma que luego podamos
	 * usar esta clase para codificar
	 * decodificar ficheros
	 * 
	 * Un método codifica el mensaje
	 * y llamando al método decodifica,
	 * recuperaría el mensaje origina
	 * 
	 * @author Administrador
	 *
	 */
		
	public String codifica (String cadena)
		{
			String cad_codificada = "";
			int i_aux = 0 ;
			char c_aux = 0;
			
			for(int i  = 0; i < cadena.length(); i++)
			{
				i_aux = (int) cadena.charAt(i);
				c_aux = (char) (i_aux + 5);
				cad_codificada = cad_codificada + c_aux;
			}
			
			return cad_codificada;
		}
		

	public String decodifica (String cadena)
		{
			String cad_decodificada = "";
			int i_aux = 0 ;
			char c_aux = 0;
			
			for(int i  = 0; i < cadena.length(); i++)
			{
				i_aux = (int) cadena.charAt(i);
				c_aux = (char) (i_aux - 5);
				cad_decodificada = cad_decodificada + c_aux;
			}
			
			return cad_decodificada;
		}

}
