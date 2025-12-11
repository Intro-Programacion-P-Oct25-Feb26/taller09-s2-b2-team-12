/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
    int[] ventas = new int[5];
    String[] reporte = new String[5];
    String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
    int valor = ventas.length;
    
    for (int i = 0; i < valor; i++) {
        System.out.printf("Ingrese el valor de las ventas del %s\n", dias[i]);
        ventas[i] = entrada.nextInt();
        entrada.nextLine();
        reporte[i] = String.format("- %s $%d\n", dias[i], ventas[i]);
    }
    for (int i = 0; i < valor; i++) {
        System.out.printf("%s", reporte[i]);
    }
    }

}
