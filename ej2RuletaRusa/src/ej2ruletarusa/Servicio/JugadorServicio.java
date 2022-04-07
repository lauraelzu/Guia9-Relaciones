/*
 */
package ej2ruletarusa.Servicio;

import ej2ruletarusa.Entidades.Jugador;
import ej2ruletarusa.Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //crear ArrayList de jugadores
    public ArrayList<Jugador> crearListaDeJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.println("Ingrese cantidad de jugadores. Máximo 6");
        int cantidad = leer.nextInt();
        
        if (cantidad>6){
            System.out.println("Cantidad máxima permitida 6 jugadores");
            cantidad = 6;
        }
        
        for (int i = 1; i < cantidad + 1; i++) {
            Jugador j = new Jugador(i);
            jugadores.add(j);
        }
        
        return jugadores;        
    }
    
    //muestra lista
    public void mostrarJugadores (ArrayList<Jugador> jugadores){
        System.out.println("Lista de jugadores");
        System.out.println("------------------");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);       //está definido el toString en la clase Jugador
        }
    }
       
    
    /*
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método   ????
devuelve true, sino false.
    rebautizado --> disparar
    */
    public boolean disparar(RevolverDeAgua r, Jugador j){
        
        RevolverServicio rs = new RevolverServicio();
        boolean seMojo = false;
        
        if(rs.mojar(r)){
            j.setMojado(true);
            seMojo = true;
        } 
        rs.pasarSiguientePosicion(r);
        return seMojo;
    }
}
