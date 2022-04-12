/*
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
y un palo (espadas, bastos, oros y copas). 
Esta clase debe contener un método toString() que retorne el número de carta y el palo. 
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
package ej3juegodecartas.Entidad;

import ej3juegodecartas.Enumeraciones.Palo;

public class Carta {
    private Integer numero;
    private Palo palo;   //atributo es del tipo de dato enumeracion "Palo"

    public Carta() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;  //modificado
    }
    
    
}
