package Torre.control;

public class Controlador {
	public void aterrizar(IVoladores volador) {
        if (volador.aterrizableEnPistaUno()) {
            System.out.println("Aterrize en la Pista 1");
        } else if (volador instanceof IAutorizable) {
            IAutorizable autorizable = (IAutorizable) volador;
            if (autorizable.autorizar()) {
                System.out.println("Autorizado, aterrize en la Pista 2 ");
            } else {
                System.out.println("Aterrizaje no autorizado");
            }
        } else {
            System.out.println("Aterrizaje no autorizado");
        }
    }
}
