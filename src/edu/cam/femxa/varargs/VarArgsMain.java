package edu.cam.femxa.varargs;

public class VarArgsMain {
	/**
	 * Nos sabes cu�ntos argumentos tendr�, s�lo el n�mero
	 * @param telefonos
	 * @return
	 */
	
	private int regTelfs (String ... telefonos) //n�mero variable de tel�fonos, puedes pasar 1, 2, n...
	{
		for (String string : telefonos) {
			System.out.println(string);
		}
		return telefonos.length;
	}

	public static void main(String[] args) {
		VarArgsMain va = new VarArgsMain();
		
		int n1 = va.regTelfs("2");
		int n2 = va.regTelfs("2", "3");
		int n3 = va.regTelfs("2", "3", "5", "56");
		
		System.out.println(n1);
		System.out.println(n2);
		System.err.println(n3);
	}
}
