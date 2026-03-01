/**
 * Segundo poder permitido de Dittu  
 * Implementa la interfaz objetoEspecialDittu. 
 **/
public class transformacionPikachu implements objetoEspecialDittu{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 50;
                /** Defensa **/ 
                private int d = 25;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora Dittu es el personaje mas rentable de la franquicia!!! PIKA PIKA ");
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




