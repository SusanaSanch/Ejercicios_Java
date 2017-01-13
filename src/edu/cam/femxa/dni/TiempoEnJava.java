package edu.cam.femxa.dni;

public class TiempoEnJava {
	
	public static void pierdeTiempo() throws InterruptedException
	{
		for(int j = 1; j < 3; j++)
		{
			Thread.sleep(5000);
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
	long tiempo_inicial = System.currentTimeMillis();
	pierdeTiempo();
	long tiempo_final = System.currentTimeMillis();
	double segundos = (tiempo_final - tiempo_inicial)/1000;
	System.out.println("Tardó " + segundos + " segundos");
		 
	}

}
