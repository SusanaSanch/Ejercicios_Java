package edu.cam.femxa.basedatos.patrondao;

import java.sql.SQLException;
import java.util.ArrayList;


public class Principal {
	
	
	public static String obtenerDatosMostrar(EmpleadosDTO emp)
	{
		String dato = null;
			
			dato = ("Nombre = " + emp.getFirst_name() + "; Apellido = " + emp.getLast_name());
		
		return dato;
		
	}
	
	
	
	public static void mostrarLista(ArrayList<EmpleadosDTO> lista)
	{
		String datos_emp = null;
		for(EmpleadosDTO emp_dto : lista)
			{
				datos_emp = obtenerDatosMostrar(emp_dto);
				System.out.println(datos_emp);
			}
	}
	
	
	
	public static void main(String[] args) throws Exception {
	
		ArrayList<EmpleadosDTO> lista_empleados_dto = new ArrayList<EmpleadosDTO>();
		
		EmployeesDAO emp_dao = null;
		emp_dao = new EmployeesDAO();
		
		lista_empleados_dto = emp_dao.consultaEmpleadosDpto();
	
		mostrarLista(lista_empleados_dto);
			
	}

}
