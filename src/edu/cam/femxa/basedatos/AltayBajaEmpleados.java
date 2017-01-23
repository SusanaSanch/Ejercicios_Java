package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AltayBajaEmpleados {
	
	
	public static Empleado solicitarDatosAlta()
	{
//		ArrayList<Empleado> l_empleados = null;
		boolean continuar = false;
		int id_empleado = 0;
		String nombre_empleado = null;
		
//		do
//			{
//			
			id_empleado = EntradaSalida.solicitaId();
			nombre_empleado = EntradaSalida.solicitaNombre();
			Empleado empleado = new Empleado(id_empleado, nombre_empleado, 0, 0, null);
			
//			l_empleados.add(empleado);
			
//			}
//		while (continuar);
		
		
		
		return empleado;
	}
	
	
	
	public static boolean darBaja()
	{
		boolean baja_ok = false;
		
		return baja_ok;
	}
	
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		
		int opcion_menu = 0;
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		Empleado empleado = null;
		empleado = new Empleado(0, null, 0, 0, null);	
		
		do
			{
			opcion_menu = EntradaSalida.mostrarMenu();
			
			switch (opcion_menu)
				{
				case 1:
			
					empleado = solicitarDatosAlta();
					conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
					stmt = conn.createStatement();
					
//					rset. //crear nuevos empleados
					
					rset.upd
					liberarRecursos(conn, stmt, rset); 
	
					break;
					
				case 2:
					
					conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
					stmt = conn.createStatement();
					

					
//					rset = stmt.executeQuery(SELECT)

					
					//cambiar la llamada a la constante
//					rset = stmt.executeQuery(Consultas.CONSULTA_BAJA);
					
					darBaja();
					
	//				baja --> id empleado
					
					break;
		
				}
			
	
			}
		while (opcion_menu != 3);
		System.out.println("Ha salido del programa de altas y bajas.");
		
	}

}
