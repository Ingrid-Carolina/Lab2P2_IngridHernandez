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
        ArrayList jugadores  = new ArrayList();
        ArrayList bot = new ArrayList();
        
        while(centinela == true){
            System.out.println("==========Menu=========");
            System.out.println("0)Salir");
            System.out.println("1)Agregar Jugador");
            System.out.println("2)Bot");
            System.out.println("3)Agregar Item a Juagdor" );
            System.out.println("4)Jugar");
             System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("Agregar Jugador");
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nom =  lea.next();
                    System.out.println("Ingrese el Caracter(minusculas) que represente al Jugador: ");
                    String cara =  lea.next();
                    System.out.println("Ingrese cuantas Victorias tiene el jugador: ");
                    int vict = lea.nextInt();
                    System.out.println("Ingrese la cantidad de dinero que tiene el Jugador: ");
                    int din = lea.nextInt();
                    jugadores.add(new Jugador(nom,cara,vict,din));
                    
                }//fin del case 1
                break;
                case 2:{
                    System.out.println("Crear Bot");
                    System.out.println("Ingrese la velocidad del Bot: ");
                    int velo = lea.nextInt();
                    System.out.println("Ingrese el Caracter(mayusculas) que represente al Bot:");
                    String caract= lea.next();
                    System.out.println("Ingrese el Aspecto del Bot: ");
                    String asp = lea.next();
                    System.out.println("Ingrese el Audio del Bot: ");
                    String aud = lea.next();
                    System.out.println("Ingrese el Audio post mortem: ");
                    String post = lea.next();
                    bot.add(new Bot(velo,caract,asp,aud,post));
                    System.out.println(bot);
                }//fin del case 2
                break;
                case 3:{
                    System.out.println("Agregar Item");
                    
                    System.out.println("Ingrese la posicion del Jugador:");
                    int p = lea.nextInt();
                     if (jugadores.get(p)instanceof Jugador jugador) {
                         System.out.println("Ingrese el Item que desea agregar: ");
                         String it = lea.next();
                         jugador.getItem().add(it);
                         System.out.println("Se Agregador Exitosamente el Item al Jugador");
                     }else{
                         System.out.println("NO hay ningun Jugador en esa posicion");
                     }
                      
                }//fin del case 3
                case 4: {
                   Object [][] tablero = new Object[30][30];
                   
                    char resp = 's';
                    System.out.println();
                    while (resp == 's' || resp == 'S') {

                        System.out.println("Desea continuar?");
                        resp = lea.next().charAt(0);
                    }//fin del while
                }//fin del case 3
                case 5:{
                  String salida = "";
                for (Object t: jugadores) {
                    if(t instanceof Jugador){
                     salida+= jugadores.indexOf(t )+ "- "+ t +"\n";   
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
    
     public static void imprimirTablero(Object [][] tablero, int filas, int col) {
        
       if(filas == tablero.length-1 && col == tablero[0].length-1){
           System.out.print("[ ]");
       }else{
           if(col == tablero[0].length-1){
               System.out.print("");
               System.out.println( "[ ]" ); 
            imprimirTablero( tablero ,filas+1, 0);
           }else{
               System.out.print("[ ]"); 
            imprimirTablero(tablero,filas, col+1);
           }
       }
}//fin metodo
     public Object[][] llenar (int filas, int col){
         
        Object [][]tmatriz = new Object[30][30];
         for (int i = 0; i < 30; i++) {
             for (int j = 0; j < 30; j++) {
                 
             }
         }
         return tmatriz;
         
     }
}
