/**
 * Interfaz especifica para poder concentrar a los poderes de Dittu
 * Solo los poderes de su saga se encargaran de implementarlo 
 ***/
 
public interface objetoEspecialDittu{
        /**
         * El metodo encargado de ser implementado por sus clases hijas sera 
         * la generacion del objeto. 
         **/
        public void ocupa();
        /**
         * Cada poder contara con la particularidad de que puedas recuperar el estatus de su 
         * defensa y ataque asignados; 
         **/
         public int recuperaNuevoAtaque();
         public int recuperaNuevaDefensa();
}


