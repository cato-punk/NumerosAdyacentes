Parámetros del método productoAdyacentes(...):

Parámetros de entrada:
  - int[] arreglo → un arreglo de números enteros.

Valor de retorno:
  - int → el mayor producto encontrado entre dos números adyacentes.

Pasos fundamentales (pseudocódigo):

1.-Verificar que el arreglo no sea nulo y tenga al menos dos elementos.

2.-Inicializar una variable maxProducto con el primer producto adyacente.

3.-Recorrer el arreglo desde el segundo elemento y calcular el producto del elemento actual con el anterior.

4.-Comparar ese producto con maxProducto y actualizar si es mayor.

5.-Al finalizar, retornar maxProducto.
