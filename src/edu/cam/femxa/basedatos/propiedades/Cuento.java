package edu.cam.femxa.basedatos.propiedades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Cuento {

	public static void main(String[] args) throws IOException {
		
		Properties fichero_propiedades = null;
		fichero_propiedades = new Properties();
		
		String lengua = args[0];
		FileReader fr = null;
		
		String fichero_salida = null;
		File fichero_final = null;
		
		String [] historia = null; 
		
		BufferedWriter bw = null;
		
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
		
		try
			{
				fichero_propiedades.load(fr);
			} 
			catch (IOException e) 
				{
					e.printStackTrace();
				}
		
		fichero_salida = fichero_propiedades.getProperty("outfile");
		fichero_final = new File (fichero_salida);
		
		historia = new String [3];
		historia[0] = fichero_propiedades.getProperty("start");
		historia[1] = fichero_propiedades.getProperty("body");
		historia[2] = fichero_propiedades.getProperty("end");
		
		
		try 
			{
				bw = new BufferedWriter(new FileWriter(fichero_final));
			} 
			catch (IOException e)
				{
					e.printStackTrace();
				}
		
		for(String renglon : historia)
		{
			try 
			{
				bw.write(renglon);
			}
				catch (IOException e) 
					{
						e.printStackTrace();
					}
			bw.newLine();
			
		}
		fr.close();
		bw.close();
		
		//leer propiedad outfile
		//crear fichero
		//leer y escribir start, body, end
		
	}
}
