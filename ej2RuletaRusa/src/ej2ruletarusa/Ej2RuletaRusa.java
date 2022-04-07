/*
Ruleta Rusa de agua
 */
package ej2ruletarusa;

import ej2ruletarusa.Entidades.Jugador;
import ej2ruletarusa.Entidades.RevolverDeAgua;
import ej2ruletarusa.Servicio.JuegoServicio;
import ej2ruletarusa.Servicio.JugadorServicio;
import ej2ruletarusa.Servicio.RevolverServicio;
import java.util.ArrayList;

public class Ej2RuletaRusa {

    public static void main(String[] args) {
        
        JugadorServicio js = new JugadorServicio();
        JuegoServicio jus = new JuegoServicio();
        RevolverServicio rs = new RevolverServicio();
        
        // crea lista
        ArrayList<Jugador> jugadores= js.crearListaDeJugadores();
        
        //muestra lista
        js.mostrarJugadores(jugadores);
        
        //cargar revolver
        RevolverDeAgua r = rs.llenarRevolver();
        
        //mostrar revolver
        System.out.println("Revolver cargado: " + r);

        //iniciar juego
        jus.llenarJuego(jugadores, r);
        
        //rondas
        while(!jus.jugar1Ronda(jugadores, r)){
            System.out.println("pasan a la siguiente ronda");
        }
 
    }
    
}
