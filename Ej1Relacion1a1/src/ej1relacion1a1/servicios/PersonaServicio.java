/*

 */
package ej1relacion1a1.servicios;

import ej1relacion1a1.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona p = new Persona();
        
        System.out.println("Ingresar datos de la persona");
        System.out.println("----------------------------");
        System.out.println("Ingrese nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese apellido: ");
        p.setApellido(leer.next());
        System.out.println("Ingrese edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese DNI: ");
        p.setDni(leer.nextInt());
        
        return p;
    }
    
    
    public void mostrar(Persona p){
        System.out.println("Datos de la persona y su perro");
        System.out.println("------------------------------");
        System.out.println("Nombre y apellido: " + p.getNombre() + " " + p.getApellido());
        System.out.println("Edad: " + p.getEdad() + " - DNI: " + p.getDni());
        System.out.println("Mascota: " + p.getMascota());
    }
}
