package Pelicula;

public class Pelicula {
	String nombre;
	int fechaDeLanzamiento;
	int duracionMinutos;
	boolean incluidoEnPlan;
	
	
	void muestraFichaTecnica() {
		System.out.println("El nombre de la pelicula es: "+ nombre);
		System.out.println("Su fecha de lanzamiento es: "+fechaDeLanzamiento);
		System.out.println("duracion en minutos"+duracionMinutos);
		
	
	}
}
