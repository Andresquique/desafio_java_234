package Torre.control;

import java.util.ArrayList;
import java.util.List;

public class MainTorreControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador pista = new Controlador();

        List<IVoladores> voladores = new ArrayList<>();
        
        voladores.add(new Avion("boing737"));
        
        voladores.add(new Helicoptero("apache"));
        
        voladores.add(new Avion("airbus"));
        
        voladores.add(new Helicoptero("comanche"));

        for (IVoladores volador : voladores) {
        	System.out.println(volador.toString());
            pista.aterrizar(volador);
        }
     
    }
	}


