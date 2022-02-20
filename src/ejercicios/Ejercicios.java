package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int[] numeros = new int[4];
        int numero;
        int indice = 0;
        int sum = 0;
        while (indice < numeros.length) {

            do {
                System.out.print("Ingrese el número " + (indice + 1) + ": ");
                numero = lector.nextInt();

                if (numero <= 0) {
                    System.out.print("El numero ingresado no puede ser negativo o cero\n");
                    
                }
            } while (numero <= 0);

            boolean aceptado = true;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numero) {
                    aceptado = false;
                    System.out.print("El numero ingresado no puede ser repetido\n");
                }

            }
            if (aceptado) {
                numeros[indice] = numero;
                indice++;

            }

        }

        int mayor, menor;
        mayor = menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        if (menor > 10) {
            mayor = mayor + 10;
        }
        if (mayor < 50) {
            menor = menor - 5;
        }
        if (sum >= 200) {
            System.out.print("La suma de los numeros es mayor o igual a 200\n");
            sum = 0;
            Ejercicios.main(null);
        }

        if (menor < 0) {
            System.out.print("El numero menor es negativo");

        } else if (mayor < 0) {
            System.out.print("El numero mayor es negativo");
        } else {
            System.out.println(" El numero mayor es: " + mayor
                    + "\nEl numero Menor: " + menor
            );
        }

    }

}
