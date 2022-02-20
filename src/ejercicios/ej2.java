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
public class ej2 {

    public static void main(String[] args) {
        String bola, leer;
        double subtotal;
        double total;

        leer = JOptionPane.showInputDialog("Ingrese el color de la bola: ");
        bola = leer;

        if ("Rojo".equals(bola) || "ROJO".equals(bola) || "rojo".equals(bola)) {
            leer = JOptionPane.showInputDialog("Ingrese el subtotal de su compra: ");
            subtotal = Double.parseDouble(leer);
            total = subtotal - (subtotal * 0.1);
            JOptionPane.showMessageDialog(null, "Su total es de: $" + total, "Total", JOptionPane.INFORMATION_MESSAGE);
        } else if ("Verde".equals(bola) || "VERDE".equals(bola) || "verde".equals(bola)) {
            leer = JOptionPane.showInputDialog("Ingrese el subtotal de su compra: ");
            subtotal = Double.parseDouble(leer);
            total = subtotal - (subtotal * 0.05);
            JOptionPane.showMessageDialog(null, "Su total es de: $" + total, "Total", JOptionPane.INFORMATION_MESSAGE);
        } else if ("Blanco".equals(bola) || "BLANCO".equals(bola) || "blanco".equals(bola)) {
            leer = JOptionPane.showInputDialog("Ingrese el subtotal de su compra: ");
            subtotal = Double.parseDouble(leer);
            total = subtotal;
            JOptionPane.showMessageDialog(null, "No aplica descuento, siga participando! \n Su total es de: $" + total, "Total", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error", "No ha ingresado el color correctamente", JOptionPane.ERROR_MESSAGE);
        }

    }
}
