package org.example;

public class productoAdyacente {


    public static void verificarArreglo(int[] arreglo) {
        if (arreglo == null || arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos dos elementos.");
        }
    }


    public static int productoAdyacentes(int[] arreglo) {
        verificarArreglo(arreglo);

        int maxProducto = arreglo[0] * arreglo[1];

        for (int i = 1; i < arreglo.length; i++) {
            int producto = arreglo[i - 1] * arreglo[i];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }

        return maxProducto;
    }

    public static void main(String[] args) {
        // Puedes cambiar este arreglo para probar errores, por ejemplo: null o arreglo con un solo elemento
        int[] arreglo = {1, -4, 2, 2, 5, -1};

        try {
            int resultado = productoAdyacentes(arreglo);
            System.out.println("El producto adyacente es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}
