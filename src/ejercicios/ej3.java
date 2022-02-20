/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author reyee
 */
import javax.swing.*;

public class ej3 {

    public static void main(String[] args) {
// TODO code application logic here
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0, empleados;

        leer = JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ");
        empleados = Integer.parseInt(leer);
        while (i <= empleados) {
            do {
                leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
                sueldo = Double.parseDouble(leer);

                if (sueldo < 0) {
                    JOptionPane.showMessageDialog(null, "El salario no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (sueldo < 0);

            if (sueldo > 300) {
                contador = contador + 1;
            }
            if (sueldo > mayor) {
                mayor = sueldo;
            }
            if (sueldo < menor) {
                menor = sueldo;
            }
            i = i + 1;

        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor
                + "\nEl sueldo Menor es de $: " + menor
                + "\n" + contador + " Empleados tienen un sueldo mayor de $300");
    }
}
