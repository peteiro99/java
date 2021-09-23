package ejercicios;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1 = 0;
		int[] numeros = new int[7];
		
		System.out.println("Introduce 7 numeros ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = teclado.nextInt();
			
		}
		
		System.out.print("Los numeros introducidos ordenados inversamente son: ");
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i]+" ");
		}

	}

}
