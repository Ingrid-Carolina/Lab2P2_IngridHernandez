/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author ADMINISTRADOR1
 */
public class Lab2P2_IngridHernandez_12141186 {

    /**
     * @param args the command line arguments
     */
    static Random r = new Random();
    static ArrayList<Jugador> jugadores = new ArrayList();
    static  ArrayList<Bot>bot = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);

        boolean centinela = true;
        
        defaultjuga();
        dafaultbot();
        

        while (centinela == true) {
            System.out.println("==========Menu=========");
            System.out.println("0)Salir");
            System.out.println("1)Agregar Jugador");
            System.out.println("2)Bot");
            System.out.println("3)Agregar Item a Juagdor");
            System.out.println("4)Jugar");
            System.out.println("5)listar Jugador");
            System.out.println("6)listar Bots");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Agregar Jugador");
                    System.out.println("Ingrese el nombre del jugador: ");
                    String nom = lea.next();
                     
                         for (int i = 0; i < jugadores.size(); i++) {
                            if(nom.equals(jugadores.get(i).getNombre())){
                              System.out.println("Este nombre no es posible poner");
                        System.out.println("Ingrese un nuevo nombre del jugador:");
                        nom = lea.next();  
                         }
                        
                    }
                    System.out.println("Ingrese el Caracter(minusculas) que represente al Jugador: ");
                    String cara = lea.next();
                    for (int i = 0; i < jugadores.size(); i++) {
                       if(cara.equals(jugadores.get(i).getCaracter())){
                        System.out.println("Este caracter no es posible poner");
                        System.out.println("Ingrese un nuevo el Caracter(minusculas) que represente al Jugador:");
                        cara = lea.next();
                    }  
                    }
//                   
                    System.out.println("Ingrese cuantas Victorias tiene el jugador: ");
                    int vict = lea.nextInt();
                    System.out.println("Ingrese la cantidad de dinero que tiene el Jugador: ");
                    int din = lea.nextInt();
                    jugadores.add(new Jugador(nom, cara, vict, din));
                    Collections.shuffle(jugadores);
                }//fin del case 1
                break;
                case 2: {
                    System.out.println("Crear Bot");
                    System.out.println("Ingrese la velocidad del Bot: ");
                    int velo = lea.nextInt();
                    System.out.println("Ingrese el Caracter(mayusculas) que represente al Bot:");
                    String caract = lea.next();
                    for (int i = 0; i < bot.size(); i++) {
                       if(caract.equals(bot.get(i).getCarB())){
                        System.out.println("Este caracter no es posible poner");
                        System.out.println("Ingrese un nuevo el Caracter(minusculas) que represente al Jugador:");
                        caract = lea.next();
                    }  
                    }
                    
                    System.out.println("Ingrese el Aspecto del Bot: ");
                    String asp = lea.next();
                    System.out.println("Ingrese el Audio del Bot: ");
                    String aud = lea.next();
                    System.out.println("Ingrese el Audio post mortem: ");
                    String post = lea.next();
                    bot.add(new Bot(velo, caract, asp, aud, post));
                    System.out.println(bot);
                    Collections.shuffle(bot);
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
                         imprimirTablero(llenartodo(tablero,jugadores,bot));
                        
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
                case 6: {
                    String salida = "";
                    for (Object t : bot) {
                        if (t instanceof Bot) {
                            salida += bot.indexOf(t) + "- " + t + "\n";
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
                if(tablero[i][j]!= null){
                System.out.print("["+tablero[i][j]+"]");
                }else{
                    System.out.print("[ ]");
                }
            }
           System.out.println(""); 
        }

    }//fin metodo

    public static Object[][] llenar() {
        Object[][] matriz = new Object[30][30];
        int cont1 = 0;
        int cont2 = 0;
        int a;
        int a1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                a= 1+ r.nextInt(29);
                if(cont1 < 150){
                    matriz[a][j]='X';
                    cont1 = cont1 + 1;
                }
            }
            if(cont2 < 150){
                a1= 1 + r.nextInt(29);
                    matriz[i][a1]='X';
                    cont2 = cont2 + 1;
                }    
        }
        for (int p = 0; p< matriz.length; p++) {
            for (int q = 0; q<matriz[p].length; q++) {
              if(matriz[p][q]== null){
                  matriz[p][q] = " ";
              }  
            }
 
        }
        return matriz;
    }
    public static Object[][] llenartodo(Object[][]tablero,ArrayList jugadores,ArrayList bot) {
        Object[][] matriz = new Object[30][30];
        Random r2 = new Random();
        int a;
        int r;
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              a = 1 +r2.nextInt(29);
              r = 1+ r2.nextInt(29);
              if(cont1 <jugadores.size()){
                  matriz[a][r]=((Jugador)jugadores.get(cont1)).getCaracter();
                  cont1 = cont1 +1;
              }
              int r0=1 +r2.nextInt(29);
              int r3= 1 +r2.nextInt(29);
              if(cont2 < bot.size() ){
                  matriz[r0][r3] = ((Bot)bot.get(cont2)).getCarB();
                  cont2 = cont2 +1;
                  if(r==r0&&a==r3){
                      System.out.println("El bot "+((Bot)bot.get(cont2)).getCarB()+ "derribo a"+ ((Jugador)jugadores.get(cont1)).getCaracter());
                  }
              }
              
            }
        }
        return matriz;
    }

    public static void defaultjuga(){
    
    jugadores.add(new Jugador("Jugador ","a",0,70));
    jugadores.add(new Jugador("Jugador 2 ","s",0,70));
    jugadores.add(new Jugador("Jugador 3","d",0,70));
    jugadores.add(new Jugador("Jugador 4 ","f",0,70));
   
    
}
    public static void dafaultbot(){
        
        bot.add(new Bot(80,"Q","fuerza","audio 1","audio post morten"));
         bot.add(new Bot(80,"P","Lento","audio 2","audio post morten 2"));
        
    }
    
}
