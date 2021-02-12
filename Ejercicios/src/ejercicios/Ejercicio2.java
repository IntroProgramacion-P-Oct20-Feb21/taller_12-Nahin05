/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                   double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                resultado[fila][columna]
                        = factorialPosicion(datos[fila][columna]);
                System.out.println(resultado[fila][columna]);
            }
        }
    }

    public static double factorialPosicion(double numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorialPosicion(numero - 1);
        }
    }
    
}
