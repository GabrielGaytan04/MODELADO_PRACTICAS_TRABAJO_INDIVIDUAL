Tercera version de la practica 
Aproximacion del problema basado en la version 3 del diagrama de clases disponible junto con los archivos. 
(O no se, la verdad estoy programando esto a las 11 de la noche a dos dias de la fecha de entrega). 

Actualizacion:

1) Ya estan disponibles los 3 personajes y cada uno cuenta con sus propias estrategias para evitar que 
un personaje de franquicia distinta obtenga poderes que no le correspondan. 

2) Los personajes cuentan con capacidad de atacar y defenderse

3) Se busco usar los metodos de las interfaces. Entonces solo tienes que editar los valores de ataque y defensa del personaje que desees agregar 

4) Los personajes cuentan con metodos booleanos que facilitan ciertas tareas de identificar poderes.

5) Para evitar que un personaje cargue con mas de un poder, se instauro un metodo de reinicio del objteo especial. 

6) En el metodo main de esta primera version de la practica, se puede entender el comportamiento de los personaje. 

7) Una clase de combate en la cual los personajes ya pueden tener peleas y  determinar ganadores asi como  perdedores 

8) Una clase Arena con espectadores a los cuales se les generan bitacoras. 

QUE FALTA?

-Integrar los elementos del patron observer (POR COMPLETO)
Aunque la mayoria de los elementos de observer se encuentren, falto agregar de forma convincente al metodo de actualizar dentro
de la clase arena. 

-Mejorar la forma en la que opera la generacion de bitacoras.
Aunque el programa ya genera las bitacoras para cada personaje, es en el archivo Tyler.txt donde podremos ver un archivo completo
Mientras que en las libretas de Kendrik, pacoAmoroso y catriel, solo veremos los resultados de la pelea. 

QUE VERSION DE JAVA SE USO?
open jdk 11.0.30. 

NOTAS DE LA PRACTICA 
1) No separe los archivos por paquetes. Entonces basta con entrar a la carpeta colocar el comando:
 
cd src/main/java/unam/ciencias/myp

Y compilar los archivos .java con el comando:
javac *.java 

Al menos desde mi experiencia pude probar mejor la aplicacion estando dentro de la carpeta myp
De la misma forma, hay elementos de la implementacion que pueden llegar a ser un poco pobres o que puedan tener una mejor implementacion. 
Esto se debe a que realice de forma individual el trabajo de 3 personas. Diagramas, programacion y casos de prueba. 

Planeacion y codigo realizados por:  Pérez Gaytán Ángel Gabriel 320052947
