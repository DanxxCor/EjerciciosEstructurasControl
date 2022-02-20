package ejercicios;

import javax.swing.JOptionPane;

public class ej4 {

    public static void main(String[] args) {
        String leer;
        int numero, valor, mayor, menor, par = 0;
        mayor = 0;
        menor = 1000000000;
        do {
            leer = JOptionPane.showInputDialog("Ingrese la cantidad de numeros: ");
            numero = Integer.parseInt(leer);
            
            if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                }
        } while (numero < 0);

        for (int i = 1; i <= numero; i++) {
            do {
                leer = JOptionPane.showInputDialog("Ingrese la cantidad " + i + ": ");
                valor = Integer.parseInt(leer);

                if (valor < 0) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (valor < 0);
            if (valor > mayor) {

                mayor = valor;
            }
            if (valor < menor) {

                menor = valor;

            }
            if (valor % 2 == 0) {
                par = par + 1;
            }
        }
        JOptionPane.showMessageDialog(null, " El numero mayor es: " + mayor
                + "\nEl numero Menor: " + menor
                + "\nLa cantidad de pares es: " + par);
    }
}
