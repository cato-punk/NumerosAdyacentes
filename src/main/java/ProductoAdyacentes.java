public class ProductoAdyacentes {

    // Método que calcula el mayor producto entre números adyacentes en el arreglo
    public static int productoAdyacentes(int[] arreglo) {
        // Validación básica
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (arreglo.length < 2) {
            throw new IllegalArgumentException("Debe haber al menos dos elementos.");
        }

        // Inicializamos el máximo producto con el primer par de elementos
        int maxProducto = arreglo[0] * arreglo[1];

        // Recorremos desde el segundo elemento hasta el penúltimo
        for (int i = 1; i < arreglo.length - 1; i++) {
            int producto = arreglo[i] * arreglo[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto; // actualizamos si encontramos un mayor producto
            }
        }

        return maxProducto;
    }

    // Método main para probar el método
    public static void main(String[] args) {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        System.out.println("El producto adyacente es: " + productoAdyacentes(arreglo));
    }
}
