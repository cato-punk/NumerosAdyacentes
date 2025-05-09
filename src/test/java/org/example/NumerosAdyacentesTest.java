package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumerosAdyacentesTest {
    @Test
    public void testProductoAdyacenteMayor() {
        int[] arreglo = {3, -2, 5, 3, -5, 4, 5, 2};
        String resultadoEsperado = "El mayor producto adyacente es: 4 * 5 = 20";
        String resultadoObtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testArregloNulo() {
        int[] arreglo = null;
        String esperado = "El arreglo debe tener al menos dos elementos.";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testArregloConUnElemento() {
        int[] arreglo = {7};
        String esperado = "El arreglo debe tener al menos dos elementos.";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testArregloNumeroGrande() {
        int[] arreglo = {Integer.MAX_VALUE, 2, Integer.MAX_VALUE};
        // Integer.MAX_VALUE * 2 = 4294967294L (fuera del rango int)
        String esperado = "El mayor producto adyacente es: " + Integer.MAX_VALUE + " * 2 = " + ((long)Integer.MAX_VALUE * 2);
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testTodosCeros() {
        int[] arreglo = {0, 0, 0, 0};
        String esperado = "El mayor producto adyacente es: 0 * 0 = 0";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testTodosCerosUno() {
        int[] arreglo = {0, 0, 0, 1, 0};
        String esperado = "El mayor producto adyacente es: 0 * 0 = 0";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testExtremosInt() {
        int[] arreglo = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        long producto = (long) Integer.MIN_VALUE * Integer.MAX_VALUE;
        String esperado = "El mayor producto adyacente es: " + Integer.MIN_VALUE + " * " + Integer.MAX_VALUE + " = " + producto;
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testCerosConfundenLogica() {
        int[] arreglo = {0, 0, 0, -1000, -1000, 0, 0}; // -1000 * -1000 = 1_000_000
        String esperado = "El mayor producto adyacente es: -1000 * -1000 = 1000000";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testNegativosParecenMayores() {
        int[] arreglo = {1, 2, -1000, 999, 1}; // 1*2=2, -1000*999=-999000, 999*1=999
        String esperado = "El mayor producto adyacente es: -1000 * 999 = -999000";
        String obtenido = productosAdyacentes.productoAdyacentesSimple(arreglo);
        assertEquals("El mayor producto adyacente es: 999 * 1 = 999", obtenido); // este es el esperado correcto
    }




}