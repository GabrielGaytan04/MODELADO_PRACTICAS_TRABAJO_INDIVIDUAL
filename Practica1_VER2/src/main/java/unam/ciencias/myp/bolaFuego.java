/**
 * Segundo poder permitido de Korby 
 * Implementa la interfaz objetoEspecialKorby. 
 **/
public class bolaFuego implements objetoEspecialKorby{

		/**
		 * Atributos de clase que espero poder relacionar en las 
	 	 * mecanicas de combate 
		 **/
		 
		/** Ataque **/ 
		private int a = 100;
		/** Defensa **/ 
		private int d = 80;
		
		/**
		 * Escritura del metodo proveniente de la interfaz
		 **/
		public void ocupa(){
			System.out.println("Korby es un peligro forestal!!!!");
		}
		
		/**
		 * Recuperacion de nuevos valores
		 **/
		 public int recuperaNuevoAtaque(){
		 	return a;
		 }
		 public int recuperaNuevaDefensa(){
		 	return d;
		 }
}
