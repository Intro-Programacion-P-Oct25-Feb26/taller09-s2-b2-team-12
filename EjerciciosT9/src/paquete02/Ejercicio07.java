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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        double[] nro = new double[10];
        double suma = 0;

        // Ingreso de números
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            nro[i] = entrada.nextDouble();
            suma += nro[i];
        }

        // Cálculo del promedio
        double promedio = suma / 10;

        // Mostrar cada número y su diferencia
        System.out.println("\nPROMEDIO = " + promedio);
        System.out.println("\nNúmero\tDiferencia (número - promedio)");
        for (int i = 0; i < 10; i++) {
            double diferencia = nro[i] - promedio;
            System.out.printf("%.2f\t%.2f\n", nro[i], diferencia);
        }
    }
}