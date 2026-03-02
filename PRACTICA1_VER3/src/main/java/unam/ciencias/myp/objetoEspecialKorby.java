/**
 * Interfaz especifica encargada de asignar un objeto especial a Korby
 * Los poderes asociados al personaje impkementaran esta interfaz.  
 **/
 
public interface objetoEspecialKorby{
	/**
	 * El metodo encargado de ser implementado por sus clases hijas sera 
	 * la generacion del objeto. 
	 **/
	public void ocupa();
	/**
	 * Cada poder contara con la particularidad de que puedas recuperar el estatus de su 
	 * defensa y ataque asignados; 
	 **/
	 public int recuperaNuevoAtaque();
	 public int recuperaNuevaDefensa();
}
