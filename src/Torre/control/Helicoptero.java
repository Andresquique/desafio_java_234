package Torre.control;

import java.util.Scanner;

public class Helicoptero implements IAutorizable, IVoladores {
	boolean autorizado;
	String nombre;
	
	
	public Helicoptero(String nombre) {
		this.nombre = nombre;
		this.autorizado = false;
	}

	@Override
	public boolean aterrizableEnPistaUno() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean autorizar() {
		Scanner teclado = new Scanner(System.in);	
		System.out.println("desea autorizar el aterrizaje ingrese true");
		this.autorizado = teclado.nextBoolean();
		return autorizado;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Helicoptero "+getNombre();
	}
	
	
}
