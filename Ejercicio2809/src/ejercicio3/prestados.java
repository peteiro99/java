package ejercicio3;

import java.time.LocalDate;

public class prestados {

	
	private String nombre;
	private LocalDate fecha;
	private boolean prestado = false;
	
	public prestados(String nombre, LocalDate fecha, boolean prestado) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

}
