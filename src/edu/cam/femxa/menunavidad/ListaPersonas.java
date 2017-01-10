package edu.cam.femxa.menunavidad;

import java.util.Scanner;

public class ListaPersonas 
{

	public final static int TAMANIO_LISTA = 5; 
	
	private Persona[] lista_personas;
	
	private int num_personas;
	
	public ListaPersonas ()
	{
		num_personas = 0;
		this.lista_personas = new Persona [TAMANIO_LISTA];
		
		//inicializa todos los registros del array a null
		/*for (int i = 0; i < lista_personas.length; i++) 
		{
			lista_personas[i] = null;
		}
		*/
	}
	
	
	public void listarPersonas()
	{
		Persona persona_actual = null;
		
		for(int i = 0; i < this.num_personas; i++)
		{
			persona_actual = lista_personas[i];
			persona_actual.mostrarPersona();
		}
	}
	
	
	public boolean insertarPersonas(Persona persona)
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
	
	
//	/**
//	 * Método que permite buscar un nombre en el listado
//	 * @param nombre El nombre de la persona a buscar
//	 * @return La persona si está o null si no está
//	 */
//	public Persona buscarPersonas(String nombre)
//	{
//
//		Persona persona_busq = null;
//		int indice = 0;
//		boolean encontrado = false;
//		Persona persona_aux = null;
//		
//		while (!encontrado && indice < num_personas)
//			{
//				persona_aux = this.lista_personas[indice];
//				if(persona_aux.getNombre().equals(nombre))
//				{
//					encontrado = true;
//					persona_busq = persona_aux;
//				}
//				indice++;
//			}
//		
//		return persona_busq;
//	}
	
	/**
	 * Método que permite buscar un nombre en el listado
	 * @param nombre El nombre de la persona a buscar
	 * @return La posición de la persona si está y -1 si no está 
	 */
	public int buscarPersonaPos(String nombre)
	{
		int pos = 0;
		Persona persona_aux = null;
		boolean encontrado = false;
		int aux = 0;
		
		
		while (!encontrado && pos < num_personas)
			{
				persona_aux = this.lista_personas[pos];
				if(persona_aux.getNombre().equals(nombre))
				{
					encontrado = true;
					pos = aux;
				}
			}
		if(!encontrado)
		{
			pos = -1;
		}
		
		return pos;
	}
	
	public Persona obtenerPersona(int pos)
	{
		Persona persona_pos = null;
		
		persona_pos = this.lista_personas[pos];
		
		return persona_pos;
	}
}
