package edu.cam.femxa.herencia;

public class Alumno extends Persona {

	/*
	public void mostrarPersona()
	{
		System.out.println("Ha llamado al método mostrar persona de Alumno");
	}
	*/
	
	private int nota;
	
	
	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString()
	{
		String str_dev = null;
		
		str_dev = this.getNombre() + " " + this.getEdad() + " " + this.nota;
		
		return str_dev;
		
		//return super.toString();
	}
	
	
	
	@Override
	public boolean equals(Object objeto) 
	{		
		boolean bar = false;
			Alumno alumno2 = null;
				
				alumno2 = (Alumno)objeto;
				
				if (this.getNombre().equals(alumno2.getNombre()) 
						&& (this.getEdad() == alumno2.getEdad()) 
						&& (this.nota == alumno2.nota))
				{
					bar = true;
				}
			
		return bar;
	}
}
