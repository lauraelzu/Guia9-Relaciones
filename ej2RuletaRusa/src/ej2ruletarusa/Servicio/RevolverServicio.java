/*
 */
package ej2ruletarusa.Servicio;

import ej2ruletarusa.Entidades.RevolverDeAgua;
import java.util.Scanner;

public class RevolverServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
    */
    public RevolverDeAgua llenarRevolver(){
        
        RevolverDeAgua r = new RevolverDeAgua();
        
        r.setPosicionActual((((int) (Math.random()*6)) + 1));
        r.setPosicionAgua((((int) (Math.random()*6)) + 1));
        
        return r;
    }
    
    /*
    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    */
    public boolean mojar(RevolverDeAgua r){
        if(r.getPosicionActual() == r.getPosicionAgua()){
            return true;
        } else{
            return false;
        }
        
        //o simplemente
        //return(r.getPosicionActual() == r.getPosicionAgua())
    }
    
    /*
    • siguienteChorro(): cambia a la siguiente posición del tambor
    rebautizado --> pasarSiguientePosicion
    */
    public void pasarSiguientePosicion(RevolverDeAgua r){
        if(r.getPosicionActual()<6){
           r.setPosicionActual(r.getPosicionActual()+1); 
        }else{
            r.setPosicionActual(1); //si la pos actual es 6 
        }
        
    }
    
   
}
