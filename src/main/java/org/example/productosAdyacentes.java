package org.example;

public class productosAdyacentes {
    public static String productoAdyacentesSimple(int[] arreglo) {
        if (arreglo == null || arreglo.length < 2) {
            return "El arreglo debe tener al menos dos elementos.";
        }

        long maxProducto = Long.MIN_VALUE;
        int numero1 = 0;
        int numero2 = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            long productoActual = (long) arreglo[i] * arreglo[i + 1];
            if (productoActual > maxProducto) {
                maxProducto = productoActual;
                numero1 = arreglo[i];
                numero2 = arreglo[i + 1];
            }
        }

        return "El mayor producto adyacente es: " + numero1 + " * " + numero2 + " = " + maxProducto;
    }

    public static void main(String[] args) {
        int[] arreglo1 = {1, -4, 2, 2, 5, -1};
        System.out.println("El producto adyacente es: " + productoAdyacentesSimple(arreglo1)); // Salida esperada: El mayor producto adyacente es: 2 * 5 = 10

    }

}