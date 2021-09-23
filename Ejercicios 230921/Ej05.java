package ejercicios;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Double[][] grupo1 = new Double[5][3];
		Double nota;
		int alumno;
		Double primertrimestre = 0.0;
		Double segundotrimestre = 0.0;
		Double tercertrimestre = 0.0;
		
		
		System.out.println("Introduce las notas del grupo 1 en cada trimestre ");
		
		for (int i = 0; i < grupo1.length; i++) {
			System.out.print("Alumno: ");
			System.out.println(i+1);
			for (int j = 0; j < grupo1[i].length; j++) {
				System.out.print("Trimestre ");
				System.out.println(j+1);
				nota = teclado.nextDouble();
				
				grupo1[i][j] = nota;
				
				if(j==0) {
				primertrimestre = primertrimestre +grupo1[i][0];
				}
		
				if(j==1){
				segundotrimestre = segundotrimestre+ grupo1[i][1];
				}
			
				if(j==2) {
				tercertrimestre = tercertrimestre +grupo1[i][2];
				}
		
				
				
				
			}
		}
		
		System.out.println("La media del primer trimestre es: "+ primertrimestre/5);
		System.out.println("La media del segundo trimestre es: "+ segundotrimestre/5);
		System.out.println("La media del tercer trimestre es: "+ tercertrimestre/5);
			

		System.out.println("Hallar la media del alumno en la posicion: ");
			alumno = teclado.nextInt();
			double media = 0;
			for (int j = 0; j < grupo1[alumno].length; j++) {
				
				media = media+ grupo1[alumno][j];
				
			}
			
			System.out.println("La media del alumno "+ alumno+ " es "+media/3);
	}

}
