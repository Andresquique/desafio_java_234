package Sistema.alumnos;

public  class ListadoAlumnos {


public static void mayorPromedio(Alumno [] listado) {
	Double prom = (double) 0;
	String alumno = null;
	for (int i = 0; i < listado.length; i++) {
		 if (listado[i].getPromedio() > prom) {
			 prom = listado[i].getPromedio();
		 	 alumno = (listado[i].getNombre()+" "+listado[i].getApellido());}
		}
	System.out.println(alumno +" es el mayor promedio con "+prom);
}

public static void menorPromedio(Alumno [] listado) {
	Double prom = (double) 11;
	String alumno = null;
	for (int i = 0; i < listado.length; i++) {
	 if (listado[i].getPromedio() < prom) {
		 prom = listado[i].getPromedio();
	 	alumno = (listado[i].getNombre()+" "+listado[i].getApellido());}
	}
	System.out.println(alumno +" es el menor promedio con "+prom);
}
public static void promocionan(Alumno [] listado) {
	
	for (int i = 0; i < listado.length; i++) {
	 if (listado[i].getPromedio() >= 7)
		 System.out.println(listado[i].getNombre()+" "+listado[i].getApellido()+" promociona.");
	}	
}
public static void recursan(Alumno [] listado) {
	
	for (int i = 0; i < listado.length; i++) {
	 if (listado[i].getPromedio() < 7)
		 System.out.println(listado[i].getNombre()+" "+listado[i].getApellido()+" recursa.");
	}
}
}
