package Pelicula;

public class Main {
public static void main(String[] args) {
	Pelicula miPelicula = new Pelicula();
	miPelicula.nombre = "Encanto";
	miPelicula.fechaDeLanzamiento = 2021;
	miPelicula.duracionMinutos = 120;
	
	miPelicula.muestraFichaTecnica();
	
	Pelicula otraPeli = new Pelicula();
	otraPeli.nombre="Matrix";
	otraPeli.fechaDeLanzamiento =1998;
	otraPeli.duracionMinutos=180;
	
	//System.out.println("Mi otra pelicula es: "+otraPeli.nombre);
	//System.out.println("su fecha de lanzamiento "+ otraPeli.fechaDeLanzamiento);
	
	otraPeli.muestraFichaTecnica();
	//System.out.println(otraPeli);
	
}
}
