/**
 * Clase Principal la cual contiene la parte logica del programa
 * contiene los metodos
 * -
 */
package com.mycompany.completarserie;

import java.util.Scanner;

/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Principal {
    
    /**
     * Variable sc se encarga de instancear la clase Scanner para ccapturar
     * datos por consola.
     */
    
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
         * Metodo mayorMenor 
         * este metodo se encarga de capturar el valor mayor
         * y el menor del array de inicio, estos valores
         * serviran para crear otro array desde menor hasta mayor
         * @param vector Vector de inicio 
         * @param limite Limite del vector de inicio
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
         imprimirSerie(menor,mayor,array,fin);
     }
      
     /**
      * 
      * @param menor
      * @param mayor
      * @param vector
      * @param limite 
      */
     public void imprimirSerie(int menor,int mayor,int vector[], int limite){   
         int negativo, suma;            
         if(menor<0){
            negativo=menor*(-1);
            suma=negativo+mayor;
         }else{
            suma=mayor-menor;           
         }        
         int vector2[]= new int[suma+1];
         for(int i=0;menor<=mayor;i++){
            vector2[i]=menor;
            menor++;
         }     
         System.out.println("Los numeros que faltan para completar la serie son : ");
          for(int i=0;i<suma;i++){
             boolean falta = true;
             for(int j=0;j<limite;j++){
                 if(vector[j]==vector2[i]){
                     falta = false;
                 }
             }    
             if(falta){
                 System.out.print(vector2[i] + "  ");
             }
         }
          System.out.println("");  
     }
}
    
