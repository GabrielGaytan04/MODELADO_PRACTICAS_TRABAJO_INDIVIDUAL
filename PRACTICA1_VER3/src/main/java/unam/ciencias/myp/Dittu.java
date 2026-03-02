/**
 * Clase encargada de representar al tercer personaje disponible del catalogo. 
 * Dittu es un personaje de la saga Chinpokomon 
 **/

public class Dittu extends Personaje{

	 /** Atributos de clase 
         * Para diferenciar un poco mas al personaje de la super clase, 
         * agregamos un atributo nombre que sera fijo y no cambiara
         **/

        private String nombre = "Dittu";

	 /**
	 * Referencia al objeto interfaz
	 **/
	 private objetoEspecialDittu objeto;
	 
	 /**
	 * Constructor por omision 
	 **/
	 public Dittu(){
	 	super();
	 }

        /**
         * Constructor parametrizado
         **/
        public Dittu(int vida, int ataque, int defensa) {
                super(vida,ataque,defensa);
        }
        
        /**
	 * Metodo para conseguir objeto especial. Recibe como parametro de entrada un
	 * objetoEspecialMeganMan. No tiene regreso. 
	 **/
	public void consigueObjeto(objetoEspecialDittu o){
		objeto = o; 
	}
	
	/**
	 * Metodo para ocupar el objeto recien conseguido
	 **/
	 public void ocupaObjeto(){
	 	if(objeto == null){
	 		System.out.println("MEGANMAN ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
	 	}
	 	objeto.ocupa();
	 }
        

        /**
         * Recuperamos el nombre del personaje 
         **/

        public String getNombre() {
                return nombre;
        }
        
        /**
	 * Metodo para resetear el objeto del personaje a nulo. La idea es que el personaje no cargue mas de un poder a la vez 
	 **/
	 public void reinicia(){
	 	objeto = null;
	 }
	 
         /**
	  * DISCLAIMER: A partir de ese punto, los metodos tienePoder(), ataca() y defenderse()
	  * son parecidos PERO NO IGUALES a los de la clase Korby. Aunque quisiera generalizar mas estos metodos,
	  * el problema es que la referencia al objeto de la interfaz no es igual para cada personaje. 
	  * Korby - objetoEspecialKorby
	  * MeganMan - objetoEspecialMeganMan
	  * Dittu - objetoEspecialDiitu 
	  **/
        
         /**
	  * Metodo para saber si el personaje tiene un objeto.
	  * Regresa un booleano 
	  **/
	 public boolean tienePoder(){
	 	return objeto != null;
	 }
	 
	 
	 /**
	  * METODOS ES...
	  * Sere honesto, en este caso se me dificulto un poco como revisar que el objeto fuera de cierto tipo 
	  * Y aunque en parte me guie por el resumen automatico de la IA de google al buscar
	  * como solucionar mi problema, revise que estuvier bien la idea.
	  * En resumen: Yo entendi que podemos usar instance of para saber si nuestro objeto es instancia de una clase 
	  * En este caso pense que era buena idea usarlo para verificar si es que el poder era instancia de uno de los
	  * hijos. Y de hecho funciono. 
	  *
	  * De todos modos revise este articulo de dataCamp por si necesito citar una fuente.
	  * https://www.datacamp.com/doc/java/instanceof
	  **/
	 
	 /**
	  * Metodo para saber si Dittu se transformo en Mew 
	  * Regresa un booleano 
	  **/
	 public boolean esMew(){
	 	return objeto instanceof transformacionMew;
	 }
	 
	 /**
	  * Metodo para saber si Dittu se transformo en Pikachu 
	  * Regresa un booleano 
	  **/
	  public boolean esPikachu(){
	  	return objeto instanceof transformacionPikachu;
	  }
	  
	 /**
	  * Metodo para saber si Dittu se transformo en Magikarp
	  * Regresa un booleano 
	  **/
	  public boolean esMagikarp(){
	  	return objeto instanceof transformacionMagikarp;
	  }
	 
	 
	 /**
	  * NOTA: La implementacion actual de personaje no considera
	  * la habilidad de defenderse. Habria que considerar implementar algunas instrucciones que consideren esa habilidad.
	  **/
	  
	 public void ataca(Personaje b){
	 
	 	/**
	 	 * CASO NULO 
	 	 **/
	 	 if(b == null){
	 	 	throw new IllegalArgumentException("Tu personaje no puede atacar hacia la nada!!!!!!!");
	 	 }
	 	 /**
		  * Llamada al metodo auxiliar 
		  **/
		  realizarAtaque(b);  
	 }
	 
	  /**
          * Implementacion metodo defensa 
	  **/
	  public void defenderse(Personaje b){
	  
	  	 /** CASO NULO **/
	 	 if(b == null){
	 	 	throw new IllegalArgumentException("Tu personaje no puede atacar hacia la nada!!!!!!!");
	 	 
	 	 }
	 	 
	 	 /**CASO CERO**/
	 	 if(getDefensa() == 0){
	 	 	setVida(getVida() - (b.getAtaque()/3));
	 	 }
	 	 
	 	 /**
	 	  * DIVISION POR CASOS. 
	 	  * Estaba discutiendo con unos amigos antes de ver Cumbres Borrascosas  acerca del problema de la defensa.
	 	  * Por idea de un amigo, llegamos a la conclusion que de si el atributo registrado es mayor a 65, bajamos una pequenia fraccion
	 	  * Mientras que si la defensa es menor a 65, podemos ver a la defensa como un ataque hacia el personaje donde perdemos un tercio 
	 	  * del total.  Si la defensa es igual a cero, bajamos puntos de vida. 
	 	  **/ 
	 	  
	 	 /**CASO 1: DEFENSA MAYOR A 65 - BAJAMOS UNA FRACCION DE PUNTOS **/
	 	 if(getDefensa() >= 65){
	 	 	setDefensa(getDefensa() - (getDefensa()/3));
	 	 	setVida(getVida() - b.getAtaque()/3);
	 	 	
	 	 /**CASO 2: DEFENSA MAYOR A CERO - REDUCIMOS LA DEFENSA EN UN TERCIO**/
	 	 }else if(getDefensa() >= 0){
	 	 	setDefensa(getDefensa() - (getDefensa()/2));
	 	 	setVida(getVida() - b.getAtaque()/2);
	 	 }	
	  }
	 
	 
	 /**
	  *Metodo auxiliar para realizar los ataques
	  **/ 
	 private void realizarAtaque(Personaje b){
	 
	 	//CASO 1: Dittu no tiene un poder asociado 
	 	if(objeto == null){
	 	
	 		/**Ataque predeterminado: 10 unidades**/
	 		setAtaque(10);
	 		/**Ajustamos el nivel de vida del personaje. Obtenemos su nivel de vida actual y le restamos **/
	 		
	 		/**Creamos variabe temporal**/
	 		int impactoA = b.getVida() - getAtaque();
	 		
	 		/** Condicional **/
	 		
	 		if(impactoA < 0){
	 			impactoA = 0;
	 		}	
	 		
			/**Ajustamos el valor de vida con la variabe temporal **/
	 		b.setVida(impactoA);
	 	}
	 	//CASO 2: Dittu tiene algun poder asociado
	 	if(esMew() || esPikachu() || esMagikarp()){
	 		setAtaque(objeto.recuperaNuevoAtaque());
	 		
	 		/**
	 		 * Nota: Se que esta es una solucion muy ñera,
	 		 * pero dado el tiempo la mejor idea que se me ocurrio,
	 		 * creamos variables temporales para poder editar el impacto si es que
	 		 * el valor es menor a cero.
			 **/
			int impactoB = b.getVida() - getAtaque();
			
			/** Condicional **/
			if(impactoB < 0){
				impactoB = 0;
			}
			
	 		/** Ajuste barra de vida **/
	 		b.setVida(impactoB);
	 	}
	 }	
	 
}
