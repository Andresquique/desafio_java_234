package Sistema.alumnos;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellido;
	private int numNotas;
	private Double[] notas;
	private Double promedio;
	
	public Alumno(String nombre, String apellido, int numNotas, Double[] notas, Double promedio) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.numNotas = numNotas;
		this.notas = notas;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNumNotas() {
		return numNotas;
	}

	public Double[] getNotas() {
		return notas;
	}

	public Double getPromedio() {
		return promedio;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", numNotas=" + numNotas + ", notas="
				+ Arrays.toString(notas) + ", promedio=" + promedio + "]";
	}
	
	
	
}
