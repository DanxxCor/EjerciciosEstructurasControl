package ejercicios;

import javax.swing.JOptionPane;

public class ej5 {

    public static void main(String[] args) {
        String leer;
        int z =0;
        int n = 4;
        int[] array = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < array.length; i++) {
            do {
                leer = JOptionPane.showInputDialog("Ingrese el dato " + (i + 1) + ": ");
                array[i] = Integer.parseInt(leer);
                
                
                if (array[i] < 0) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado no puede ser negativo ni cero", "Error", JOptionPane.ERROR_MESSAGE);
                    i = i - 1;
                }
                if(array[i] == temp[z]){
			JOptionPane.showMessageDialog(null, "El numero ingresado no puede ser duplicado", "Error", JOptionPane.ERROR_MESSAGE);
                        i = i-1;
		}
                temp[z] = array[i];
            } while (array[i] < 0);
            

        }
        
                int mayor, menor;
        mayor = menor = array[0];
         for (int i = 0; i < array.length; i++) {
            if(array [i] > mayor) {
                mayor = array[i];
            }
            if(array[i]<menor) {
                menor = array[i];
            }
        }
            JOptionPane.showMessageDialog(null, " El numero mayor es: " + mayor
                + "\nEl numero Menor: " + menor
                );
        
    }
    
}
