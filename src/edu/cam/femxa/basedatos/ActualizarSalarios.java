package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ActualizarSalarios {
	
	
	
	/**
	 * libera los recursos
	 * @param conn conexion
	 * @param stmt statement
	 * @param rset resultset
	 */
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	
	
	
	/**
	 * Actualiza el salario del departamento seleccionado
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		int contador_actualizaciones = 0;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt = conn.createStatement();
		
		
		try 
			{
			contador_actualizaciones = stmt.executeUpdate(Consultas.AUMENTA_SALARIOS);
				if(contador_actualizaciones > 0)
					{
						System.out.println("Se han realizado " + contador_actualizaciones + " actualizaciones.");
					}
					else
					{
						System.out.println("No se ha realizado ninguna actualización, no se han encontrado registros.");
					}
			
			} 
			catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				finally 
					{
						liberarRecursos(conn, stmt, rset);
					}
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		stmt = conn.createStatement();
		
		try 
		{
		rset = stmt.executeQuery(Consultas.CONSULTA_SALARIOS);
		} 
		catch (SQLException e1)
			{
				e1.printStackTrace();
			}
	
		try 
			{
			System.out.println("Los datos actualizados son:");
			while (rset.next())
				{
					System.out.println("Id = " + rset.getInt(1) + "; Nombre = " + rset.getString(2) + "; Departamento = " + rset.getString(3) + "; Salario = " + rset.getInt(4));
				}
			} 
			catch (SQLException e) 
				{
					e.printStackTrace();
				}
				finally 
					{
						liberarRecursos(conn, stmt, rset);
					}
		
	}
	

}
