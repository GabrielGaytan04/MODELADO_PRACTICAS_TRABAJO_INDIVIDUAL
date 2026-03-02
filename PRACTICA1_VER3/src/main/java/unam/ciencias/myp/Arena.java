import java.util.LinkedList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase encargada de tener un combate y una lista de espectadores 
 **/
public class Arena implements Sujeto{
	
	/**
	 * ATRIBUTOS DE CLASE
	 * Necesitamos una lista de Espectadores y un combate (Es aqui que agradezco tener una 
	 * version sin parametros, porque ahorra tiempo en edicion de datos jaja). 
	 **/
	 
	 private LinkedList<Espectador> espectadores = new LinkedList<Espectador>();
	 
	 /**
	  * COMBATES QUE SERVIRAN COMO CASOS DE PRUEBA 
	  *	
	  **/
	 private Combate combate = new Combate(); 
	 private Combate combateDos = new Combate();
	 private Combate combateTres = new Combate();
	 
	 /**
	  * METODOS DE SOBRE-ESCRTURA.
	  * Como la arena implementa la interfaz observador, necesitamos agregar, eliminar 
	  * y notificar acerca de los cambios. 
	  **/
	  
	 
	  /**
	   * Metodo para registrar elementos en la lista
	   **/
	   
	  public void registrar(Espectador elemento){
	  	espectadores.add(elemento);
	  }
	  
	  /**
	   * Metodo para eliminar elementos de la lista
	   **/
	  public void eliminar(Espectador elemento){
	  	espectadores.remove(elemento);
	  }
	  
	  /**
	   * Metodo para notificar 
	   **/
	   public void notificar(){
	   	System.out.println("-------------NOTIFICACION-------------");
	   	for(Espectador espectador : espectadores){
	   		espectador.actualizar();
	   	}
	   }
	   
	   /**
	    *  CREACION Y ESCRITURA DE COMBATE 
	    *  Aunque para los primeros metodos bastaba con revisar las presentaciones y codigo 
	    *  propuesto en la ayudantia, para el uso de creacion y edicion de archivos, 
	    *  decidi revisar como hacerlo.
	    *  Toda la informacion la recupere del siguiente articulo: Java Crear y escribir archivos
	    *  Link: https://www.datacamp.com/es/doc/java/create-&-write-files
	    *
            ***/
	   
	   /**
	    * Metodo para crear una bitacora 
	    **/
	   
	   public void creaBitacoras(){
	   
	   	/**
		 * En un for-each nos encargamos de crear los archivos y escribir sobre ellos
		 **/
		 for(Espectador espectador : espectadores){
		 
			/**Mandamos a llamar el metodo que nos da el nombre del usuario y formato deseado cuando creamos al archivo**/
		 	File archivo = new File(espectador.nombreArchivo());	
		 	
		 	/*Bloque try catch que permite escribir informacion en las bitacoras*/
		 	try(FileWriter escritor = new FileWriter(espectador.nombreArchivo())){
		 	
		 		/*Instrucciones de escritura en los archivos recien creados */
		 		escritor.write(espectador.informacionBasica());
		 		escritor.write(combate.modoBrutal());
		 		escritor.write(combateDos.modoPoderes());
		 		escritor.write(combateTres.modoBrutal());
		 		
		 	} catch (IOException e){
		 		System.out.println("Un error ocurrio!");
		 		e.printStackTrace();
		 	}
		 }	  
		  
	   }
	   
	   /**
	    * Metodo para conoceer al primer espectador de la arena
	    **/
	   public String primero(){
	   	return espectadores.peekFirst().getNombre();
	   }
	   
	   /**
	    * Metodo para conocer al ultimo espectador de la arena 
	    **/
	    public String ultimo(){
	    	return espectadores.peekLast().getNombre();
	    }
	   
	
}
