package edu.cam.femxa.imc;

public class Principal {

	public static void main(String[] args) {
	
		/**
		 * obtener peso
		 * obtener altura
		 * calcular imc
		 * mostrar resultado
		 * Persona
		 * IMC
		 * EntradaSalida
		 */
		
		double peso = EntradaSalida.obtenerPeso();
		double altura = EntradaSalida.obtenerAltura();
		Persona persona = new Persona  (peso, altura);
		double imc = IMC.calcula(persona);
		TipoIMC tipo = TipoIMC.traduceIMC(imc);
		EntradaSalida.mostrarIMC(imc);
		
				
	}

	
}

