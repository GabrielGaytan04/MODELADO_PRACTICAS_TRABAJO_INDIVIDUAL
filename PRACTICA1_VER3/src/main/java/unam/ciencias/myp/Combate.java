import java.util.Random;

/**
 * Clase encargada de realizar los combates entre 3 personajes.
 **/

public class Combate{

	/**
	 * VARIABLES DE CLASE
	 * Necesitamos un objeto que represente a cada peleador. 
	 * De esa manera, podemos usar los metodos que programamos para ellos. 
	 **/

	private Korby primerPeleador;
	private  MeganMan segundoPeleador;
	private Dittu tercerPeleador;
	private String ganador; 

	/**
	 * CONSTRUCTORES
	 * Conviene que tengamos 2 constructores, uno por omision y otro parametrizado. 
	 * El de omision ahorrara tiempo y nos permitira hacer combates mas rapidos. 
	 * Y el segundo nos permitira usar peleadores ya existentes y queremos realizar 
	 * mas de un combate 
	 */
	
	/**CONSTRUCTOR POR OMISION**/ 
	public Combate(){
		this.primerPeleador = new Korby();
		this.segundoPeleador = new MeganMan();
		this.tercerPeleador = new Dittu();
	}
	/**CONSTRUCTOR PARAMETRIZADO**/
	public Combate(Korby a, MeganMan b, Dittu c){
		this.primerPeleador = a;
		this.segundoPeleador = b;
		this.tercerPeleador= c;
	}
	
	/**
	 * METODOS PELEA
	 * Una vez registrados los personajes, lo importante seria ponerlos a interactuar entre ellos. 
	 * Basta con mandar a llamar los metodos de ataque, defensa y configurar como los personajes obtienen  
	 * poderes a traves de los metodos de reinicio, obtencion y uso.
	 **/
	 
	 /** 
	  * modoBrutal:
	  * No nos interesa si los personajes tiene objetos, los personajes se golpean a muerte, donde cada impacto, 
	  * se ve reflejado en sus puntos de vida. Se puede decir que es un ciclo donde A golpea a B, B golpea a C
	  * y C golpea a A. Esto, hasta que la vida de alguno de los personajes sea igual a cero o menor a cero. 
	  * Y cuando digo menor a cero, estoy hablando de que el sistema va a modificar ese valor para que forzosamente sea igual a cero 
	  **/
	  
	 public String modoBrutal(){
	
		
		/**Variable de retorno donde se guardaran los datos del combate**/
	 	String retorno = "";
	 	
	 	retorno += "\nES HORA DE LA CARNICERIA!!!!!";
	 	
	 	/** Mensaje de Bienvenida **/
	 	System.out.println("ES HORA DE LA CARNICERIA!!!!!");
	 	
	 	/** Estructura de contol while **/
	 	while((primerPeleador.getVida() != 0) &&  (segundoPeleador.getVida() != 0) &&  (tercerPeleador.getVida() != 0)){
	 	
	 		/** Mensaje en terminal **/
			 System.out.println("\n-----------------------------------------------------------------------------------"+
				  	    "\n------------------------------MODO BRUTAL -----------------------------------------"+
				   	    "\n----------------------------------------------------------------------------------");
				   	    
			/**Agregamos al retorno**/
			retorno += "\n-----------------------------------------------------------------------------------"+
				    "\n------------------------------MODO BRUTAL -----------------------------------------"+
				    "\n----------------------------------------------------------------------------------";

	 	
	 		/** Ataques en secuencia **/
	 		primerPeleador.ataca(segundoPeleador);
	 		
	 		/** Mensaje en terminal **/
	 		System.out.println("\n\nEl ataque de " + primerPeleador.getNombre() + " hacia " + segundoPeleador.getNombre() + " es efectivo!");
	 		System.out.println("El nivel de salud de " + segundoPeleador.getNombre() + " es " + segundoPeleador.getVida());
	 		System.out.println(segundoPierde());
	 		
	 		
	 		/**Agregamos al retorno**/
	 		retorno += "\n\nEl ataque de " + primerPeleador.getNombre() + " hacia " + segundoPeleador.getNombre() + " es efectivo!";
	 		retorno += "\nEl nivel de salud de " + segundoPeleador.getNombre() + " es " + segundoPeleador.getVida(); 
	 		retorno += "\n" + segundoPierde();
	 		
	 		/** Mensaje en terminal **/
	 		segundoPeleador.ataca(tercerPeleador);
	 		System.out.println("\n\nEl ataque de " + segundoPeleador.getNombre() + " hacia " + tercerPeleador.getNombre() + " es efectivo!");
	 		System.out.println("El nivel de salud de " +  tercerPeleador.getNombre() + " es " + tercerPeleador.getVida());
	 		System.out.println(terceroPierde());
	 		
	 		/**Agregamos al retorno**/
	 		retorno += "\n\nEl ataque de " + segundoPeleador.getNombre() + " hacia " + tercerPeleador.getNombre() + " es efectivo!";
	 		retorno += "\nEl nivel de salud de " +  tercerPeleador.getNombre() + " es " + tercerPeleador.getVida();
	 		retorno += "\n" + terceroPierde();
	 		
	 		
	 		/**Mensaje en terminal **/
	 		tercerPeleador.ataca(primerPeleador);
	 		System.out.println("\n\nEl ataque de " + tercerPeleador.getNombre() + " hacia " + primerPeleador.getNombre() + " es efectivo!");
	 		System.out.println("El nivel de salud " + primerPeleador.getNombre()  + " es " + primerPeleador.getVida());
	 		System.out.println(primeroPierde());
	
	 		retorno += "\n\nEl ataque de " + tercerPeleador.getNombre() + " hacia " + primerPeleador.getNombre() + " es efectivo!";
	 		retorno += "\nEl nivel de salud " + primerPeleador.getNombre()  + " es " + primerPeleador.getVida();
	 		retorno += "\n" + primeroPierde();
	 	
	 		
	 	}
	 	return retorno += "\n" + ganadorCombate();
	 }
	 
	 /**
	  * modoPoderes
	  * Con este modo, lo que hacemos es elegir uno de los paquetes de poderes de cada personaje y con ello
	  * iniciamos los combates. Finalmente se reinician los valores para que los peleadores no carguen con un poder 
	  * por mas tiempo del necesario. 
	  **/
	 
	 public String modoPoderes(){
	 	
	 	/**
	 	 * Creamos cadena de texto que podamos usar como valor de retorno
	 	 **/
	 	 String retorno = " ";
	 
	 
	 	/**
		 * Creamos un valor pseudo aleatorio 	
		 **/
		Random aleatorio = new Random();
	 	int opcion = aleatorio.nextInt(4);
	 	
	 	/**
		 * Ocupamos un swith case para cada caso. 
		 *
		 * Caso 1: Llamamos al paquete 1
		 * Caso 2: Llamamos al paquete 2 
		 * Caso 3: Llamamos al paquete 3 
		 * default: modo brutal 
		 **/
		 
		 switch(opcion){
		 
		 	
		 	/**Caso paquete 1**/  
		 	case 1:
		 		/**Llamada al metodo paqueteUno **/
		 		paqueteUno();
		 		
		 		/** Estructura de contol while **/
				while((primerPeleador.getVida() != 0) && (segundoPeleador.getVida() != 0) && (tercerPeleador.getVida() != 0)){
				      
				       /**
					* Mensaje iteracion del combate 
					**/
				 	System.out.println("\n-----------------------------------------------------------------------------------"+
				   			   "\n------------------------------MODO DE COMBATE 1-----------------------------------"+
				    			   "\n----------------------------------------------------------------------------------");
				    			   
				    	/*Agregamos al retorno*/
				    	retorno += "\n-----------------------------------------------------------------------------------"+
				   			   "\n------------------------------MODO DE COMBATE 1-----------------------------------"+
				    			   "\n----------------------------------------------------------------------------------";
				    			  
					
					/**Revision de vida al comenzar la iteracion**/
					if((primerPeleador.getVida() == 0) ||(segundoPeleador.getVida() == 0) || tercerPeleador.getVida() == 0){
						System.out.println(primeroPierde());
						retorno += "\n" + primeroPierde();
						
						System.out.println(segundoPierde());
						retorno += "\n" + segundoPierde();
						
						System.out.println(terceroPierde());
						retorno += "\n" + terceroPierde();
						
						primerPeleador.reinicia();
						segundoPeleador.reinicia();
						tercerPeleador.reinicia();
					}
					
					/**Defensa primer peleador del segundo**/
					primerPeleador.defenderse(segundoPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(primerPeleador.getNombre() + " tiene " + primerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(primerPeleador.getNombre() + " tiene " + primerPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(primeroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre();
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + primeroPierde();


					/**Defensa del segundo peleador del tercero**/
					segundoPeleador.defenderse(tercerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(segundoPeleador.getNombre() + " se defiende de " + tercerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(segundoPeleador.getNombre() + " tiene " + segundoPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(segundoPeleador.getNombre() + " tiene " + segundoPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(segundoPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + segundoPeleador.getNombre() + " se defiende de " + tercerPeleador.getNombre();
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + segundoPierde();
					
					
					/**Defensa del tercer peleador del primero **/
					tercerPeleador.defenderse(primerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(tercerPeleador.getNombre() + " tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(tercerPeleador.getNombre() + " tiene " + tercerPeleador.getVida() + " puntos de vida restantes!");	
					System.out.println(terceroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre();
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + terceroPierde();
					
					
					
					
				}
				/**Terminado el while, reiniciamos los poderes de los personajes a nulo, el resto de los datos sigue igual**/
				primerPeleador.reinicia();
				segundoPeleador.reinicia();
				tercerPeleador.reinicia();
				
		 	break;
		 	
		 	/**Caso paquete 2**/ 
		 	case 2:
		 	
		 		/**Llamada al metodo paqueteDos**/
		 		paqueteDos();
		 		
		 		/** Estructura de contol while **/
				while((primerPeleador.getVida() != 0) && (segundoPeleador.getVida() != 0) && (tercerPeleador.getVida() != 0)){
				
				       /**
					* Mensaje iteracion del combate 
					**/
				 	System.out.println("\n-----------------------------------------------------------------------------------"+
				   			   "\n------------------------------MODO COMBATE 2 --------------------------------------"+
				    			   "\n----------------------------------------------------------------------------------");
				    			   
				    	/*Agregamos al retorno*/
				    	retorno += "\n-----------------------------------------------------------------------------------"+
				   			   "\n------------------------------MODO DE COMBATE 2-----------------------------------"+
				    			   "\n----------------------------------------------------------------------------------";
				
					/**Revision de vida al comenzar la pelea**/
					if((primerPeleador.getVida() == 0) ||(segundoPeleador.getVida() == 0) || tercerPeleador.getVida() == 0 ){
						System.out.println(primeroPierde());
						retorno += "\n" + primeroPierde();
						
						System.out.println(segundoPierde());
						retorno += "\n" + segundoPierde();
						
						System.out.println(terceroPierde());
						retorno += "\n" + terceroPierde();
					
						primerPeleador.reinicia();
						segundoPeleador.reinicia();
						tercerPeleador.reinicia();
						break;
					}
					
					/**Defensa del segundo peleador del tercer**/
					segundoPeleador.defenderse(tercerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(segundoPeleador.getNombre() + " se defiende de " + tercerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(segundoPeleador.getNombre() + " tiene " + segundoPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(segundoPeleador.getNombre() + " tiene " + segundoPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(segundoPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + segundoPeleador.getNombre() + " se defiende de " + tercerPeleador.getNombre();
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + segundoPierde();
					
					
					/**Defensa primer peleador del segundo**/
					primerPeleador.defenderse(segundoPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(primerPeleador.getNombre() + " tiene " + primerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(primerPeleador.getNombre() + " tiene " + primerPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(primeroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre();
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + primeroPierde();
					
					/**Defensa del tercer peleador del primero **/
					tercerPeleador.defenderse(primerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(tercerPeleador.getNombre() + " tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(tercerPeleador.getNombre() + " tiene " + tercerPeleador.getVida() + " puntos de vida restantes!");	
					System.out.println(terceroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre();
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + terceroPierde();
					
				}
				/**Terminado el while, reiniciamos los objetos de los personajes a nulo**/
				primerPeleador.reinicia();
				segundoPeleador.reinicia();
				tercerPeleador.reinicia();
		 		
		 	break;
		 	
		 	/**Caso paquete 3 **/
		 	case 3:
		 		/**Llamada al metodo paqueteTres**/
		 		paqueteTres();
		 		
		 		/** Estructura de contol while **/
				while((primerPeleador.getVida() != 0) && (segundoPeleador.getVida() != 0) && (tercerPeleador.getVida() != 0)){
				
				       /**
					* Mensaje iteracion del combate 
					**/
				 	System.out.println("\n-----------------------------------------------------------------------------------"+
				   			   "\n-------------------------------MODO COMBATE 3--------------------------------------"+
				    			   "\n----------------------------------------------------------------------------------");
				    			   
				    	/*Agregamos al retorno*/
				    	retorno += "\n-----------------------------------------------------------------------------------"+
				   			   "\n------------------------------MODO DE COMBATE 3-----------------------------------"+
				    			   "\n----------------------------------------------------------------------------------";
				
					/* Verificacion adicional al iniciar la iteracion*/
					if((primerPeleador.getVida() == 0) ||(segundoPeleador.getVida() == 0) || tercerPeleador.getVida() == 0 ){
						
						System.out.println(primeroPierde());
						retorno += "\n" + primeroPierde();
						
						System.out.println(segundoPierde());
						retorno += "\n" + segundoPierde();
						
						System.out.println(terceroPierde());
						retorno += "\n" + terceroPierde();
						
						primerPeleador.reinicia();
						segundoPeleador.reinicia();
						tercerPeleador.reinicia();
						break;
					}
					
					/**Defensa del tercer peleador del primero **/
					tercerPeleador.defenderse(primerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(tercerPeleador.getNombre() + "  tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(tercerPeleador.getNombre() + "  tiene " + tercerPeleador.getVida() + " puntos de vida restantes!");	
					System.out.println(terceroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + tercerPeleador.getNombre() + " se defiende de " + primerPeleador.getNombre();
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + tercerPeleador.getNombre() + " tiene " + tercerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + terceroPierde();
					
					/**Defensa del segundo peleador del tercer**/
					segundoPeleador.defenderse(tercerPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
					System.out.println(segundoPeleador.getNombre() + "  se defiende de " + tercerPeleador.getNombre());
					/**Puntos de vida del defensor**/
					System.out.println(segundoPeleador.getNombre() + "  tiene  " + segundoPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(segundoPeleador.getNombre() + "  tiene  " + segundoPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(segundoPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + segundoPeleador.getNombre() + " se defiende de " + tercerPeleador.getNombre();
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + segundoPeleador.getNombre() + " tiene " + segundoPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + segundoPierde();
					
					/**Defensa primer peleador del segundo**/
					primerPeleador.defenderse(segundoPeleador);
					/**Informacion del peleador que se defiende y quien lo ataca**/
				        System.out.println(primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre());
				        /**Puntos de vida del defensor**/
					System.out.println(primerPeleador.getNombre() + " tiene  " + primerPeleador.getDefensa() + " puntos de defensa restantes!");
					System.out.println(primerPeleador.getNombre() + " tiene  " + primerPeleador.getVida() + " puntos de vida restantes!");
					System.out.println(primeroPierde());
					
					/*Agregamos al retorno*/
					retorno += "\n" + primerPeleador.getNombre() + " se defiende de " + segundoPeleador.getNombre();
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getDefensa() + " puntos de defensa restantes!";
					retorno += "\n" + primerPeleador.getNombre() + " tiene " + primerPeleador.getVida() + " puntos de vida restantes!";
					retorno += "\n" + primeroPierde();

				
				}
				/**Terminado el while, reiniciamos los objetos de los personajes a nulo**/
				primerPeleador.reinicia();
				segundoPeleador.reinicia();
				tercerPeleador.reinicia();
		 	break;
		 	
		 	default:
		 	
		 		modoBrutal();
		 }
		 return retorno += "\n" + ganadorCombate();
	 }
	 
	 /**
	  * METODO PARA DETERMINAR AL GANADOR 
	  * Una vez finalizado el combate, deseo saber que peleador fue el ganador. 
	  * Entonces, basta con determinar quien sobrevivio con un mayor puntaje. Este es un problema de 
	  * 3 numeros, y la solucion no se me ocurrio directamente a mi. Sino que adopto el enfoque mas 
	  * practico que encontre en Geeks for Geeks.
	  * 
	  * Codigo Obtenido de:  Java Program to Find the Largest of three Numbers
	  * Link: https://www-geeksforgeeks-org.translate.goog/java/java-program-to-find-the-largest-of-three-numbers/?_x_tr_sl=en&_x_tr_tl=es&_x_tr_hl=es&_x_tr_pto=tc&_x_tr_hist=true
	  *   
	  **/
	  
	  /**
	   * Variable alto 
	   * Sirve para conocer el valor maximo de la pelea 
	   **/
	   

	  
	  public String ganadorCombate(){
	  
	        int alto = Math.max(Math.max(primerPeleador.getVida(),segundoPeleador.getVida()),tercerPeleador.getVida());
	  	
	  	/**CASO 1: El ganador es el primer peleador **/
	  	if(alto == primerPeleador.getVida()){
	  		return "El ganador del combate fue: " + primerPeleador.getNombre();
	  	}
	  	
	  	/**CASO 2: El ganador es el segundo peleador**/
	  	if(alto == segundoPeleador.getVida()){
	  		return "El ganador del combate fue: " + segundoPeleador.getNombre();
	  	}
	  	/**CASO 3: El peleador es el tercer peleador**/
	  	if(alto == tercerPeleador.getVida()){
	  		return "El ganador del combate fue: " + tercerPeleador.getNombre();
	  	}
	  	return "Eso es todo amigos!";
	  }
	  
	  
	  /**
	   * METODOS BOOLEANOS PARA DETERMINAR PERDEDORES 
	   * Estoy consciente de que declarar variables por cada metodo es un desperdicio en terminos de optimizacion
	   * y limpieza, pero fue la solucion mas rapida que se me ocurrio para que en la arena sea mas facil 
	   * notificar a los usuarios de los resultados del combate. 
	   **/
	   
	  public boolean primeroPerdedor(){
	  	  int alto = Math.max(Math.max(primerPeleador.getVida(),segundoPeleador.getVida()),tercerPeleador.getVida());
	  	return primerPeleador.getVida() != alto;
	  }
	  public boolean segundoPerdedor(){
	  	  	  int alto = Math.max(Math.max(primerPeleador.getVida(),segundoPeleador.getVida()),tercerPeleador.getVida());
	  	return segundoPeleador.getVida() != alto;
	  }
	  public boolean terceroPerdedor(){
	  	  	  int alto = Math.max(Math.max(primerPeleador.getVida(),segundoPeleador.getVida()),tercerPeleador.getVida());
	  	return tercerPeleador.getVida() != alto;
	  }

	  
	 
	 
	 
	 /**
	  * SECCION DE METODOS AUXILIARES
	  * Bueno, estos son detalles que un usuario no va a necesitar modificar en la arena de combate jaja.
	  * Ademas, realmente su unico uso es en esta clase. En la aplicacion, nos debemos de limitar a llamar a los 
	  * metodos de combate y resultado
	  **/
	 
	 /**
	  * MCOLECCIONES DE PODERES
	  * Por falta de tiempo no puedo hacer una implementacion mas elaborada de objetos,
	  * pero la idea es esta. Tenemos 3 paquetes de poderes, y cada paquete tiene poderes
	  * diferentes para cada uno de los peleadores, La idea es que elijamos de forma pseudo-aleatoria
	  * un paquete de acuerdo a un numero entre el uno y el 3 en un metodo de combate con objetos.
	  **/ 
	   
	  private void paqueteUno(){
	  
	  	/**El objeto korby sera un espadachin**/
	  	primerPeleador.consigueObjeto(new Espadachin());
	  	primerPeleador.ocupaObjeto();
	  	
	  	/**El objeto MeganMan obtendra un megaBuster**/
	  	segundoPeleador.consigueObjeto(new megaBuster());
	  	segundoPeleador.ocupaObjeto();
	  	
	  	/**El objeto Dittu se transformara en Mew**/
	  	tercerPeleador.consigueObjeto(new transformacionMew());
	  	tercerPeleador.ocupaObjeto();
	  }
	  
	  	   
	  private void paqueteDos(){
	  
	  	/**El objeto korby sera un Peleador**/
	  	primerPeleador.consigueObjeto(new Peleador());
	  	primerPeleador.ocupaObjeto();
	  	
	  	/**El objeto MeganMan obtendra un arma electrica**/
	  	segundoPeleador.consigueObjeto(new armaElectrica());
	  	segundoPeleador.ocupaObjeto();
	  	
	  	/**El objeto Dittu se transformara en un magikarp**/
	  	tercerPeleador.consigueObjeto(new transformacionMagikarp());
	  	tercerPeleador.ocupaObjeto();
	  }
	  
	  	  	   
	  private void paqueteTres(){
	  
	  	/**El objeto korby sera un Peleador**/
	  	primerPeleador.consigueObjeto(new bolaFuego());
	  	primerPeleador.ocupaObjeto();
	  	
	  	/**El objeto MeganMan obtendra un arma electrica**/
	  	segundoPeleador.consigueObjeto(new escudoHojas());
	  	segundoPeleador.ocupaObjeto();
	  	
	  	/**El objeto Dittu se transformara en un magikarp**/
	  	tercerPeleador.consigueObjeto(new transformacionPikachu());
	  	tercerPeleador.ocupaObjeto();
	  }
	  
	  
	  
	 /**
	  * METODOS STRING PARA INDICAR EL VALOR DE VIDA DE UN PERSONAJE 
	  * Sirven para saber cuando es que el personaje tiene vida cero 
	  * Ademas, por la naturaleza del constructor Personaje, los valores 
	  * agregados son del tipo Random. Con ello, pueden hacer casos donde 
	  * haya mas de un perdedor y debamos dicernir quien es el ganador
	  **/
	  
	 private String primeroPierde(){
	 	if(primerPeleador.getVida() == 0){
	 		return "El primer peleador PIERDE!";

	 	}
	 	return "El primer peleador sigue en pie";
	 }
	 
	 private String segundoPierde(){
	 	if(segundoPeleador.getVida() == 0){
	 		return "El segundo peleador PIERDE!";

	 	}
	 	return "El segundo peleador sigue en pie";
	 }
	 private String terceroPierde(){
	 
		if(tercerPeleador.getVida() == 0){
	 		return "El tercer peleador PIERDE!";

	 	}
	 	return "El tercer peleador sigue en pie";
	 }
	 
	
}
