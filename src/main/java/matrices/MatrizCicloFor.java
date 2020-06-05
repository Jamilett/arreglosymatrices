package matrices;

public class MatrizCicloFor {
// Recorrer Elementos de una Matriz
// Ciclo For Anidado (un for dentro de un for)   
    public static void main(String[] args) {

        // 1. Matriz tipo String, notación simplificada
        String nombres[][] = {{"Jam", "Jesus", "Andy"}, {"Andy", "Jam", "Jesus"}}; // Matriz 2x3

        // Largo de elementos de la matriz (Primero #de Renglones)
        System.out.println("Largo Matriz Renglones: " + nombres.length);
        // Seleccionando un renglon valido nos regresa el #de Columnas
        System.out.println("Largo Matriz Columnas: " + nombres[0].length);

        // Imprimimos los valores a la salida estandar
        
        // 2. Iteramos la matriz de String con un for anidado 
        for (int iRen = 0; iRen < nombres.length; iRen++) { // Recorre los renglones de la matriz
            for (int iCol = 0; iCol < nombres[iRen].length; iCol++) { // Recorre las columnas de la matriz
                System.out.println("Matriz String Indice: " + iRen + "-" + iCol + ": " + nombres[iRen][iCol]);
            }

        }

    }

}
