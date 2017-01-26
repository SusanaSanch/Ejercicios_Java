package edu.cam.femxa.basedatos;

public class Consultas {

	public static final String CONSULTA_EMPLEADOS 
	= "SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, D.DEPARTMENT_NAME, E.DEPARTMENT_ID"
			+ " FROM EMPLOYEES E, DEPARTMENTS D"
			+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID"
			+ " ORDER by E.SALARY DESC";
	
	
	
	public static final String CONSULTA_SALARIOS 
	= "SELECT E.EMPLOYEE_ID, E.FIRST_NAME, D.DEPARTMENT_NAME, E.SALARY FROM EMPLOYEES E, DEPARTMENTS D WHERE (D.DEPARTMENT_NAME = 'Administration' OR D.DEPARTMENT_NAME = 'IT') AND E.DEPARTMENT_ID = D.DEPARTMENT_ID";
	 
	
	
	public static final String AUMENTA_SALARIOS
	= "UPDATE EMPLOYEES SET SALARY = (SALARY * 1.2)"
			+ " WHERE DEPARTMENT_ID IN"
			+ " (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Administration' OR DEPARTMENT_NAME = 'IT')";

	public static final String AUMENTA_SALARIOS2
	= "UPDATE EMPLOYEES SET SALARY = (SALARY * 1.2)"
			+ " WHERE DEPARTMENT_ID IN"
			+ " (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Administration')";

	
	
	public static final String ALTA_USUARIO
	= "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME) VALUES (";//+ Empleado nombre + ", " + Empleado id
	
	
	public static final String BAJA_USUARIO
	= "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = ";
	
	
	public static final String HISTORICO_SALARIO = "SELECT EMPLEADO_ID, SALARIO_ANTERIOR, SALARIO_NUEVO, FECHA_ACTUALIZACION "
			+ "FROM HISTORICO_SALARIOS "
			+ "WHERE FECHA_ACTUALIZACION > '25/01/2017 ORDER BY SALARIO_NUEVO";
	
	
}
