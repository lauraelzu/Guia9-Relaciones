
package ej3juegodecartas.Entidad;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> cartas = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    
}
