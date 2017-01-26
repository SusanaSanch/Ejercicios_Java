package edu.cam.femxa.basedatos;

import java.awt.image.ConvolveOp;
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
	
	public static void liberarRecursos(Connection conn, Statement stmt, Statement stmt2, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt2 != null)	{ try {	stmt2.close(); } catch (Exception e2) { e2.printStackTrace(); }}
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
		
		/*
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
		
		
		*/
//		int contador_actualizaciones = 0;
		
//		if(contador_actualizaciones > 0)
//		{
//			System.out.println("Se han realizado " + contador_actualizaciones + " actualizaciones.");
//		}
//		else
//		{
//			System.out.println("No se ha realizado ninguna actualización, no se han encontrado registros.");
//		}
		
		Statement stmt2 = null;
		try 
			{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			stmt.execute(Consultas.AUMENTA_SALARIOS2);
			stmt2 = conn.createStatement();
			rset = stmt2.executeQuery(Consultas.HISTORICO_SALARIO);
			System.out.println("Los datos en el registro histórico de salarios modificados hoy son:");
			while (rset.next())
				{
					System.out.println("Id Empleado= " + rset.getInt(1) + "; Salario anterior = " + rset.getInt(2) + "; Salario nuevo = " + rset.getInt(3) + "; Fecha actualización = " + rset.getString(4));
				}
				conn.commit();
			} 
			catch (SQLException e) 
				{
					conn.rollback();
					e.printStackTrace();
				}
				finally 
					{
						liberarRecursos(conn, stmt, stmt2, rset);
					}
	
		
	}
	

}
