package edu.cam.femxa.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AltayBajaEmpleados {
	
	
	public static boolean darAlta()
	{
		boolean alta_ok = false;
		
		
		
		return alta_ok;
	}
	
	
	
	public static boolean darBaja()
	{
		boolean baja_ok = false;
		
		return baja_ok;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int opcion_menu = 0;
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		do
			{
			opcion_menu = EntradaSalida.mostrarMenu();
			
			switch (opcion_menu)
				{
				case 1:
					
					
					darAlta();
	//		alta --> sólo campos obligatorios + PK
	
					break;
					
				case 2:
					
					conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
					stmt = conn.createStatement();

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
