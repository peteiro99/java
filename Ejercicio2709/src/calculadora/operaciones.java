package calculadora;

public class operaciones implements interfazoperaciones{

	interfazoperaciones suma = (a,b) -> a+b;
	
	interfazoperaciones resta = (a,b) -> a-b;
	
	interfazoperaciones multiplicacion = (a,b) -> a*b;
	
	interfazoperaciones division = (a,b) -> a/b;
	
	public float suma(float num1, float num2) {
		return suma.operar(num1, num2);
		
	}
	
	public float resta(float a, float b) {
		return resta.operar(a, b);
		
	}
	
	public float multiplicacion(float a, float b) {
		return multiplicacion.operar(a, b);
		
	}
	
	public float division(float a, float b) {
		try {
		return division.operar(a, b);
		}catch(Exception e) {
			System.out.println("Division por 0");
		}
		return 0;
		
	}

	@Override
	public float operar(float n1, float n2) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
		



}
