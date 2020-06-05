package arreglos.unidimensionales;

public class ArregloCicloFor {

    public static void main(String[] args) {
        
        // 1. Arreglo String, notación simplificada
        // Declaramos, instanciamos e inicializamos el arreglo
        String nombres[] = {"Jam", "Andy", "Jesus", "Miley"};
        // Imprimimos los valores a la salida estandar

        // 2. Leemos los valores de cada elemento del arreglo
        System.out.println("");

        // 3. Iteramos el arreglo de String con un ciclo For
        // Contador de índice de elementos:
        
        // variable indice iniciada en 0 // nombreArreglo.lenght // incremento de variable
        for (int indice = 0; indice < nombres.length; indice++) { // Iterará el ciclo hasta que sea false
            // nombreArreglo [variable indice] Recupera el elemento en la posición indicada
            System.out.println("Arreglo String Indice #" + indice + ": " + nombres[indice]); // Imprimirá el valor de 0 a 3 = 4 elementos
        } 

    }

}
