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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        String cadenaFinal = "";
        cadenaFinal = String.format("%sResultado Potencias: \n", cadenaFinal);
        for (int cont = 0; cont < bases.length; cont++) {
            resultado[cont] = obtenerPotencia(bases[cont], potencias[cont]);
            cadenaFinal = String.format("%s%.2f\n",
                    cadenaFinal, resultado[cont]);
        }
        cadenaFinal = String.format("%sSuma de las potencias: \n%.2f\n",
                cadenaFinal, obtenerSuma(resultado));
        System.out.printf("%s", cadenaFinal);
    }

    public static double obtenerPotencia(double base, double exponente) {
        if (exponente == 1) {
            return base;
        } else {
            return base * obtenerPotencia(base, exponente - 1);
        }
    }

    public static double obtenerSuma(double[] arreglo) {
        double suma = 0;
        for (int contador = 0; contador < arreglo.length; contador++){
            suma = suma + arreglo[contador];
        }
        return suma;
    }
    
}
