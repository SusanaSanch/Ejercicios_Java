package edu.cam.femxa.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HTTPMain {
	
	 public static String getJSON(String urlToRead) throws Exception {
	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }

	   public static void main(String[] args) throws Exception
	   {
	     
		 //System.out.println(getJSON("http://www.revistamongolia.com/"));
		 String joson = getJSON("http://elrecadero-ebtm.rhcloud.com/ObtenerListaRecados");
	     Gson gson = new Gson();
	     List<Recado> l = gson.fromJson(joson, new TypeToken<List<Recado>>(){}.getType());
	     //Recado r = l.get(0);
	     //System.out.println(r.toString());
	     
	     
	     Collections.sort(l);
	     for(Recado r : l)
	     {
	    	 System.out.println("Hora = " + r.getFecha_hora());
	    	 System.out.println("Teléfono = " + r.getTelefono());
	    	 System.out.println("Dirección de entrega = " + r.getDireccion_entrega() + "\n \n-------- \n");
	     }
	     
	     /*private Date fecha_hora;
			private String nombre_cliente;
			private String telefono;
			private String direccion_recogida;
			private String direccion_entrega;
			private String descripcion;
			private Date fecha_hora_maxima;
	     */
	   }

}
