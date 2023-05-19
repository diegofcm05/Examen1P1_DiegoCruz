/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_diegocruz;

import java.util.Scanner;

/**
 *
 * @author dfcm9
 */
public class Examen1P1_DiegoCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resp = true;
        while (resp){
            System.out.println("Menu de Examen");
            System.out.println("1. Suma Binaria");
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                {
                    String cadena1, cadena2, acum="", resu="";// declaracion de strings y acumuladores usados al final
                    System.out.println("Ingrese el primer numero: ");
                    cadena1 = sc.next();
                    System.out.println("Ingrese el segundo numero: ");
                    cadena2 = sc.next();
                    boolean bueno = true;
                    boolean residuo = false;
                    if (cadena1.length()!=cadena2.length()){// primero se valida unicamente que las cadenas sean iguales en tamanio
                       System.out.println("Los números deben de tener el mismo número de bits.");
                       break;
                       
                    }
                    else{
                        for (int i = 0; i<cadena1.length(); i++){// validacion de primera palabra solo 0s y 1s
                            char a = cadena1.charAt(i);
                            int x = a;
                            if (x!= 48 && x!= 49){
                                System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                                bueno = false;
                                break;
                            }
                           
                        }
                        for (int j = 0; j<cadena2.length(); j++){// validacion de segunda palabra solo 0s y 1s
                            char b = cadena2.charAt(j);
                            int y = b;
                            if (y!= 48 && y != 49){
                                System.out.println("El segundo numero contiene caracteres distintos de '0' y '1'.");
                                bueno = false;
                                break;
                            }
                        }
                                    
                        }
                    if (bueno){
                        for (int k =0; k<cadena1.length(); k++){
                            char a = cadena1.charAt(cadena1.length()-k-1);// obtiene el char de la primera cadena
                            char b = cadena2.charAt(cadena2.length()-k-1);// obtiene el char de la segunda cadena
                            int a1 = a;// conversion char primera cadena a ASCII
                            int a2 = b;// conversion char segunda cadena a ASCII
                            if (a1 == 48 && a2 == 48 && residuo){//0+0+1
                                acum+= '1';
                                residuo = false;
                            }
                            else if (a1==48 && a2 ==49 && residuo){//0+1+1
                                acum += '0';
                            }
                            else if (a1==49 && a2 ==48 && residuo){//1+0+1
                                acum += '0';
                                
                            }
                            else if (a1 == 49 && a2 == 49 && residuo){//1+1+1
                                acum += '1';
                               
                            }
                            else if (a1 == 48 && a2 == 48){//0+0+0
                                acum+= '0';
                                
                            }
                            else if (a1 == 48 && a2 == 49){//0+1+0
                                acum+= '1';
                                
                            }
                            else if (a1== 49 && a2 == 48){//1+0+0
                                acum+= '1';
                                
                            }
                            else if (a1 == 49 && a2 == 49){//1+1+0
                                acum += '0';
                                residuo = true;
                               
                            }
                            
                    }
                        if (residuo){
                            acum+='1';
                        }
                        for (int l=0; l<acum.length(); l++){// reorganizacion de cadena 
                            char s = acum.charAt(acum.length()-l-1);
                            resu +=s;
                        }
                        System.out.println("La suma es: "+resu);// imprime cadena organizada correctamente
                    }
                    else{
                        System.out.println("Esta malo rey. Intentelo de nuevo");// :)
                    }
                    break;
                            
                    
                }//fin case 1
                case 2:
                {
                    System.out.println("Ingrese un tamanio: ");
                    int tamanio = sc.nextInt();
                    while (tamanio<=9 || tamanio % 2 == 0){// validacion numeros mayores que 9 y impares
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9. Ingrese otro numero. ");
                        tamanio = sc.nextInt();
                    }
                    int filas = tamanio - (tamanio/2-1);// calculo de filas de la figura
                    for (int d = 1; d<=filas; d++){//for de filas
                        for (int e = 1; e<=tamanio; e++){//for de columnas
                            if (d == 2){
                                System.out.print("*");
                            }
                            else if (d > 2 && e==d-1){
                                System.out.print("*");
                            }
                            else if (d >2 && e==tamanio-d+2){
                                System.out.print("*");
                            }
                            else if (d == filas -1){
                                System.out.print("+");
                            }
                            else if (d < filas && e == tamanio/2-d+2){
                                System.out.print("+");
                            }
                            else if (d<filas && e ==tamanio/2+d){
                                System.out.print("+");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }// fin for de columnas
                        System.out.println("");
                        
                    }// fin for de filas
                    break;
                }// fin case 2
                default:
                    resp = false;
                    break;
                            
                
            }// fin del switch
            }// fin del menu
        // TODO code application logic here
    }// fin del main
    
}// fin de la clase
