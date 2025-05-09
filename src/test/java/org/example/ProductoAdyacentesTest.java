import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoAdyacentesTest {

    @Test
    public void testCasoBase() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        assertEquals(10, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testTodosCeros() {
        int[] arreglo = {0, 0, 0};
        assertEquals(0, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testValoresAltos() {
        int[] arreglo = {1000, 1000};
        assertEquals(1_000_000, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testNegativos() {
        int[] arreglo = {-10, -10, -1};
        assertEquals(100, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testExcepcionPorTamaño() {
        int[] arreglo = {5};
        assertThrows(IllegalArgumentException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(arreglo);
        });
    }
}
