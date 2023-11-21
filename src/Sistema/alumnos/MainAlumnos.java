package Sistema.alumnos;

import java.util.Scanner;

public class MainAlumnos {

	public static void main(String[] args) throws NombreInvalidoException, NotaInvalidaException {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos a cargar");
		int cant = teclado.nextInt();
		
		Alumno[] listaAlumnos = new Alumno[cant];
		
		for (int i = 0; i < listaAlumnos.length; i++) {
			
			System.out.println("Ingrese nombre");		
			String nombre = teclado.next();
			if (!nombre.matches("[a-zA-Z]+")) {
	            throw new NombreInvalidoException("El nombre debe contener solo letras.");            
	        }
			
			
			System.out.println("Ingrese apellido");
			String apellido = teclado.next();
			if (!apellido.matches("[a-zA-Z]+")) {
	            throw new NombreInvalidoException("El apellido debe contener solo letras.");            
	        }
			
			System.out.println("Ingrese cantidad de notas");
			int numNotas = teclado.nextInt();
			if (numNotas < 0 || numNotas > 10) {
	            throw new NotaInvalidaException("Debe ingresar un numero entre 1 y 10");            
	        }
			
			Double[] notas = new Double[numNotas];
			Double suma = (double) 0;
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Ingrese la nota "+(j+1));
				notas[j] = teclado.nextDouble();
				if (notas[j] < 0 || notas[j] > 10) {
		            throw new NotaInvalidaException("Debe ingresar un numero entre 1 y 10");            
		        }
				suma += notas[j];
			Double promedio =(suma/numNotas);
		
			listaAlumnos[i]= new Alumno(nombre, apellido, numNotas, notas, promedio);
			
			}
			teclado.close();
		}
				
		for  (Alumno alumno : listaAlumnos) {
			System.out.println(alumno.toString());
		}
		
		ListadoAlumnos.mayorPromedio(listaAlumnos);
		
		ListadoAlumnos.menorPromedio(listaAlumnos);
		
		ListadoAlumnos.promocionan(listaAlumnos);
		
		ListadoAlumnos.recursan(listaAlumnos);
		
		
	}

}
