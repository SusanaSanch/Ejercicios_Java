package edu.cam.femxa.basedatos.patrondao;

public class SentenciasBbdd {

	public static final int DPTO = 100;
	
	
	public static final String CONSULTA_EMPLEADOS_DPTO =
			"SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = " + DPTO;
	
}
