/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package ej1relacion1a1;

import ej1relacion1a1.entidades.Perro;
import ej1relacion1a1.entidades.Persona;
import ej1relacion1a1.servicios.PerroServicio;
import ej1relacion1a1.servicios.PersonaServicio;

public class Ej1Relacion1a1 {

    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        PerroServicio pes = new PerroServicio();
        
        Persona pers1 = ps.crearPersona();
        Perro perro1 = pes.crearPerro();
        pers1.setMascota(perro1);   //vincular el perro1 a la persona1
        
        Persona pers2 = ps.crearPersona();
        Perro perro2 = pes.crearPerro();
        pers2.setMascota(perro2);    //vincular el perro2 a la persona
        
        ps.mostrar(pers1);
        ps.mostrar(pers2);
        
        
        
    }
    
}
