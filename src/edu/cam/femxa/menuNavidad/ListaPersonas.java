package edu.cam.femxa.menuNavidad;

import java.util.Scanner;

public class ListaPersonas 
{

	public final static int TAMANIO_LISTA = 5; 
	
	private Personas[] lista_personas;
	
	private int num_personas;
	
	public ListaPersonas ()
	{
		num_personas = 0;
		this.lista_personas = new Personas [TAMANIO_LISTA];
		
		for (int i = 0; i < lista_personas.length; i++)
		{
			lista_personas[i] = null;
		}
	}
	
	
	public void listarPersonas()
	{
		Personas persona_actual = null;
		
		for(int i = 0; i < this.num_personas; i++)
		{
			persona_actual = lista_personas[i];
			persona_actual.mostrarPersona();
		}
	}
	
	
	public boolean insertarPersonas(Personas persona)
	{
		boolean insertado = false;
			
			if(this.num_personas<TAMANIO_LISTA)
			{
				this.lista_personas[num_personas] =  persona;
				this.num_personas++;
				insertado = true;
			}
			else
			{
				System.out.println("La lista está completa, borre un registro para continuar");
				insertado = false;
			}
			
		return insertado;
	}
	
	
	/**
	 * Método que permite buscar un nombre en el listado
	 * @param nombre El nombre de la persona a buscar
	 * @return La persona si está o null si no está
	 */
	public Personas buscarPersonas(String nombre)
	{

		Personas persona_busq = null;
		int indice = 0;
		boolean encontrado = false;
		Personas persona_aux = null;
		
		while (!encontrado && indice < num_personas)
			{
				persona_aux = this.lista_personas[indice];
				if(persona_aux.getNombre() == nombre)
				{
					encontrado = true;
					persona_busq = persona_aux;
				}
				indice++;
			}
		
		return persona_busq;
	}
}
