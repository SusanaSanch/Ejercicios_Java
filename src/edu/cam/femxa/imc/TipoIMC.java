package edu.cam.femxa.imc;

public enum TipoIMC {DESNUTRIDO, BAJOPESO, NORMAL, SOBREPESO, OBESO;

	
public static TipoIMC traduceIMC (double imc)
	{
		TipoIMC devuelvo = null;
			
		if (imc <16)
			devuelvo = TipoIMC.DESNUTRIDO;
			else if ((imc >= 16) && (imc < 18.5))
				devuelvo = TipoIMC.BAJOPESO;
				else if ((imc >= 18.5) && (imc < 25))
					devuelvo = TipoIMC.NORMAL;
					else if ((imc >= 25) && (imc < 30))
						devuelvo = TipoIMC.SOBREPESO;
						else /*if (imc>=31)*/
							devuelvo = TipoIMC.OBESO;
							
		return devuelvo;
		
	}

	
}
