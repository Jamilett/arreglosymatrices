package matrices;

public class EjCalificacionesAndres {

    public static void main(String[] args) {
        
        // Se declaran variables globales
        String nombreMateria = "";
        int promedioMateria;
        int promedioFinal = 0;
        int sumaTotalMaterias = 0;
        
        // Se declara, instancia e inicializa matriz calificaciones de 5x3
        int calificaciones[][] = {{7, 8, 9}, {8, 10, 9}, {8, 7, 9}, {9, 10, 8}, {5, 6, 8}};
        // Se imprime el tamaño de la matriz 5x3 mediante .length
        System.out.println("Tamaño matriz:" + "\n" + "Filas: " + calificaciones.length);
        System.out.println("Columnas: " + calificaciones[0].length); // [0] accede al renglon 0 para determinar columnas x renglon
        System.out.println("----------------");

        // Se añade un primer ciclo for (RENGLONES) anidado 
        for (int materia = 0; materia < calificaciones.length; materia++) {
            // Dentro de for se agrega un condicional para asignar nombreMateria    
            switch (materia) {
                case 0: // El indice 0 corresponderá a Español
                    nombreMateria = "Español";
                    break;
                case 1:
                    nombreMateria = "Matemáticas";
                    break;
                case 2:
                    nombreMateria = "Historia";
                    break;
                case 3:
                    nombreMateria = "Geografia";
                    break;
                case 4:
                    nombreMateria = "Arte";
                    break;
                default:
                    break;
            } // Se cierra switch
            
            System.out.println("---- " + nombreMateria + " (" + materia + ") " + " ----");
            
            // Se declara una variable suma para obtener la suma de las calificaciones (por indice)
            int suma = 0; 
            
            // Se anida el segundo ciclo for (COLUMNAS) para obtener la suma de las columnas de los índices
            for (int calif = 0; calif < calificaciones[0].length; calif++) { // [accedemos al indice correspondiente]
                
                // Se imprimen los valores de cada columna (valores de las calificaciones)
                System.out.println("Parcial " + calif + " ---> " + calificaciones[materia][calif]);
                
                // Se toma la variable suma para sumarle a si misma el valor de la suma de las columnas de cada indice.
                // Se hará la suma de cada indice y se le pasará el valor a la variable suma, cuando termine con un índice, 
                // pasará al siguiente indice y su valor se reiniciará en 0, porque está dentro del segundo ciclo (COLUMNAS)
                suma += calificaciones[materia][calif]; // suma = suma + calificaciones[materia][calif];
                
            } // Cierre segundo ciclo for
            
            // Dentro del primer ciclo, obtendremos el promedio por materia

            promedioMateria = suma / calificaciones[0].length; // suma / tamaño de columnas (calificaciones)
            System.out.println("Promedio " + nombreMateria + " : " + promedioMateria);
            
            // Se cambia el valor de sumaTotalMaterias (vglobal) y se le suma el valor de promedioMateria de TODOS los índices
            // Al ser una variable GLOBAL, se le sumarán las sumas de TODOS los índices
            sumaTotalMaterias += promedioMateria; // sumaTotalMaterias = sumaTotalMaterias + promedioMateria
            // Se obtiene el promedio final pero no se imprime
            promedioFinal = sumaTotalMaterias / calificaciones.length; // suma / tamaño renglones (materias)
            
        } // Cierre del primer ciclo for

        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        
        // Se imprime el promedio FINAL
        System.out.println("PROMEDIO FINAL: " + promedioFinal);
    }

}
