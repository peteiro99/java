package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la cadena que desea invertir ");
		
		String frase = teclado.nextLine();
		
		StringBuilder str = new StringBuilder(frase);
		
		String[] invertido = str.toString().split(" ");
		
		
		for (int i = invertido.length-1; i >= 0; i--) {
			
			
			System.out.print(invertido[i]+ " ");
		}

	}

}
