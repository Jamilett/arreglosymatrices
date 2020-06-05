package arreglos.unidimensionales;

public class EjemploUnidimensional {

    public static void main(String[] args) {
        // Un arreglo es de tipo object
        
        // 1. Declaramos arreglo de enteros (Definimos variable)
        // tipo nombreArreglo [];
        int edades[];
        
        // 2. Instanciamos el arreglo de enteros
        // nombreArreglo = new tipo [largo];
        edades = new int[3];
        
        // 3. Inicializamos los valores del arreglo de enteros 
        // nombreArreglo [indice] = valor;
        edades[0] = 30;
        edades[1] = 15;
        // El valor del tercer arreglo no se define, así que será por default el valor de int

        // 4. Leemos los valores de CADA elemento del arreglo 
        // variable nueva = nombreArreglo [indice]
        // nombreArreglo [variable indice] Recupera el elemento en la posición indicada
        System.out.println("Arreglo de enteros índice 0 = " + edades[0]); // Regresara valor 30
        System.out.println("Arreglo de enteros índice 1 = " + edades[1]); // Regresara valor 15
        System.out.println("Arreglo de enteros índice 2 = " + edades[2]); // Regresara valor 0
        
        //DECLARAR ARREGLOS DE TIPO OBJECT
        // Declaramos e instanciamos el arreglo de tipo Persona
        Persona personas [] = new Persona [4]; 
        // Inicializamos los valores
        personas [0] = new Persona ("Juan"); // Toma el constructor de la clase persona
        personas [2] = new Persona ("Karla");
        
        System.out.println("Arreglo Personas Indice 0: " + personas [0]); // La clase Persona ya tiene toString
        System.out.println("Arreglo Personas Indice 1: " + personas [1]); // para visualizar los valores de object
        System.out.println("Arreglo Personas Indice 2: " + personas [2]); // y no solamente la referencia en memoria
        System.out.println("Arreglo Personas Indice 3: " + personas [3]);

    }

}
