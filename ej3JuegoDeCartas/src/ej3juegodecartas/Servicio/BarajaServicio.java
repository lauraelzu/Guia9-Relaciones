package ej3juegodecartas.Servicio;

import ej3juegodecartas.Entidad.Carta;
import ej3juegodecartas.Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BarajaServicio {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   
    //***********crea Baraja
   
    public ArrayList<Carta> crearBaraja(){
        
        ArrayList<Carta> b = new ArrayList();
        
        System.out.println("Creando la baraja...");
        
        for (Palo palo : Palo.values()) {
            for (int i = 1; i < 11; i++) {
                Carta c = new Carta();      //se crearán 40 objetos Carta
                c.setPalo(palo);
                if(i>7){
                    c.setNumero(i+2);  //no incluye 8 y 9
                }else{
                    c.setNumero(i);
                } 
                b.add(c);            //se guardan en el ArrayList
            }
        }
        return b;  
    } 
    
    
    /*
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
    */

    public void mostrarBaraja(ArrayList<Carta> b){
        
        System.out.println("\nMostrando la baraja...\n");
        
        
        for (int i = 0; i < 37; i+=4) {                //10 filas
               for (int j=0; j<4; j++){                   //4 columnas
                  if((i+j)<b.size()){                  //si quedan cartas que las muestre (evitar error OutBound!!!!)
                      System.out.print(b.get(i+j) + "    ");   
                  }
               }
               System.out.println("");  
        }
    }
    
    /*
    • barajar(): cambia de posición todas las cartas aleatoriamente
    */
    public void barajar(ArrayList<Carta> b){
        System.out.println("\nBarajando...\n");
        Collections.shuffle(b);
    }
    
    
    /*
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
    */
    public void siguienteCarta(ArrayList<Carta> b){
        System.out.println("\nMostrando la próxima carta...");
        if (b.isEmpty()){
            System.out.println("No hay más cartas");
        } else {
            System.out.println("Próxima carta " + b.get(0) +"\n");
        }
    }
    
       
    /*
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
*/
    public void cartasDisponibles(ArrayList<Carta> b){
        System.out.println("Quedan " + b.size() + " cartas en la baraja\n");
    }
    
    
    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
    */
    
    public void darCartas(ArrayList<Carta> b, ArrayList <Carta> monton){
        System.out.println("Cuántas cartas quiere?");
        int cant = leer.nextInt();
        if (b.isEmpty()){
            System.out.println("No hay más cartas");
        } else if(cant<=b.size()){
            for(int i=0;i<cant;i++ ){         //itera "cant" veces
              System.out.println(b.get(0));      //muestra 1° carta de la lista!!!
              monton.add(b.get(0));              //agrega en el monton
              b.remove(0);                       //elimina 1° carta de la lista!!!
            }    
        
          }else {
            System.out.println("No queda la cantidad suficiente");
        }
        
    }
   
    
    
    /*
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
    */
    
     public void mostrarMonton(ArrayList<Carta> b){
        
        System.out.println("\nMostrando cartas del montón...\n");
        
        for (int i = 0; i < 37; i+=4) {                //10 filas
               for (int j=0; j<4; j++){                   //4 columnas
                  if((i+j)<b.size()){                  //si quedan cartas que las muestre (evitar error OutBound)
                      System.out.print(b.get(i+j) + "    ");   
                  }
               }
               System.out.println("");  
        }
    }   
     
     
     
     
     public void menu(){
        System.out.println("\n*********MENÚ***********\n");
        System.out.println("1 Ver próxima carta");
        System.out.println("2 Saber cuántas cartas quedan en la baraja");
        System.out.println("3 Pedir cartas");
        System.out.println("4 Mostrar cartas entregadas");
        System.out.println("5 Mostrar cartas de la baraja");
        System.out.println("6 Salir");
     }
    
}
