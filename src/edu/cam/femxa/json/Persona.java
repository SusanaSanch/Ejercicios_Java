package edu.cam.femxa.json;

public class Persona {
	
	private String nombre;
	private int hijos;
	private boolean casada;
	private boolean parada;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHijos() {
		return hijos;
	}
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}
	public boolean isParada() {
		return parada;
	}
	public void setParada(boolean parada) {
		this.parada = parada;
	}
	
	public Persona(String nombre, int hijos, boolean casada, boolean parada) {
		super();
		this.nombre = nombre;
		this.hijos = hijos;
		this.casada = casada;
		this.parada = parada;
	}
	
	
	
	

}
