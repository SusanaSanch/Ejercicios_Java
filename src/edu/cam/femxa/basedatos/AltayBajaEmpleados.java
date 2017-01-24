package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AltayBajaEmpleados {
	
	
	public static Empleado solicitarDatosAlta()
	{
		int id_empleado = 0;
		String nombre_empleado = null;
		
			id_empleado = EntradaSalida.solicitaId();
			nombre_empleado = EntradaSalida.solicitaNombre();
			Empleado empleado = new Empleado(id_empleado, nombre_empleado, 0, 0, null);
		
		return empleado;
	}
	
	
	public static Empleado solicitarDatosBaja()
	{
		int id_empleado = 0;
		
			id_empleado = EntradaSalida.solicitaId();
			Empleado empleado = new Empleado(id_empleado, null, 0, 0, null);
		
		return empleado;
	}
	
	
	
	
	
	
	public static void liberarRecursosConn(Connection conn)
	{
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}


	
	public static void liberarRecursosStmt(Statement stmt)
	{
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	}
	
	
	
	
	public static void liberarRecursosRset(ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
	}
	
	
	
	public static void main(String[] args) {
		
		int opcion_menu = 0;
		Connection conn = null;
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
					try 
						{
							Class.forName("oracle.jdbc.driver.OracleDriver");
						} 
						catch (ClassNotFoundException e) 
							{
								e.printStackTrace();
							}
					
					try 
						{
							conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
						} 
						catch (SQLException e1)
							{
								e1.printStackTrace();
							}
					try
						{
							stmt = conn.createStatement();
						} 
						catch (SQLException e) 
							{
								e.printStackTrace();
							}
					
					try 
						{
							stmt.execute(Consultas.ALTA_USUARIO + empleado.getId() + ", " + empleado.getNombre());
						} 
						catch (SQLException e) 
							{
								e.printStackTrace();
							}
							finally 
								{
									liberarRecursosConn(conn);
									liberarRecursosStmt(stmt);
								}
					break;
					
				case 2:
					
					try 
						{
							conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
						} 
						catch (SQLException e)
							{
								e.printStackTrace();
							}
					try 
						{
							stmt = conn.createStatement();
						} 
						catch (SQLException e)
							{
								e.printStackTrace();
							}
							
						empleado = solicitarDatosBaja();
						
					try
						{
							stmt.execute(Consultas.BAJA_USUARIO + empleado.getId());
						} 
						catch (SQLException e)
							{
								e.printStackTrace();
							}
							finally 
								{
									liberarRecursosConn(conn);
									liberarRecursosStmt(stmt);
								}
					
					break;
		
				}
			
	
			}
		while (opcion_menu != 3);
		System.out.println("Ha salido del programa de altas y bajas.");
		
	}

}
