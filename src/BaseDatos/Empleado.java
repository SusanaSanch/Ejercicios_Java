package BaseDatos;

public class Empleado {
	
	private int id;
	private String nombre;
	private int salario;
	private int dpto_id;
	private String dpto_nombre;
	
	
	
	
	
	public Empleado(int id, String nombre, int salario, int dpto_id, String dpto_nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.dpto_id = dpto_id;
		this.dpto_nombre = dpto_nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getDpto_id() {
		return dpto_id;
	}

	public void setDpto_id(int dpto_id) {
		this.dpto_id = dpto_id;
	}

	public String getDpto_nombre() {
		return dpto_nombre;
	}

	public void setDpto_nombre(String dpto_nombre) {
		this.dpto_nombre = dpto_nombre;
	}
	
	
	

}
