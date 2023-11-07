/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrasolofilas;

/**
 *
 * @author Usuario
 */
public class ArraSoloFilas {


    public static void main(String[] args) {
        
        int[][] numeros = new int [4][];
        numeros[0]= new int [1];
        numeros[1]= new int [2];
        numeros[2]= new int [3];
        numeros[3]= new int [4];
        
        int k = 1;
        
        //guardar
        for (int i = 0; i < numeros.length; i++) { //control de filas
            System.out.println(numeros[i].length);
            //numeros[0].length
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]= k;
                k++;
                
            }
            
            
        }
        //Leer
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j] + "");
                
                
            }
            System.out.println();
        }
        
    }
    
}
