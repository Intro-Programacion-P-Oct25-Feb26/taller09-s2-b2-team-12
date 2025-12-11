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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] menu = {"Café Tradicional", "Café Francés", "Café Alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        int tazas;
        String rta;
        String tipo_cafe;
        String msj = "";
        boolean i = true;
        double total;
        double suma = 0;
        
        while (i == true) {
            System.out.println("¿Qué tipo de café desea comprar? "
                    + "(Tradicional, Francés, Alemán)");
            tipo_cafe = entrada.nextLine();
            tipo_cafe = tipo_cafe.toLowerCase();
            
            switch (tipo_cafe) {
                case "tradicional":
                    System.out.println("¿Cuántas tazas desea?");
                    tazas = entrada.nextInt();
                    total = precios[0] * tazas;
                    suma = suma + total;
                    msj = String.format("%s\t%s (%d t), valor a cancelar $%.2f\n", 
                            msj, menu[0], tazas, total);
                break;
                
                case "francés":
                case "frances":
                    System.out.println("¿Cuántas tazas desea?");
                    tazas = entrada.nextInt();
                    total = precios[1] * tazas;
                    suma = suma + total;
                    msj = String.format("%s\t%s (%d t), valor a cancelar $%.2f\n", 
                            msj, menu[1], tazas, total);
                break;
                
                case "alemán":
                case "aleman":
                    System.out.println("¿Cuántas tazas desea?");
                    tazas = entrada.nextInt();
                    total = precios[2] * tazas;
                    suma = suma + total;
                    msj = String.format("%s\t%s (%d t), valor a cancelar $%.2f\n", 
                            msj, menu[2], tazas, total);
                break;
                
                default:
                    System.out.println("Producto no especificado");
            }
            entrada.nextLine();
            System.out.println("¿Desea adquirir otro producto? (s/n)");
            rta = entrada.nextLine();
            if (rta.equals("s")) {
                i = true; }
            else {
                i = false;}
        }
        
        System.out.printf("El usuario ha comprado:\n\n%s\nTotal a pagar: %.2f\n", 
                msj, suma);

    }

}
