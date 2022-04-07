/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente
 */
package ej2ruletarusa.Entidades;

public class RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

     /*
    • toString(): muestra información del revolver (posición actual y donde está el agua)
    */
    @Override
    public String toString() {
        return "{ Posición actual del tambor = " + posicionActual + " Posición del agua = " + posicionAgua + '}';
    }
    
    
}
