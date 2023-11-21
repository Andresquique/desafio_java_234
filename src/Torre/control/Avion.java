package Torre.control;

public class Avion implements IVoladores {
	String nombre;
	
	public Avion(String nombre) {
		this.nombre = nombre;
	}

	public boolean aterrizableEnPistaUno() {
        return true;
    }

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Avion "+getNombre();
	}
	
	
}
