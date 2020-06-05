package matrices;

public class EjemploMatrices {

    public static void main(String[] args) {
        // 1. Declaramos una matriz de enteros
        // tipo [][] nombreMatriz; o tipo nombreMatriz [][];
        int edades[][];

        // 2. Instanciamos la matriz de enteros
        // nombreMatriz = new tipo [renglones][columnas];
        edades = new int[3][2]; // tendrá 3 renglones y 2 columnas Matriz de 3x2

        // 3. Inicializamos los valores de la matriz de enteros 3x2 = 6 valores
        // nombreMatriz [indice_renglon][indice_columna] = valor;
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        // Imprimimos los valores a la salida estardar
        // 4. Leemos los valores de cada elemento de la matriz
        // nombreArreglo [indice_renglon][indice_columna] Recupera el elemento en la posición indicada
        System.out.println("Matriz de int indice 0-0: " + edades[0][0]); // Recupera valor 30
        System.out.println("Matriz de int indice 0-1: " + edades[0][1]); // Recupera valor 15
        System.out.println("Matriz de int indice 1-0: " + edades[1][0]); // Recupera valor 20
        System.out.println("Matriz de int indice 1-1: " + edades[1][1]); // Recupera valor 45
        System.out.println("Matriz de int indice 2-0: " + edades[2][0]); // Recupera valor 5
        System.out.println("Matriz de int indice 2-1: " + edades[2][1]); // Recupera valor 38

        // Declarar e instanciar matriz tipo Persona
        Persona personas[][] = new Persona[1][2];

        // Inicializar matriz tipo Persona
        personas[0][0] = new Persona();
        personas[0][0].setNombre("Jamilett");
        personas[0][1] = new Persona("Andres");
        
        // Ciclo for anidado
        for (int ren = 0; ren < personas.length; ren++) {
            for (int col = 0; col < personas[ren].length; col++) {
                System.out.println("Matriz Personas Indice " + ren + "-" + col + ": " + personas[ren][col]);
            }
        }

    }

}
