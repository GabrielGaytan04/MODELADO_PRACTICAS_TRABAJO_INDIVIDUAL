
/**
 * Clase encargada de generar a un espectador que se encuentra en la 
 * arena. La idea es que tengamos una lista de estos individuos. 
 **/

public class Espectador implements Observador{

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
	
	/**
	 * Implementcion de observador
	 **/
	 
	 public void actualizar(){
	 	System.out.println("--------LOS DATOS HAN SIDO ACTUALIZADOS EN LA BITACORA-------------");
	 }
	 
	 /**
	  * Metodos para obtener acceso al nombre y personaje de interes
	  * del espectador.
	  **/
	  public String getNombre(){
	  	return nombre;
	  }
	  public String nombreArchivo(){	
	  	return nombre + ".txt";
	  }
	  
	  public String conocerPersonajeFavorito(){
	  	return eleccion;
	  }	 
	  public String informacionBasica(){
	  	return "NOMBRE: " + nombre + "\n" + "ELECCION DE PERSONAJE: " + eleccion;
	  }
}
