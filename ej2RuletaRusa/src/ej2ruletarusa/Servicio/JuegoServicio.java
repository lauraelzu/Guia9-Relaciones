/*
 */
package ej2ruletarusa.Servicio;

import ej2ruletarusa.Entidades.Juego;
import ej2ruletarusa.Entidades.Jugador;
import ej2ruletarusa.Entidades.RevolverDeAgua;
import java.util.ArrayList;

public class JuegoServicio {
    
    /*
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
    */
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
        Juego j = new Juego();
        
        j.setJugadores(jugadores);
        j.setRevolver(r);
    }
    
    /*
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
si no se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    rebautizado --> jugar1Ronda
    */
    public boolean jugar1Ronda(ArrayList<Jugador> jugadores, RevolverDeAgua r){
        
        JugadorServicio js = new JugadorServicio();
        
        for (Jugador jugad : jugadores) {
            if(js.disparar(r, jugad)){
                System.out.println("FIN DEL JUEGO - Se mojó el " + jugad);
               return true;
            }
            //***********para control
            System.out.println(jugad);
        }
        return false;
    }
}
