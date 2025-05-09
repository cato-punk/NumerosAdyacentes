package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class productoAdyacenteTest {

    @Nested
    class ProductoAdyacentesTest {

        @Test
        void testCasoNormal() {
            int[] arreglo = {1, -4, 2, 2, 5, -1};
            assertEquals(10, ProductoAdyacentes.productoAdyacentes(arreglo));
        }

        @Test
        void testValoresNegativos() {
            int[] arreglo = {-10, -20, -1, -2};
            assertEquals(200, ProductoAdyacentes.productoAdyacentes(arreglo));
        }

        @Test
        void testArregloConDosElementos() {
            int[] arreglo = {3, 7};
            assertEquals(21, ProductoAdyacentes.productoAdyacentes(arreglo));
        }

        @Test
        void testProductoMayorAlFinal() {
            int[] arreglo = {1, 2, 3, 4, 1000};
            assertEquals(4000, ProductoAdyacentes.productoAdyacentes(arreglo));
        }

        // Casos de error

        @Test
        void testArregloNull() {
            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                    ProductoAdyacentes.productoAdyacentes(null));
            assertEquals("El arreglo no puede ser null.", e.getMessage());
        }

        @Test
        void testArregloMuyCorto() {
            int[] arreglo = {5};
            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                    ProductoAdyacentes.productoAdyacentes(arreglo));
            assertEquals("El arreglo debe tener al menos 2 elementos.", e.getMessage());
        }

        @Test
        void testArregloMuyLargo() {
            int[] arreglo = new int[21];
            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                    ProductoAdyacentes.productoAdyacentes(arreglo));
            assertEquals("El arreglo no debe tener más de 20 elementos.", e.getMessage());
        }

        @Test
        void testValorFueraDeRango() {
            int[] arreglo = {1001, 2};
            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->
                    ProductoAdyacentes.productoAdyacentes(arreglo));
            assertEquals("Los valores deben estar entre -1000 y 1000.", e.getMessage());
        }
    }
}