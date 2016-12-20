package edu.cam.femxa.herencia;

public class MainHererncia {

	public static void main (String [] args)
	{
		Alumno alumno = new Alumno ();
		Alumno alumno2 = new Alumno ();
		
		alumno.setNombre("Nira");
		alumno.setEdad(26);
		alumno.setNota (5);
		
		alumno.mostrarPersona();
		System.out.println("HASHCODE: " + alumno.hashCode());
		System.out.println("TOSTRING: " + alumno.toString());
		
		alumno2.setNombre("Nira");
		alumno2.setEdad(26);
		alumno2.setNota (5);
		
		if (alumno.equals(alumno2)) //alumno.equals(alumno2) --> equals heredado de object //alumno == alumno2
		{
			System.out.println("Alumno y Alumno2 son iguales");
		}
		else
			{
				System.out.println("Alumno y Alumno2 NO son iguales");
			}
		
		if (alumno instanceof Object)
		{
			System.out.println("El alummno es instancia de la clase Object");
		}
				
		if (alumno instanceof Persona)
		{
			System.out.println("El alummno es instancia de la clase Persona");
		}
		
		if (alumno instanceof Alumno)
		{
			System.out.println("El alummno es instancia de la clase Alumno");
		}
	}
}
