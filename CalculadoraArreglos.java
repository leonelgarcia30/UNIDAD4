/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraarreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalculadoraArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};

        
        int opcion;

        do {
            System.out.println("Bienvenido a la calculadora, escoge una opción");

        Scanner op = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Salir");
        opcion = op.nextInt();        
            switch (opcion) {

                case 1:
                    double suma = 0;
                    for (int i = 0; i < elementos.length; i++) {
                        suma += elementos[i];
                        System.out.println("La suma es: " + suma);
                    }
                    break;

                case 2:
                    double multiplicacion = 1.0;
                    for (int i = 0; i < elementos.length; i++) {
                        multiplicacion *= elementos[i];
                        System.out.println("La multiplicación es: " + multiplicacion);

                    }
                    break;

                case 3:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;

            }
        }while(opcion != 3);
    }
}