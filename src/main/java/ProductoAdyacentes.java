public class ProductoAdyacentes {
    public static int productoAdyacentes(int[] arreglo) {
        validarEntrada(arreglo);

        int maxProducto = arreglo[0] * arreglo[1];
        for (int i = 1; i < arreglo.length - 1; i++) {
            int producto = arreglo[i] * arreglo[i + 1];
            if (producto > maxProducto) {
                maxProducto = producto;
            }
        }
        return maxProducto;
    }
    private static void validarEntrada(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }
        if (arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos 2 elementos.");
        }
        if (arreglo.length > 20) {
            throw new IllegalArgumentException("El arreglo no debe tener más de 20 elementos.");
        }
        for (int valor : arreglo) {
            if (valor < -1000 || valor > 1000) {
                throw new IllegalArgumentException("Los valores deben estar entre -1000 y 1000.");
            }
        }
    }
    public static void main(String[] args) {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        try {
            int resultado = productoAdyacentes(arreglo);
            System.out.println("El producto adyacente es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
