package ejercicio5;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraypila = new ArrayList<Integer>();
		arraypila.add(1);
		arraypila.add(2);
		arraypila.add(3);
		arraypila.add(4);
		arraypila.add(5);
		
		Pila pila = new Pila(arraypila,5,6);
		
		System.out.println(pila.añadir(6));
		System.out.println(pila.añadir(7)); //No se puede añadir
		
		pila.extraer();

	}

}
