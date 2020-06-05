package arreglos.unidimensionales;

public class ArregloSimpleAndres {

    public static void main(String[] args) {

//        int calificaciones[] = {9, 10, 8, 9};
//        for (int i = 0; i < calificaciones.length; i++) {
//            System.out.println("Posicion: " +i);
//            System.out.println("Calificacion: " + calificaciones[i]);
//        }
//        int calificaciones[] = new int[3];
//        calificaciones[0] = 9;
//        calificaciones[1] = 10;
//        calificaciones[2] = 7;
//        
//        for (int i = 0; i < calificaciones.length; i++) {
//            System.out.println("Posicion -----> " + i);
//            System.out.println("Calificac1, 2, 3, 4, 5}ion ---> " + calificaciones[i]);
//        }
        int cuadrado[][] = {{100, 200, 300, 400, 500}, {600, 700, 800, 900, 1000}};

        System.out.println("Tamaño de renglones -----> " + cuadrado.length);
        System.out.println("Tamaño de columnas -----> " + cuadrado[0].length);
        
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.println("----- RENGLON "+i+" -----");
            
            for (int j = 0; j < cuadrado[i].length; j++) {
                System.out.println("Columna -----> " + j);
                System.out.println("Valor -----> " + cuadrado[i][j]);
            }
        }
    }

}
