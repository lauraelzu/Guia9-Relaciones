/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente
 */
package ej3juegodecartas;

import ej3juegodecartas.Entidad.Baraja;
import ej3juegodecartas.Entidad.Carta;
import ej3juegodecartas.Servicio.BarajaServicio;
import java.util.ArrayList;
import java.util.Scanner;


public class Ej3JuegoDeCartas {

    public static void main(String[] args) {
        
        BarajaServicio bs = new BarajaServicio();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        
        
        //armar y mostrar baraja
        
        ArrayList<Carta> b = bs.crearBaraja();
        ArrayList<Carta>monton = new ArrayList<Carta>();
      
        bs.mostrarBaraja(b); 
        
        //mezclar y mostrar
        
        bs.barajar(b);
        
        bs.mostrarBaraja(b); 
        
        bs.menu();
        int opcion = leer.nextInt();
        
        while(opcion<6){
            switch (opcion){
                case 1:
                    bs.siguienteCarta(b);
                    break;
                case 2:
                    bs.cartasDisponibles(b);
                    break;
                case 3:
                    bs.darCartas(b, monton);
                    break;
                case 4:
                    bs.mostrarMonton(monton);
                    break;
                case 5:
                    bs.mostrarBaraja(b);
                    break;
            }
            bs.menu();
            opcion = leer.nextInt();
        }
        
        
    }
    
}
