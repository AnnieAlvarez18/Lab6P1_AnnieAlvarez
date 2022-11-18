/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_anniealvarez;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author anniealvarez
 */
public class Lab6P1_AnnieAlvarez {
static Scanner lectura = new Scanner(System.in);
static Random r = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menu = true;
        
        while(menu==true){
            System.out.println("--MENU-- ");
            System.out.println("1. Turing");
            System.out.println("2. Constante de Kaprekar");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion que desee");
            int opcion = lectura.nextInt();
            
            switch(opcion){
                case 1: {
                    System.out.println("--TURING--");
                    System.out.println("Ingrese un valor");
                    int size = lectura.nextInt();
                    int[] entero = new int[size];
                    entero = Lectura(size);
                    Imprimir(entero);
                    System.out.println();
                    System.out.println("Ingrese la cadena de instrucciones: ");
                    lectura.nextLine();
                    String letras = lectura.nextLine().toUpperCase();
                    String cadena = Turing(entero, letras);
                    System.out.println("Cdena generada: "+cadena);
                }
                break;
                
                case 2: {
                    System.out.println("--KAPREKAR--");
                    System.out.println("Ingrese 4 digitos diferentes");
                    int numeros = lectura.nextInt();
                    Kaprekar(numeros);
                }
                break;
                
                case 3: {
                    menu = false;
                }
                break;
                default:
                    System.out.println("Esa opcion no existe");
            }//fin switch
        }//fin while
        
    }//fin main
    
    public static int[] Lectura(int s){
      int[] numero = new int[s];
      for (int i = 0; i<numero.length; i++){
          numero[i]= 0+ r.nextInt(9);
          
      }
      return numero;
    }//fin metodo lec
    
    public static void Imprimir(int[]entero){
      for(int i = 0; i<entero.length; i++){
             System.out.print("["+entero[i]+"]");
          }
    }//fin metodo impre
    
    public static String Turing(int[] entero, String letras){
        int apuntador = 0;
        
        String tun = "";
        for(int i = 0; i <letras.length(); i++){
            if (letras.charAt(i)=='R'){
                apuntador++; 
            }
            else if(letras.charAt(i)=='L'){
                apuntador--; 
            }
            else if(letras.charAt(i)=='X'){
                tun+= entero[apuntador];
            }   
        }
        return tun;
    }//fin metodo turing
    
    public static void Kaprekar(int numeros){
        int resp = 0;
        int repeticion = 0;
        int [] aa = Array1(numeros);
        int  uno = Array2(aa);
        int [] doss = UP(aa);
        int [] tres = Down(aa);
        while(repeticion <=1 && repeticion>=7){
            if(resp==6174){
            
            }
        repeticion++;
        }
    }//fin ka
    
    public static int []Array1(int numeros){
        //int uno=0;
        int [] arreglo = new int[4];
        for(int i = 0; i <arreglo.length;i++){
            arreglo[i]= numeros;
        }
        
        return arreglo;
    }//fin a1
    
    
    
    public static int Array2(int []aa){
        int dos = 0;
        for(int i = 0; i<aa.length;i++){
            dos += aa[i];
        }
        return dos;
    }//fin a2
    
    public static int[] UP(int []aa){
        int arriba;
        int [] aordena;
        //aqui se esta recorriendo el arreglo generado anteriormente.
        for(int i = 0; i < aa.length; i++){
            //este for se utiliza para elaluar que numero es mayor.
            for(int j = 0; j < aa.length - i;j++){
                //este if es para determinar y empezar evaluar para encontrar el mayor
                if(aa[j] > aa[j+1]){
                    //para establecer el numero mayor
                    arriba = aa[j];
                    aa[j] = aa[j+1];
                    aa[j+1] = arriba;
                }
            }
        }
        aordena = aa;
        return aordena;
    }//fin up
    
    
    public static int[] Down(int []aa){
        int abajo;
    
        
        return abajo;
    }//fin down
            
}//FIN :(
