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
  
     
     public void pedirVector(){
         int limite=0;
         System.out.println("Cuantos numeros va a ingresar:  ");
         limite = sc.nextInt();
         llenarVector(limite);
         
     }
     
        
     public void llenarVector(int limite){
         int vector[]= new int[limite];
         int i;
         for(i=0;i<limite;i++){
             System.out.println("Ingrese el numero  " + (i+1) + " :  ");
             vector[i]=sc.nextInt();
         }
         mayorMenor(vector,limite);
     }
     
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
