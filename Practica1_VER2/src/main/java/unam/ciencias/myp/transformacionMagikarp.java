/**
 * Segundo poder permitido de Dittu  
 * Implementa la interfaz objetoEspecialDittu. 
 **/
public class transformacionMagikarp implements objetoEspecialDittu{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 0;
                /** Defensa **/ 
                private int d = 0;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora Dittu es el chinpokomon mas patetico y parodiado. LASTIMA MARGARITO ");
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




