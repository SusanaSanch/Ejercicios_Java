package edu.cam.femxa.basedatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;



public class PruebaSavepoint {
	
	
	
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
	 * libera los recursos
	 *@param conn conexion
	 * @param stmt statement
	 * @param rset resultset
	 * @param stmt2 resultset2
	 */
	public static void liberarRecursos(Connection conn, Statement stmt, Statement stmt2, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt2 != null)	{ try {	stmt2.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}

	
	
	/**
	 * Actualiza el salario del departamento seleccionado y muestra el histórico de cambios de salario del día,
	 * guarda un Savepoint después de actualizar, el cual se especifica al rollback, por lo que aunque haya alguna
	 * excepción, la actualización se llevará a cabo.
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		Statement stmt2 = null;
		Savepoint savepoint = null;
		
		try 
			{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			conn.setAutoCommit(false); //Autocommit a false, ya que si no se pierde el concepto de transacción.
			stmt = conn.createStatement();
			stmt.execute(Consultas.AUMENTA_SALARIOS2);
			savepoint = conn.setSavepoint();
			
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
					conn.rollback(savepoint);
					e.printStackTrace();
				}
				finally 
					{
						liberarRecursos(conn, stmt, stmt2, rset);
					}
	
		
	}
	

}