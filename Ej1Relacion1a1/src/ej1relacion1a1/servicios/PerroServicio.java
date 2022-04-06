
package ej1relacion1a1.servicios;

import ej1relacion1a1.entidades.Perro;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
            
        Perro p = new Perro();

            System.out.println("Ingresar datos del perro");
            System.out.println("------------------------");
            System.out.println("Ingrese nombre: ");
            p.setNombre(leer.next());
            System.out.println("Ingrese raza: ");
            p.setRaza(leer.next());
            System.out.println("Ingrese edad: ");
            p.setEdad(leer.nextInt());
            System.out.println("Ingrese tamaño: ");
            p.setTamanio(leer.next());

            return p;
    }
    
    
}
