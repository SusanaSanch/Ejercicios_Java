package edu.cam.femxa.menuNavidad;

import java.util.Scanner;

public class Main {

	

	/**
	 * Muestra el menú al usuario
	 */
	public static void mostrarMenu()
	{
	System.out.println("Elija una opción del menú:");
	System.out.println("1.INSERTAR PERSONA");
	System.out.println("2.LISTAR PERSONAS");
	System.out.println("3.BUSCAR PERSONA POR NOMBRE");
	System.out.println("4.BORRAR PERSONA");
	System.out.println("5.SALIR");
	}
	
	/**
	 * selección de opción
	 * @return el número de la opción del menú
	 */
	
	public static int seleccionarOpcion()
	{
		int opcion = 0;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
			opcion = scanner.nextInt();
		return opcion;
	}
	
	
	
	public static Personas[] insertarPersona(Personas [] listado, int cont)
	{
		
		Scanner scan = null;
		scan = new Scanner(System.in);
		String nombre = null;
		int edad = 0;
		
			if(cont >= listado.length)
			{
				System.out.println("La base de datos está completa, por favor borre una persona para continuar");
			}	
				else
				{
					System.out.println("INTRODUZCA EL NOMBRE DE LA PERSONA: " + (cont+1));
					nombre = scan.next();
					
					System.out.println("INTRODUZCA LA EDAD DE LA PERSONA: " + (cont+1));
					edad = scan.nextInt();
					
					//listado[cont].setNombre(nombre);
					listado[cont] = new Personas(nombre, edad);
				}	
			return listado;
									
	}
	
	
	
	public static void listarPersonas(Personas [] listado)
	{
		for (int i = 0; i < listado.length; i++)
		{
			System.out.println("Persona " + (i + 1) + (":"));
			System.out.println("Nombre: " + listado[i].getNombre());
			System.out.println("Edad: " + listado[i].getEdad());
		}
	}
	
	
	public static void buscarPersonas(Personas [] listado)
	{
		Scanner scan = null;
		scan = new Scanner (System.in);
		String nombre_buscar = null;
		int cont = 0;
		
		System.out.println("Introduzca el nombre de la persona a buscar:");
		nombre_buscar = scan.next();
		
		for(int i = 0; i < listado.length; i++)
		{
			if(listado[i].getNombre() == nombre_buscar)
			{
				System.out.println("Persona " + (i + 1) + (":"));
				System.out.println("Nombre: " + listado[i].getNombre());
				System.out.println("Edad: " + listado[i].getEdad());
			}
			else 
			{
				cont++;
			}
		}
		
		if(cont == (listado.length - 1))
		{
			System.out.println("NO COINCIDENCIA");
		}
	}
	
	public static void borrarPersona(Personas [] listado)
	{
		Scanner scan = null;
		scan = new Scanner (System.in);
		String nombre_buscar = null;
		int cont = 0;
		String respuesta = null; 
		
		System.out.println("Introduzca el nombre de la persona a borrar:");
		nombre_buscar = scan.next();
		
		for(int i = 0; i < listado.length; i++)
		{
			if(listado[i].getNombre() == nombre_buscar)
			{
				System.out.println("Persona " + (i + 1) + (":"));
				System.out.println("Nombre: " + listado[i].getNombre());
				System.out.println("Edad: " + listado[i].getEdad());
				System.out.println("¿Desea borrar esta persona? (S/N)");
				respuesta = scan.next();
				if (respuesta == "S")
				{
					listado[i].setNombre(null);
					listado[i].setEdad(0);
				}
					if (respuesta == "N")
					{
						System.out.println("Borrado no ejecutado");
					}
					else
					{
						System.out.println("Clave no válida, borrado no ejecutado");
					}
				
			}
			else 
			{
				cont++;
			}
		}
		
		if(cont == (listado.length - 1))
		{
			System.out.println("NO COINCIDENCIA");
		}
		
	}
	
	public static boolean ejecutarMenu(int opcion, Personas [] listado, int cont)
	{
		boolean salir = false;
		
			switch (opcion)
			{
			case 1:
				insertarPersona(listado, cont); //inserta Personas en el array;
				cont++;
				break;
			case 2:
				listarPersonas(listado); //lista las personas que hay en el array
				break;
			case 3:
				buscarPersonas(listado); //busca una persona por su nombre;
				break;
			case 4:
				borrarPersona(listado);//busca una persona y la borra;
				break;
			case 5:
				salir = true;
				break;
				
				default:
					System.out.println("La opción marcada es incorrecta");
			}
			
		return salir;
	}
	
	
	

	
	
	public static void main(String[] args) 
	{
		
		ListaPersonas lista_personas = null;
		lista_personas = new ListaPersonas ();
		Personas listado[] = new Personas[5]; //Crea array de 5 personas
		boolean salir = false;
		int opcion = 0;
		int cont = 0;
		String opcionLetras = null;
		
		do //Bucle de menú
		{
		
			mostrarMenu(); //Muestra el menú
		/*
		 * TODO SELECCIONAR OPCION, CONVERTIR OPCIÓN EN ENUM
		 */
			opcion = seleccionarOpcion();
			//opcionLetras = convertirOpcion(opcion);
			ejecutarMenu(opcion,listado, cont);			
			
		/*
		 * TODO SWITCH ENUM
		 */
			
		}
		while (!salir);
		System.out.println("PROGRAMA FINALIZADO");
	}

}
