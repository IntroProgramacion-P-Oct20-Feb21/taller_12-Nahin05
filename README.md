# Taller12

## Problemáticas
### Problema 00
Dado el siguiente código; ejecute y analice la salida
```
public class Ejemplo00 {

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
```
#### Respuesta aquí

#### Fin respuesta

***

### Problema 01
Dado el siguiente arreglo
```
double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
```

Use un método recursivo que permita encontrar el factorial de cada posición del arreglo. El resultado de cada posición debe ubicarlo en el siguiente arreglo

```
double[][] resultado = new double[4][2];
```
***

### Problema 02
Dado el siguiente arreglo
```
double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
```
A través de un método recursivo encuentre y presente la suma de cada fila.
***

### Problema 03
Dado los siguientes arreglos
```
double[] datos = {100, 90, 80, 70, 60};
double[] datos2 = {200, 190, 180, 170, 160};
```

Encuentre la suma de las posiciones 0 de datos y datos2 (use un método recursivo) y el valor de la suma, asignarle a un arreglo llamado suma

```
double[] suma = new int[5];

```
***

### Problema 04

Dado los siguientes arreglos
```
double[] bases = {100, 90, 80, 70, 60};
double[] potencias = {2, 3, 2, 2, 1};
```

Encuentre la potencia de las posiciones 0 de datos(base) y datos2(potencia) , use un método recursivo; y el valor de la potencia, asignarle a un arreglo llamado resultado

```
double[] resultado = new int[5];
```

Finalmente, encuentre la suma de los valores del arreglo resultado a través de un método recursivo.


