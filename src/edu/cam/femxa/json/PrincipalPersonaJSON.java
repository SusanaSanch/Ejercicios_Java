package edu.cam.femxa.json;

import com.google.gson.Gson;

public class PrincipalPersonaJSON {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		Persona p = new Persona("Mikel", 4, false, false);
		
		String json_persona = gson.toJson(p);
		
		System.out.println(json_persona);
		
		Persona p2 = gson.fromJson(json_persona, Persona.class);
		
		System.out.println("Hijos = " + p2.getHijos());
		System.out.println("Nombre = " + p2.getNombre());
		System.out.println("Casada = " + p2.isCasada());
		System.out.println("Parada = " + p2.isParada());
		
	}

}
