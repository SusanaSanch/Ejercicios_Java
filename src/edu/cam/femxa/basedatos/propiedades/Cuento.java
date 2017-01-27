package edu.cam.femxa.basedatos.propiedades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Cuento {

	public static void main(String[] args) throws FileNotFoundException {
		
		Properties fichero_propiedades = null;
		fichero_propiedades = new Properties();
		
		String lengua = args[0];
		FileReader fr = null;
		
		switch (lengua)
			{
				case "EN":
					fr = new FileReader("story_en.properties");
					break;
				
				case "ES":
					fr = new FileReader("story_es.properties");
					break;
				
				case "IT":
					fr = new FileReader("story_it.properties");
					break;
			}
		
		//leer propiedad outfile
		//crear fichero
		//leer y escribir start, body, end
		
	}
}
