package ejercicios;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Introduce 10 numeros ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if(i< numeros.length-1) {
			numeros[i+1] = teclado.nextInt();
			}else {
				numeros[0] = teclado.nextInt();
			}
		}
		
		System.out.print("Los numeros introducidos ordenados inversamente son: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}

	}

}
