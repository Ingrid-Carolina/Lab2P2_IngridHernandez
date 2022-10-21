/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;
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
                    System.out.println("Ingrese el Caracter que represente al Jugador: ");
                    String cara =  lea.next();
                    System.out.println("Ingrese cuantas Victorias tiene el jugador: ");
                    int vict = lea.nextInt();
                    System.out.println("Ingrese la cantidad de dinero que tiene el Jugador: ");
                    int din = lea.nextInt();
                    jugadores.add(new Jugador(nom,cara,vict,din));
                    
                }//fin del case 1
                break;
                case 2:{
                    
                }//fin del case 2
                break;
                case 3:{
                    
                }//fin del case 3
                case 4:{
                    
                }//fin del case 3
                case 5:{
                  String salida = "";
                for (Object t: jugadores) {
                    if(t instanceof Jugador){
                     salida+= jugadores.indexOf(t )+ "- "+ t +"\n";   
                    }
                    
                }
                JOptionPane.showMessageDialog(null, salida);  
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
    
}
