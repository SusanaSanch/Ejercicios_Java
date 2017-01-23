package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;




public class ListaArrayEmpleados {
	
	
	
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	
	public static String obtenerDatosEmpleado(Empleado emp)
	{
		String datos = "";
		
		datos = ("id = " + emp.getId() + "; nombre = " + emp.getNombre() + "; salario = " +
				emp.getSalario() + "; dpto_id = " + emp.getDpto_id() + "; nombre dpto = " + emp.getDpto_nombre()); 
		
		return datos;
	}
	
	
	public static void mostrarEmpleado (Empleado empleada, ArrayList<Empleado> lista)
	{
		String datos_empleada = null;
		for(Empleado emp : lista)	
			{
				datos_empleada = obtenerDatosEmpleado(emp);
				System.out.println(datos_empleada);
			}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
				
		ArrayList<Empleado> lista_empleados_bbdd = new ArrayList<Empleado>();
		
		Empleado empleada = null;
				
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt = conn.createStatement();

		rset = stmt.executeQuery(Consultas.CONSULTA_EMPLEADOS);
		
		while (rset.next())
			{
				empleada = new Empleado(rset.getInt(2), rset.getString("FIRST_NAME"), rset.getInt(3), rset.getInt(5), rset.getString(4));
				lista_empleados_bbdd.add(empleada);
			}
			
		mostrarEmpleado(empleada, lista_empleados_bbdd);
		liberarRecursos(conn, stmt, rset);
		
	}

}
