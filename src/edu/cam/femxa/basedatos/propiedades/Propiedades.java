package edu.cam.femxa.basedatos.propiedades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Propiedades {
	
	public static void main(String[] args) throws Throwable {
		
		Properties fichero_propiedades = null;
		fichero_propiedades = new Properties();
		
		FileReader fr = new FileReader("db.properties");
		
		fichero_propiedades.load(fr);
		
		String valor_driver = fichero_propiedades.getProperty("driver");
		
		System.out.println(valor_driver);
		
		fichero_propiedades.setProperty("user", "HR");
		
		String prueba = fichero_propiedades.getProperty("nuevo");
		
		System.out.println(prueba);
		
		fr.close();
		
		
	}

}
