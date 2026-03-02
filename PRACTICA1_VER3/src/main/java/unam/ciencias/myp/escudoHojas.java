/**
 * Segundo poder permitido de MeganMan
 * Implementa la interfaz objetoEspecialMeganMan. 
 **/
public class escudoHojas implements objetoEspecialMeganMan{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 15;
                /** Defensa **/ 
                private int d = 100;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora el escudo proteje a Meganman de un ataque enemigo!");
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





