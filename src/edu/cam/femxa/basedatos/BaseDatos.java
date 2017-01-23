package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BaseDatos {
	
	public static void mostrarLista(ArrayList<Empleado> list_emp)
	{
		for (Empleado emp : list_emp )
		{
			System.out.println(emp.getNombre());
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		ArrayList<Empleado> lista_empleados = null;
		
		
		lista_empleados = new ArrayList<Empleado>();
		
		Empleado empleado = new Empleado(3, "Juanjo", 27000, 5, "Envíos de Patatas");
		
		lista_empleados.add(empleado);
		
		
//		try
//		{
//			//registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			//DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
//			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
//			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
//  	        stmt = conn.createStatement();
//			rset = stmt.executeQuery("select * from EMPLOYEES ORDER BY SALARY ASC");
//			while (rset.next())
//				{
//					/*System.out.println (rset.getString(1));
//					System.out.println(rset.getString(2));*/
//					String nombre = rset.getString("FIRST_NAME");
//					int id = rset.getInt(1);
//					System.out.println("Nombre = " + nombre + " = " + id);
//				}
//		
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
//		{
//			if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
//			if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
//			if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		  	   
//		}   
//
	}

}
