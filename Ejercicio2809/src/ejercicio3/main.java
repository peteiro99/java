package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {
	
	public static int saldoPrestados(Object[] libros) {
		int count = 0;
		
		for (int i = 0; i < libros.length; i++) {
			if(((prestados) libros[i]).isPrestado()) {
				count++;
			}
		}
		return count;
		
	}
	
	public static int cantPublicaciones(Object[] libros, LocalDate fecha) {
		int numpub = 0;
		for (int i = 0; i < libros.length; i++) {
			if(((prestados) libros[i]).getFecha().isBefore(fecha)) {
				numpub++;
			}
		}
		
		
		return numpub;
		
	}

	public static void main(String[] args) {
		
	

	}

}
