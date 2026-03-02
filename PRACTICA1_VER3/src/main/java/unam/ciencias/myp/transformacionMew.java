/**
 * Primer poder permitido de Dittu  
 * Implementa la interfaz objetoEspecialDittu. 
 **/
public class transformacionMew implements objetoEspecialDittu{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 100;
                /** Defensa **/ 
                private int d = 100;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora Dittu es un chinpokomon legendario!!!! OSTIA MANOLO");
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




