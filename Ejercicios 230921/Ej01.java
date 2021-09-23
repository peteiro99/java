package ejercicios;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1 = 0;
		int[] numeros = new int[7];
		
		System.out.println("Introduce 7 numeros ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = teclado.nextInt();
			
		}
		
		System.out.print("Los numeros introducidos son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}

}
