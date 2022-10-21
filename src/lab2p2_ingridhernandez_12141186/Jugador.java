/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Jugador {
    private String nombre;
    private String caracter;
    private int victoria;
    private int dinero;
    private ArrayList<Integer> item = new ArrayList ();

    public Jugador() {
    }

    public Jugador(String nombre, String caracter, int victoria, int dinero) {
        this.nombre = nombre;
        this.caracter = caracter;
        this.victoria = victoria;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Integer> getItem() {
        return item;
    }

    public void setItem(ArrayList<Integer> item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", caracter=" + caracter + ", victoria=" + victoria + ", dinero=" + dinero + ", item=" + item + '}';
    }
    
    
}
