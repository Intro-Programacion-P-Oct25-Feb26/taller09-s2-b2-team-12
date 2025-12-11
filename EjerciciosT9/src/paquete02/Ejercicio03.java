/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {



    public static void main(String[] args) {
        
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        
   
        double suma = 0;
        double promedio;
        int arriba = 0;
        int abajo = 0;
        
 
        int longitud = arreglo.length; 
        
      
        int i = 0;
        int i2 = 0;
        
     
        while (i < longitud) { 
            suma = suma + arreglo[i];
            i = i + 1;
        }
        
      
        promedio = suma / longitud;
        
      
        while (i2 < longitud) {
            
         
            if (arreglo[i2] > promedio) { 
                arriba = arriba + 1;
            } else if (arreglo[i2] < promedio) { 
                abajo = abajo + 1;
            }
            
           
            i2 = i2 + 1; 
        }
        
        System.out.printf("El promedio del arreglo es: %.2f\n", promedio);
        System.out.printf("Valores por encima de la media: %d\n", arriba);
        System.out.printf("Valores por debajo de la media: %d\n", abajo);
        
 
    }
}

