/**
 * Clase encargada de mantener al espectador en la arena.
 **/

public class Espectador{

	/**
	 * Atributos de clase
	 * Nombre y eleccion de su personaje favorito para el combate.
	 **/
	 
	private String nombre;
	private String eleccion; 
	
	/**
	 * Constructor
	 * En este caso nos conviene mas tener un constructor parametrizado. Solo debemos de guardar 
	 * El nombre del espectador y su personaje favorito para ganar.  
	 **/

	public Espectador(String nombre, String eleccion){
		this.nombre = nombre;
		this.eleccion = eleccion; 
	}
}
