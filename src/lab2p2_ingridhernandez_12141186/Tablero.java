/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Tablero {
    Object [][] tablero = new Object[30][30];

    public Tablero() {
        imprimirTablero(0, 0);
    }
  
    
    
    public void imprimirTablero(int filas, int columnas) {
        if (filas == tablero.length - 1 && columnas == tablero[0].length - 1) {
            System.out.printf("[%c]%n", tablero[filas][columnas]);
        } else {
            //Salto de Linea
            if (columnas == tablero[0].length - 1) {
                System.out.printf("[%c]%n", tablero[filas][columnas]);
                imprimirTablero(filas + 1, 0);
            } else {
                System.out.printf("[%c] ", tablero[filas][columnas]);
                imprimirTablero(filas, columnas + 1);
            }//fin if
        }//fin else
    }//fin metodo
  
}
