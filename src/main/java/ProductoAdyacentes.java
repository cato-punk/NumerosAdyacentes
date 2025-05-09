public class ProductoAdyacentes {
    public static int productoAdyacentes(int[] arreglo) {
        if (arreglo == null || arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos dos elementos.");
        }

        int maxProducto = arreglo[0] * arreglo[1];
        for (int i = 1; i < arreglo.length - 1; i++) {
            int producto = arreglo[i] * arreglo[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }
        return maxProducto;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        System.out.println("El producto adyacente es: " + productoAdyacentes(arreglo));
    }
}
