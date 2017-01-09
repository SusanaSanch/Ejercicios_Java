package edu.cam.femxa.menuNavidad;

public class Personas {
	
	
	private int edad;
	private String nombre;

	public Personas(String nombre2, int edad2) {
		// TODO Auto-generated constructor stub
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrarPersona()
	{
		System.out.println("Edad: " + this.edad);
		System.out.println("Nombre: " + this.nombre);
	}

}
