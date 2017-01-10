package edu.cam.femxa.menunavidad;

public class Persona {
	
	
	private int edad;
	private String nombre;

	public Persona(){}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
