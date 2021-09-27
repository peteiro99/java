package calculadora;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		operaciones op = new operaciones();
		int operacion = 0;
		int parar = 0;
		float num1 = 0,num2=0;
		String otra = "no";

		do {
			if (parar == 0){
		System.out.println("************************** ");
		System.out.println("Selecciona la operación que deseas realizar");
		System.out.println("1- Sumar");
		System.out.println("2- Restar");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		System.out.println("5- Salir");
		System.out.println("************************** ");
		operacion = teclado.nextInt();
		
		System.out.println("\n");
		System.out.println("************************** ");
		System.out.println("Introduce el primer digito");
		System.out.println("************************** ");
	    num1 = teclado.nextFloat();
		System.out.println("\n");
		System.out.println("************************** ");
		System.out.println("Introduce el segundo digito");
		System.out.println("************************** ");
		num2 = teclado.nextFloat();
			}
		
		
		switch(operacion) {
		case 1: 
			System.out.println("Resultado = "+op.suma(num1, num2));
			break;
		case 2: 
			System.out.println("Resultado = "+op.resta(num1, num2));
			break;
		case 3:
			System.out.println("Resultado = "+op.multiplicacion(num1, num2));
			break;
		case 4: 
			System.out.println("Resultado = "+op.division(num1, num2));
			break;
		case 5: break;
		}
		
	
		System.out.println("Desea realizar otra operacion?");
		

		}while(parar ==0);
	
		
	
		
	

	}

}
