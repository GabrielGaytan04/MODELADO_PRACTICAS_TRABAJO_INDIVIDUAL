import java.util.Random;

/**
 * Clase encargada de ser el molde para los personajes de nuestro 
 * videojuego de peleas. Es abstracta con el fin de encapsular 
 * ciertos comportamientos  relacionados a la capacidad de ataque \
 * y de defensa asociados a cada peleador permitido. 
 **/
abstract class Personaje {

	/**	
	 * Atributos de clase
	 * Por practicidad, elegimos trabajar con valores enteros.
	 * Pero estos valores sera aleatorios (para hacer el combate mas interesante).
	 * 
	 * Aun asi, elegi valores aleatorios porque solucionaban un problema. Si a todos  
	 * los valores les asignas un mismo numero, en el modo de combate brutal, no hay 
	 * ganadores, por lo cual necesitamos que no sea tan facil que todos pierdan.
	 *	
	 * Para entender mejor el uso de random, busque en el siguiente articulo: Usando Math.random en Java
	 * https://ironpdf.com/es/java/blog/java-help/mate-random-java/
	 *
	 **/
	private int vida;
	private int ataque;
	private int defensa;
	private Random aleatorio = new Random();


	/**
	 * Constructor por omision 
	 * Diseniamos a un personje con parametros dados para ahorrar tiempo a la hora de realizar los 
	 * combates.
	 **/
	 public Personaje(){
	 	this.vida = aleatorio.nextInt(50);
	 	this.ataque = aleatorio.nextInt(50);
	 	this.defensa = aleatorio.nextInt(50); 
	 }
	 
	/**
	 * Constructor parametrizado 
	 * Necesitamos un constructor del que las clases hijas se puedan nutrir (Prometemos que esti 
	 * no lo escribio una IA aunque parezca), mas bien es nuestra manera de entender la utilidad de un 
	 * constructor para una clase abstracta.
	 **/
	public Personaje(int vida, int ataque, int defensa) {

		if ( (vida < 0) || (ataque < 0) || (defensa < 0) ){
			this.vida = 0;
			this.ataque = 0;
			this.defensa = 0;	
		}


		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	/**
	 * Metodos de edicion de elementos 
	 * En algunas de las clases hijas, necesitaremos editar ataque, defensa o vida, 
	 * por eso necesitaremos algunos setters 
	 **/

	/**SETTERS**/
	public void setVida(int vida) {
	
		if(vida >= 500){
			throw new IllegalArgumentException("No uedes ingresar un nivel de vida tan alto!");
		}
		
		if(vida < 0){
			this.vida = 0;
		}else{

		this.vida = vida;
		}
	}

	public void setAtaque(int ataque) {
		/**
		 * Excepcion en caso de entrada no valida
		 **/
		if(ataque < 0)
			throw new IllegalArgumentException("No uedes ingresar un ataque menor a cero o nulo");
		this.ataque = ataque; 
	}

	public void setDefensa(int defensa) {
		/**
		 * Excepcion en caso de entrada no valida
		 **/
		if(defensa < 0){
			this.defensa = 0; 
		}else{
			
		this.defensa = defensa;} 
	}

	/**
	 * Metodos para obtener acceso a la variable 
	 * En clases de lectura, necesitaremos poder visualizar los valores que tengamos
	 **/ 

	/**GETTERS**/
	public int getVida() {	
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	
	
	 /** Atacar a un personaje **/
	 public abstract void ataca(Personaje b);
	 
	 /** Defenderse de un personaje **/
	 public abstract void defenderse(Personaje b);
	
	
}
