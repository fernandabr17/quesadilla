/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author Fernanda Barrón
 */
public class Main {
   
    public static void main(String[] args) {
        
        // Comienza el código, lee los datos introducidos en consola.
        System.out.println("Ingrese los números telefónicos: ");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        // El método replace elimina los símbolos o caracteres que no necesitas.
        String cadena = oracion.replaceAll("[-() ]", "");
        
        // Se declaran las variables.
        int numTijuana = 0;
        int numHermosillo = 0;
        int numGuaymas = 0;
        int numDesconocido = 0;
        
        // El método split define un separador en los números en base a un caracter.
        String[] c = cadena.split(",");
        
        // El ciclo for está validando cada número telefónico y va contando cada uno.
            for (String o : c ){
            
            if (o.startsWith("664")) {
                numTijuana = numTijuana+1;
            } else if (o.startsWith("662")) {
                numHermosillo = numHermosillo+1;
            } else if (o.startsWith("622")) {
                numGuaymas = numGuaymas+1;
            } else {
                numDesconocido = numDesconocido+1;
            }
            }
            
            // Imprime los resultados.
            System.out.println("Hay " + numTijuana +" números de Tijuana");
            System.out.println("Hay " + numHermosillo +" números de Hermosillo");
            System.out.println("Hay " + numGuaymas +" números de Guaymas");
            System.out.println("Hay " + numDesconocido +" números de Desconocido");
    }
}
