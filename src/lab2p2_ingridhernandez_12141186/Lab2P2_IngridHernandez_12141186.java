/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Lab2P2_IngridHernandez_12141186 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);

        boolean centinela = true;
        ArrayList jugadores = new ArrayList();
        ArrayList bot = new ArrayList();

        while (centinela == true) {
            System.out.println("==========Menu=========");
            System.out.println("0)Salir");
            System.out.println("1)Agregar Jugador");
            System.out.println("2)Bot");
            System.out.println("3)Agregar Item a Juagdor");
            System.out.println("4)Jugar");
            System.out.println("5)listar Jugador");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Agregar Jugador");
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nom = lea.next();
                    System.out.println("Ingrese el Caracter(minusculas) que represente al Jugador: ");
                    String cara = lea.next();
                    System.out.println("Ingrese cuantas Victorias tiene el jugador: ");
                    int vict = lea.nextInt();
                    System.out.println("Ingrese la cantidad de dinero que tiene el Jugador: ");
                    int din = lea.nextInt();
                    jugadores.add(new Jugador(nom, cara, vict, din));

                }//fin del case 1
                break;
                case 2: {
                    System.out.println("Crear Bot");
                    System.out.println("Ingrese la velocidad del Bot: ");
                    int velo = lea.nextInt();
                    System.out.println("Ingrese el Caracter(mayusculas) que represente al Bot:");
                    String caract = lea.next();
                    System.out.println("Ingrese el Aspecto del Bot: ");
                    String asp = lea.next();
                    System.out.println("Ingrese el Audio del Bot: ");
                    String aud = lea.next();
                    System.out.println("Ingrese el Audio post mortem: ");
                    String post = lea.next();
                    bot.add(new Bot(velo, caract, asp, aud, post));
                    System.out.println(bot);
                }//fin del case 2
                break;
                case 3: {
                    System.out.println("Agregar Item");

                    System.out.println("Ingrese la posicion del Jugador:");
                    int p = lea.nextInt();
                    if (jugadores.get(p) instanceof Jugador ) {
                    boolean centinela1 = true;

                        while (centinela1 == true) {
                            System.out.println("==========Submenu===============");
                            System.out.println("1)Cola");
                            System.out.println("2)Aceleracion");
                            System.out.println("3)Mina");
                            System.out.println("4)Iluminador");
                            System.out.println("5)Detector");
                            System.out.println("6)salir");
                            System.out.println("================================");
                            System.out.println("Ingrese la opcion que desea: ");
                            int op1 = lea.nextInt();
                            switch (op1) {
                                case 1: {
                                    String poiuyt= "Cola";
                                    int qwert = 60;
                                   ((Jugador) jugadores.get(p)).getItem().add(poiuyt);
                                }//fin del case 1
                                break;
                                case 2: {
                                    String poiuy = "Aceleracion";
                                    int qwer = 60;
                                    ((Jugador) jugadores.get(p)).getItem().add(poiuy);
                                }//fin del case 2
                                break;
                                case 3: {
                                String poiu= "Mina";
                                    int qwe = 60;
                                   ((Jugador) jugadores.get(p)).getItem().add(poiu);
                                }//fin del case 3
                                break;
                                case 4:{
                                   String poi= "Iluminado";
                                    int qw = 60;
                                   ((Jugador) jugadores.get(p)).getItem().add(poi); 
                                }
                                break;
                                
                                case 5:{
                                    String po= "Detector";
                                    int q = 60;
                                   ((Jugador) jugadores.get(p)).getItem().add(po);
                                }
                                break;
                                case 6:
                                    centinela1 = false;
                                    break;

                                default:
                                    System.out.println("Opcion Incorrecta");
                            }//fin del switch
                        }//fin while
//                    
                    }

                }//fin del case 3
                break;
                case 4: {
                    
                    char resp = 's';
                    System.out.println();
                    while (resp == 's' || resp == 'S') {
                        Object[][] tablero = new Object[30][30];
                        tablero = llenar();
                        imprimirTablero(tablero);
                        System.out.println("Desea continuar?");
                        resp = lea.next().charAt(0);
                    }//fin del while
                }//fin del case 3
                break;
                case 5: {
                    String salida = "";
                    for (Object t : jugadores) {
                        if (t instanceof Jugador) {
                            salida += jugadores.indexOf(t) + "- " + t + "\n";
                        }

                    }
                    System.out.println(salida);
                }

                break;
                case 0:
                    centinela = false;
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }//fin del switch
        }//fin while
    }

    public static void imprimirTablero(Object[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("[ ]");
            }
           System.out.println(); 
        }

    }//fin metodo

    public static Object[][] llenar() {
Object[][] tmatriz = new Object[30][30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {

            }
        }
        return tmatriz;

    }
}
