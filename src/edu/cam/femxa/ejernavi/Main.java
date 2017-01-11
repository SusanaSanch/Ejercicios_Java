package edu.cam.femxa.ejernavi;

public class Main {

	public static void main(String[] args) 
	{
		ListaPersonas lista = null;
		lista = new ListaPersonas();
		
		Persona persona_aux = null;
		persona_aux =  new Persona(null, 0);
		
		Persona persona1 = null;
		persona1 = new Persona ("Ramiro", 29);
		
		Persona persona2 = null;
		persona2 = new Persona("Casimiro", 23);
		
		int pos = 0;
		
		lista.insertarPersona(persona1);
		lista.insertarPersona(persona2);
		
		pos = lista.buscarPersonaPos("Ramiro");
		
		if (pos != -1)
		{
			persona_aux = lista.obtenerPersona(pos);
			persona_aux.mostrarPersona();
		}
		else
		{
			System.out.println("Persona no encontrada");
		}
	}
		

}
