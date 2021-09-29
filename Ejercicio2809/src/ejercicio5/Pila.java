package ejercicio5;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Pila implements ColeccionInterfaz {
	


	private ArrayList<Integer> pila;
	private int counter = 0;
	private int size;
	
	public ArrayList<Integer> getPila() {
		return pila;
	}

	public void setPila(ArrayList<Integer> pila) {
		this.pila = pila;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Pila(ArrayList<Integer> pila, int counter, int size) {
		super();
		this.pila = pila;
		this.counter = counter;
		this.size = size;
	}

	@Override
	public boolean añadir(int a) {
		
		if(this.counter < this.size) {
			pila.add(a);
			counter++;
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean estaVacia() {
		if(counter == 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void extraer() {
		try {
			if(counter == 0) {
				throw new NoSuchElementException();
			}else {
				System.out.println("El elemento extraido es: "+ pila.get(counter-1));
				pila.remove(counter-1);
				counter--;
			}
		}catch(NoSuchElementException e) {
			System.out.println("No hay ningun elemento en la pila");
		}
		
	}

	@Override
	public void primero() {
		
		try {
			if(counter == 0) {
				throw new NoSuchElementException();
			}else {
				System.out.println("El primer elemento es: "+ pila.get(counter-1));
			}
		}catch(NoSuchElementException e) {
			System.out.println("No hay ningun elemento en la pila");
		}
		
	}

	@Override
	public String toString() {
		return "Pila [pila=" + pila + ", counter=" + counter + ", size=" + size + "]";
	}
	
	

}
