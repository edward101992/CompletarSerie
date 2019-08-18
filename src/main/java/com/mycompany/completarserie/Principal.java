/**
 * Clase Principal la cual contiene la parte logica del programa
 */
package com.mycompany.completarserie;

import java.util.Scanner;

/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Principal {
    
     Scanner sc = new Scanner(System.in);

    /**
     * Metodo get de la variable sc.
     * @return sc Nombre de la variable con la que se instancea Scanner.
     */
    public Scanner getSc() {
        return sc;
    }
    /**
     * Metodo set de la variable sc.
     * @param sc Nombre de la variable con la que se instancea Scanner.
     */

     public void setSc(Scanner sc) {
        this.sc = sc;
    }
     
     /**
      * Metodo pedirVector el cual se encarga de 
      * pedir el limite del vector de entrada de
      * la cantidad de numeros que se ingresara.
      * 
      */
     
     public void pedirVector(){
         int limite=0;
         System.out.println("Cuantos numeros va a ingresar:  ");
         limite = sc.nextInt();
         llenarVector(limite);
         
     }
        /**
         * Metodo llenarVector el cual se encarga de pedir
         * uno a uno los numeros que se ingresaran y se iran
         * almacenando en el vector de entrada.
         * @param limite variable que viene del metodo pedirVector y 
         * se encarga de delimitar el vector de entrada.
         */
     
     public void llenarVector(int limite){
         int vector[]= new int[limite];
         int i;
         for(i=0;i<limite;i++){
             System.out.println("Ingrese el numero  " + (i+1) + " :  ");
             vector[i]=sc.nextInt();
         }
         mayorMenor(vector,limite);
     }
        /**
         * 
         * @param vector
         * @param limite 
         */
      public void mayorMenor(int vector[],int limite){
         int mayor = 0;
         int menor = 0;
         int fin = limite;
         int array[]=vector;
         mayor = menor = vector[0];       
         for(int i=0;i<limite;i++){
             if(vector[i]>mayor){
                 mayor=vector[i];
             }
             if(vector[i]<menor){
                 menor=vector[i];
             }
         }
     }
     
     
         
         
}
