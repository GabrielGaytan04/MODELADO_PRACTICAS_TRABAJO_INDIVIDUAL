Segunda version de la pracica 1. 
Aproximacion del problema basado en la version 3 del diagrama de clases disponible junto con los archivos. 
(O no se, la verdad estoy programando esto a las 11 de la noche a dos dias de la fecha de entrega). 

Actualizacion: Ya estan disponibles los 3 personajes y cada uno cuenta con sus propias estrategias para evitar que 
un personaje de franquicia distinta obtenga poderes que no le correspondan. 

De hecho si quieres verificar que se cumpla la restriccion de poderes, ingresa el siguiente codigo y veras los siguientes errores en consola:
Si intentas marcar a un personaje con una interfaz que no le corresponde, la aplicacion no compila. Eso es exactamente el comportamiento que estamos buscando
		



              	/**Revision del funcionamiento del MegaBuster**/
		System.out.println("\nAhora Dittu procede a conseguir un objeto...");
		b.consigueObjeto(new transformacionMew());
		b.ocupaObjeto();
		
		/**Revision del funcionamiento del Arma electrica**/
		System.out.println("\nPero ahora Dittu se aburre y cambia de forma...");
		b.consigueObjeto(new transformacionPikachu());
		b.ocupaObjeto();
		
		/**Revision del funcionamiento del Escudo de Hojas**/
		System.out.println("\nFinalmente, Dittu tiene mala suerte!");
		b.consigueObjeto(new transformacionMagikarp());
		b.ocupaObjeto();



QUE FALTA?
-En la clase personaje: a) Un metodo de ataque | b) Un metodo de defensa
-En las clases hijas de personaje: la implementacion de los metodos abstractos

-Una clase de combate 

-Integrar los elementos del patron observer. 



Aqui una lista de los integrantes del equipo: 

Pérez Gaytán Ángel Gabriel 320052947

Gustavo Emir Jimenez Cruz 319260603

Jose Victor Hernandez Rodriguez 422033332


