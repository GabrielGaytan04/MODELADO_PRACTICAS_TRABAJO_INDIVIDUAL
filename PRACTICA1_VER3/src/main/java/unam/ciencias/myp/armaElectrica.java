/**
 * Primer poder permitido de MeganMan
 * Implementa la interfaz objetoEspecialMeganMan. 
 **/
public class armaElectrica implements objetoEspecialMeganMan{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 100;
                /** Defensa **/ 
                private int d = 20;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora MeganMan dispara un rayo electrico!");
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






