/**
 * Clase encargada de ejecutar el codigo del programa
 * En este momento el programa solo puede hacer un par de propiedades basicas de los personajes.  
 * Aunque realmete la app actual cumple con ser una version temprana de combate
 **/

public class App{

	/**
	 * NOTA: Temporalmente estamos probando que las piezas del programa funcionen bien.
	 * Por lo cual podras notar variables de un tipo de datos que servira mas en otra 
	 * clase. Agradecemos su comprension. 
	 **/

	/**
	 * METODO MAIN: Encargado de ejecutar el codigo 
	 **/
	public static void main(String[] args) {


		     System.out.println("\n-----------------------------------------------------------------------------------"+
				    "\n-----------------------ARENA Y CREACION DE PELEAS-----------------------------------"+
				    "\n------------------------------------------------------------------------------------");
				    
		     /**
		      * CREACION DE UNA ARENA 
		      * Uno de mis escenarios favoritos es el de Game boy. Estaba en la version de nintendo 3DS de Super Smash Bros.
		      * Desconozco si estaba en otras versiones.
	              **/
		     Arena escenarioGameBoy = new Arena();
		     
		     /**
		      * Creacion de 4 espectadores
		      * Seria poco profesiona y academico colocar como espectadores a algunos de los musicos que mas escucho?
		      * No lo se... estoy en la facultad de ciencias y perderia respeto... ES CHISTE, HAGAMOSLO!!!!!
		      **/
		      
		     Espectador tyler = new Espectador("Tyler","Dittu");
		     Espectador kendrik = new Espectador("Kendrik", "Korby");
		     Espectador pacoAmoroso = new Espectador("pacoAmoroso", "Dittu");
		     Espectador catriel = new Espectador("catriel", "MeganMan");
		     
		     /**
		      * AGREGAR ELEMENTOS AL ESCENARIO 
		      **/
		     escenarioGameBoy.registrar(tyler);
		     escenarioGameBoy.registrar(kendrik);
		     escenarioGameBoy.registrar(pacoAmoroso);
		     escenarioGameBoy.registrar(catriel);
		     
		     /**
		      * VERIFICAR LA EXISTENCIA DE LOS DOS ELEMENTOS 
		      **/
		      System.out.println(escenarioGameBoy.primero() + " se ha unido a la transmision");
		      System.out.println(escenarioGameBoy.ultimo() + " se ha unido a la transmision");
		     
		     /**
		      * CREAR BITACORAS
		      **/
		      escenarioGameBoy.creaBitacoras();
		 
	}

}
