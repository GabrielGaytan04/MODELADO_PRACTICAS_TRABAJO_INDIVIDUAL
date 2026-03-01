
/**
 * Clase que representa al primero de los 3 personajes permitidos en el videojuego 
 * Korby es un personaje de la empresa Nientiendo
 **/

public class Korby extends Personaje{

	/**
	 * Atributos de clase 
	 *
	 * Para diferenciar un poco mas al personaje de la super clase, 
	 * agregamos un atributo nombre que sera fijo y no cambiara
	 **/

	private String nombre = "Korby";
	
	/**
	 * Referencia al objeto interfaz
	 **/
	
	private objetoEspecialKorby objeto;
	

	/**
	 * Constructor por omision 
	 **/
	 public Korby(){
	 	super();
	 }
	 
	/**
	 * Constructor parametrizado 
	 **/
	public Korby(int vida, int ataque, int defensa) {
		super(vida,ataque,defensa);
	}
	
	/**
	 * Metodo para conseguir objeto especial. Recibe como parametro de entrada un
	 * objetoEspecialKorby. No tiene regreso. 
	 **/
	public void consigueObjeto(objetoEspecialKorby o){
		objeto = o; 
	}
	/**
	 * Metodo para ocupar el objeto recien conseguido
	 **/
	 public void ocupaObjeto(){
	 	if(objeto == null){
	 		System.out.println("KORBY ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
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
	 * BOOLEANOS 
	 * Antes de pasar con los metodos relacionados a la generacion de poderes, conviene tener uno o varios metodos 
	 * que determinen si es que alguno de los personajes cumple x propiedad que decidi programar. Esto para evitar probemas 
	 * con la verificacion a la hora programar un combate usandoa korby.
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
	  * Metodo para saber si Korby es espadachin
	  * Regresa un booleano 
	  **/
	 public boolean esEspadachin(){
	 	return objeto instanceof Espadachin;
	 }
	 
	 /**
	  * Metodo para saber si Korby es peleador
	  * Regresa un booleano 
	  **/
	  public boolean esPeleador(){
	  	return objeto instanceof Peleador;
	  }
	  
	 /**
	  * Metodo para saber si Korby es peleador
	  * Regresa un booleano 
	  **/
	  public boolean esBolaFuego(){
	  	return objeto instanceof bolaFuego;
	  }
	 
	 
	 /**
	  * Implementacion metodo poder 
	  **/
	 public void ataca(Personaje b){
	 
	 	/** CASO NULO  **/
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
	 	  * Por idea de un amigo, llegamos a la conclusion que de si el atributo registrado es mayor a 65, no bajamos nada de salud.
	 	  * Mientras que si la defensa es menor a 65, podemos ver a la defensa como un ataque hacia el personaje donde perdemos un tercio 
	 	  * del total.  Si la defensa es igual a cero, bajamos puntos de vida. 
	 	  **/ 
	 	  
	 	 /**CASO 1: DEFENSA MAYOR A 65 - NO BAJAMOS PUNTOS**/
	 	 if(getDefensa() >= 65){
	 	 	setDefensa(getDefensa());
	 	 /**CASO 2: DEFENSA MAYOR A CERO - AL TOTAL LE RESTAMOS UN TERCIO DE SI MISMO**/
	 	 }else if(getDefensa() >= 10){
	 	 	setDefensa(getDefensa() - (getDefensa()/3));
	 	 }	
	  }
	  
	 private void realizarAtaque(Personaje b){
	 	/**
		 * ATAQUE SIN PODERES
		 * Si el personaje poder no tiene poderes, debe poder atacar. Sin embargo, tendra un valor predeterminado 
		 * independiente de la implementacion en otros metodos. 		 *
		 **/
		 //CASO 1: Korby no tiene un poder asociado 
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
	 	
	 	//CASO 2: Korby tiene algun poder asociado
	 	if(esEspadachin() || esPeleador() || esBolaFuego()){
	 	
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
