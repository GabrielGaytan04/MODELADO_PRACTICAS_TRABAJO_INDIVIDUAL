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
	
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n------------------RECUPERACION DATOS PERSONAJES-----------------------"+
				    "\n--------------------------------------------------------------------");

		/**
		 * CREACION DE PELEADORES 
		 **/
		 
		//Creacion de un objeto Korby por omision 
                Korby d = new Korby();
                
		/** Creacion de un objeto Korby **/
		Korby a = new Korby(100,10,10);
		//Creacion de un objeto MeganMan
                MeganMan b = new MeganMan(70,70,70);
		//Creacion de un objeto Dittu
                Dittu c = new Dittu(99,99,99);
                
                /** Recuperacion datos basicos korby2 **/
		System.out.println("\n\nHola, mi nombre es:  " + d.getNombre() + "!");
		System.out.println("Mi vida es de: " + d.getVida() + " puntos!");
		System.out.println("Mi capacidad de ataque es de: " + d.getAtaque() + " puntos!");
		System.out.println("Mi capacidad de defensa es de: " + d.getDefensa() + " puntos!");
              
                /** Revision de poderes inicio pelea**/
                System.out.println("\nEn un inicio los personajes no deberian tener poderes");
                System.out.println("Korby tiene poder?: " + a.tienePoder());
                System.out.println("MeganMan tiene poder?: " + b.tienePoder());
                System.out.println("Dittu tiene poder?: " + c.tienePoder());
                System.out.println("Korby2 tiene poder?: " + d.tienePoder());
                
                /**
		 * Revision defensa 
		 **/
		 System.out.println("Korby2 bebio el cafe de MeganMan. MeganMan se enoja y ataca. Korby se defiende!");
		 System.out.println("La defensa Korby2 antes del ataque es:  " + d.getDefensa());
		 d.defenderse(b);
		 System.out.println("La defensa de Korby2 despues del ataque es: " + d.getDefensa());
                
                
                /** Recuperacion datos basicos korby **/
		System.out.println("Hola, mi nombre es:  " + a.getNombre() + "!");
		System.out.println("Mi vida es de: " + a.getVida() + " puntos!");
		System.out.println("Mi capacidad de ataque es de: " + a.getAtaque() + " puntos!");
		System.out.println("Mi capacidad de defensa es de: " + a.getDefensa() + " puntos!");
		
		
		//Recuperacion datos MeganMan
                System.out.println("\n\nHola, mi nombre es:  " + b.getNombre() + "!");
                System.out.println("Mi vida es de: " + b.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + b.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + b.getDefensa() + " puntos!");
                
                
                //Recuperacion datos Dittu
                System.out.println("\n\nHola, mi nombre es:  " + c.getNombre() + "!");
                System.out.println("Mi vida es de: " + c.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + c.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + c.getDefensa() + " puntos!");
                
      
                
                
                /**
		 * CALENTAMIENTO
		 **/
		 
		 System.out.println("\n-------------------------------------------------------------------"+
				    "\n---------------------CALENTAMIENTO-------------------------"+
				    "\n--------------------------------------------------------------------");
				   
		 System.out.println("\nEn una muestra de profesionalismo, Korby, MeganMan y Dittu realizan una demostracion a la audiencia!!!!");
		 
		 //Ataques
		 a.ataca(b);
		 b.ataca(c);
		 c.ataca(a);
		 
                
                /**
		 * REVISION PROPIEDADES DE 
		 * KORBY 
		 **/
		 
		 System.out.println("\n-------------------------------------------------------------------"+
				    "\n---------------------STATUS KIRBY------------------------"+
				    "\n--------------------------------------------------------------------");
                
       
		/** Recuperacion datos basicos korby **/
		System.out.println("Hola, mi nombre es:  " + a.getNombre() + "!");
		System.out.println("Mi vida es de: " + a.getVida() + " puntos!");
		System.out.println("Mi capacidad de ataque es de: " + a.getAtaque() + " puntos!");
		System.out.println("Mi capacidad de defensa es de: " + a.getDefensa() + " puntos!");
		
		/** Edicion de stats **/
		a.setVida(10);
		System.out.println("Tras un pequenio ajuste mi vida es: " + a.getVida() + " puntos!");
		
		
		/** Revision de un objeto korby sin objeto y quiera usarlo**/
		//a.ocupaObjeto();//Arroja una null pointer exception y ua no ejecuta el resto del codigo.
		
		/**Revision del funcionamiento de la espada**/
		System.out.println("\nAhora korby procede a conseguir un objeto...");
		a.consigueObjeto(new Espadachin());
		a.ocupaObjeto();
		System.out.println("Korby es espadachin?: " + a.esEspadachin());
		System.out.println("Korby es peleador?: " + a.esPeleador());
		System.out.println("Korby es bola de fuego?: " + a.esBolaFuego());
		

		System.out.println("Kirby pierde poder...");
		
		/**Reiniciamos al objeto**/
		a.reinicia();
		System.out.println("Korby tiene poder?: " + a.tienePoder());
		
		/**Revision del funcionamiento del peleador**/
		System.out.println("\nPero ahora Korby se transforma en otra cosa...");
		
		a.consigueObjeto(new Peleador());
		a.ocupaObjeto();
		System.out.println("Korby es espadachin?: " + a.esEspadachin());
		System.out.println("Korby es peleador?: " + a.esPeleador());
		System.out.println("Korby es bola de fuego?: " + a.esBolaFuego());
		
		
		System.out.println("Kirby pierde poder...");
		/**Reiniciamos al objeto**/
		a.reinicia();
		
		/**Revision del funcionamiento de la bola de fuego**/
		System.out.println("\nFinalmente, Korby consume algo inesperado!!!!");
		a.consigueObjeto(new bolaFuego());
		a.ocupaObjeto();
		System.out.println("Korby es espadachin?: " + a.esEspadachin());
		System.out.println("Korby es peleador?: " + a.esPeleador());
		System.out.println("Korby es bola de fuego?: " + a.esBolaFuego());
		
		/**Revision del funcionamiento de la verificacion de objeto**/
		System.out.println("\nA korby le da una crisis existencial y desea saber si carga con un objeto");
		System.out.println("Korby carga con un objeto?: " + a.tienePoder());
		
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n----------------------STATUS MEGANMAN-----------------------------"+
				    "\n--------------------------------------------------------------------");
		
		/**
		 * REVISION PROPIEDADES DE 
	  	 * MEGANMAN
	         **/
		
                //Recuperacion datos MeganMan
                System.out.println("\n\nHola, mi nombre es:  " + b.getNombre() + "!");
                System.out.println("Mi vida es de: " + b.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + b.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + b.getDefensa() + " puntos!");
                
                //Edicion de stats
                b.setVida(100);
                System.out.println("Tras un pequenio ajuste mi vida es: " + b.getVida() + " puntos!");

                
              	/**Revision del funcionamiento del MegaBuster**/
		System.out.println("\nAhora MeganMan procede a conseguir un objeto...");
		b.consigueObjeto(new megaBuster());
		b.ocupaObjeto();
		System.out.println("MeganMan obtuvo el megaBuster?: " + b.obtuvoMegaBuster());
		System.out.println("MeganMan obtuvo el escudo de hojas?: " + b.obtuvoEscudoHojas());
		System.out.println("MeganMan obtuvo el arma electrica??: " + b.obtuvoArmaElectrica());
		
		System.out.println("Meganman pierde poder...");
		/**Reiniciamos al objeto**/
		b.reinicia();
		
		/**Revision del funcionamiento del Arma electrica**/
		System.out.println("\nPero ahora MeganMan encuentra otra arma...");
		b.consigueObjeto(new armaElectrica());
		b.ocupaObjeto();
		
		System.out.println("MeganMan obtuvo el megaBuster?: " + b.obtuvoMegaBuster());
		System.out.println("MeganMan obtuvo el escudo de hojas?: " + b.obtuvoEscudoHojas());
		System.out.println("MeganMan obtuvo el arma electrica??: " + b.obtuvoArmaElectrica());
		
		
		System.out.println("Meganman pierde poder...");
		/**Reiniciamos al objeto**/
		b.reinicia();
		
		/**Revision del funcionamiento del Escudo de Hojas**/
		System.out.println("\nFinalmente, MeganMan necesita defenderse de algo inesperado!!!!");
		b.consigueObjeto(new escudoHojas());
		b.ocupaObjeto();
		
		System.out.println("MeganMan obtuvo el megaBuster?: " + b.obtuvoMegaBuster());
		System.out.println("MeganMan obtuvo el escudo de hojas?: " + b.obtuvoEscudoHojas());
		System.out.println("MeganMan obtuvo el arma electrica??: " + b.obtuvoArmaElectrica());
		
		
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n-----------------------STATUS DITTU--------------------------"+
				    "\n--------------------------------------------------------------------");
		
		/**
		 * REVISION DE PROPIEDADES 
		 * DITTU 
	         **/
	        
                //Recuperacion datos Dittu
                System.out.println("\n\nHola, mi nombre es:  " + c.getNombre() + "!");
                System.out.println("Mi vida es de: " + c.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + c.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + c.getDefensa() + " puntos!");
                //Edicion de stats
                c.setVida(1);
                System.out.println("Tras un pequenio ajuste mi vida es: " + c.getVida() + " puntos!");
                
                  
              	/**Revision del funcionamiento de Mew**/
		System.out.println("\nAhora Dittu procede a conseguir un objeto...");
		c.consigueObjeto(new transformacionMew());
		System.out.println("Dittu se transformo en Mew? " + c.esMew());
		System.out.println("Dittu se transformo en Pikachu?: " + c.esPikachu());
		System.out.println("Dittu se transformo en Magikarp: " + c.esMagikarp());
		c.ocupaObjeto();
		System.out.println("Dittu ataca a Korby!!!!");
		System.out.println("La salud de Korby antes del ataque es: " + b.getVida());
		c.ataca(a);
		System.out.println("La capacidad de ataque de Ditu es de..." + c.getAtaque() + " puntos!!!!");
		System.out.println("La salud de Korby ahora es: " + a.getVida());
		
		System.out.println("Dittu pierde poder...");
		/**Reiniciamos al objeto**/
		c.reinicia();
		
		
		/**Revision del funcionamiento de Pikachu**/
		System.out.println("\nPero ahora Dittu se aburre y cambia de forma...");
		c.consigueObjeto(new transformacionPikachu());
		System.out.println("Dittu se transformo en Mew? " + c.esMew());
		System.out.println("Dittu se transformo en Pikachu?: " + c.esPikachu());
		System.out.println("Dittu se transformo en Magikarp: " + c.esMagikarp());
		c.ocupaObjeto();
		System.out.println("Dittu ataca a MeganMan!!!!");
		System.out.println("La salud de Meganman antes del ataque es: " + b.getVida());
		c.ataca(b);
		System.out.println("La capacidad de ataque de Ditu es de..." + c.getAtaque() + " puntos!!!!");
		System.out.println("La salud de MeganMan ahora es: " + b.getVida());

		
		System.out.println("Dittu pierde poder...");
		c.ocupaObjeto();
		
		/**Reiniciamos al objeto**/
		c.reinicia();
		
		/**Revision del funcionamiento de Makikarp**/
		System.out.println("\nFinalmente, Dittu tiene mala suerte!");
		c.consigueObjeto(new transformacionMagikarp());
		c.ocupaObjeto();
		System.out.println("Dittu ataca a MeganMan OTRA VEZ !!!!");
		System.out.println("La salud de Meganman antes del ataque es: " + b.getVida());
		c.ataca(b);
		System.out.println("La capacidad de ataque de Ditu es de..." + c.getAtaque() + " puntos!!!!");
		System.out.println("La salud de Meganman ahora es: " + b.getVida());
		System.out.println("Dittu se transformo en Mew? " + c.esMew());
		System.out.println("Dittu se transformo en Pikachu?: " + c.esPikachu());
		System.out.println("Dittu se transformo en Magikarp: " + c.esMagikarp());

		
		System.out.println("Dittu pierde poder...");
		/**Reiniciamos al objeto**/
		c.reinicia();
		
                
          


	}
}
