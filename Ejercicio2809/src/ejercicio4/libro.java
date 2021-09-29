package ejercicio4;

import java.time.LocalDate;

public class libro implements prestable {
	
	private String codigo;
	private String nombre;
	private LocalDate a�o;
	private boolean prestado = false;
	
	public libro(String codigo, String nombre, LocalDate a�o, boolean prestado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�o = a�o;
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

	public LocalDate getA�o() {
		return a�o;
	}

	public void setA�o(LocalDate a�o) {
		this.a�o = a�o;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "libro [codigo=" + codigo + ", nombre=" + nombre + ", a�o=" + a�o + ", prestado=" + prestado + "]";
	}

	@Override
	public void prestar(libro libro) {
		libro.setPrestado(true);
		
		
	}

	@Override
	public void devolver(libro libro) {
		libro.setPrestado(false);
		
	}

	@Override
	public void prestado(libro libro) {
		System.out.println("El libro esta prestado actualmente");
		
	}
	
	

}
