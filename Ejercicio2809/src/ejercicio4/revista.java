package ejercicio4;

import java.time.LocalDate;

public class revista {
	
	private String codigo;
	private String nombre;
	private LocalDate año;
	private boolean prestado = false;
	private int numero;
	public revista(String codigo, String nombre, LocalDate año, boolean prestado, int numero) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.prestado = prestado;
		this.numero = numero;
	}

	

	public boolean isPrestado() {
		return prestado;
	}



	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getAño() {
		return año;
	}

	public void setAño(LocalDate año) {
		this.año = año;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "revista [codigo=" + codigo + ", nombre=" + nombre + ", año=" + año + ", prestado=" + prestado
				+ ", numero=" + numero + "]";
	}
	
	

}
