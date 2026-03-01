/**
 * Tercer poder permitido de MeganMan
 * Implementa la interfaz objetoEspecialMeganMan. 
 **/
public class  megaBuster implements objetoEspecialMeganMan{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 50;
                /** Defensa **/ 
                private int d = 50;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("MeganMan ahora puede realizar disparos mas peligrosos!");
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


