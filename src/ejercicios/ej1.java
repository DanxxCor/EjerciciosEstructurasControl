/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.*;

/**
 *
 * @author reyee
 */
public class ej1 {

    public static void main(String[] args) {

        String leer;

        double nota, aprobado = 7.0;

        leer = JOptionPane.showInputDialog("Ingrese la nota del estudiante: ");
        nota = Double.parseDouble(leer);
        if (nota >= aprobado) {
            JOptionPane.showMessageDialog(null, "El alumno ha aprobado", "Aprobado", JOptionPane.INFORMATION_MESSAGE);
        } else if (nota >= 6.50 && nota <= 6.99) {
            JOptionPane.showMessageDialog(null, "El alumno puede hacer un examen de suficiencia", "Examen de Suficiencia", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El alumno ha reprobado", "Reprobado", JOptionPane.ERROR_MESSAGE);
        }
    }
}
