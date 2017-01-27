package edu.cam.femxa.basedatos.patrondao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeesDAO {

	
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	
	
	public ArrayList<EmpleadosDTO> consultaEmpleadosDpto () throws Exception
	{
		ArrayList<EmpleadosDTO> lista = new ArrayList<EmpleadosDTO>();
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		EmpleadosDTO emp_dto = new EmpleadosDTO(0, null, null, null, null, null, null, 0, 0, 0, 0);
		
		try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
				stmt = conn.createStatement();
				rset = stmt.executeQuery(SentenciasBbdd.CONSULTA_EMPLEADOS_DPTO);
			} 
			catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			
		try 
			{
			while (rset.next())
				{
					emp_dto = new EmpleadosDTO(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4),
							rset.getString(5), rset.getString(6), rset.getString(7), rset.getFloat(8), rset.getFloat(9), 
							rset.getInt(10), rset.getInt(11));
					lista.add(emp_dto);
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
	
		
		return lista;
	}
	
}
