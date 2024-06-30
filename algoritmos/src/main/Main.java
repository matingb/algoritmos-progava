package main;

import main.Grafos.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
            //Ejecucion Division y Conquista
        int[] elementos = {1, 2, 3, 4, 5};

        Sumar sumar = new Sumar();
        sumar.calcular(elementos);*/

        /*
            // Ejecucion Floyd
        int[][] matrizFloyd = Floyd.floyd(grafo_ponderado);
        System.out.println("La matriz de costos minimos obtenida por Floyd es: \n");
        Matriz.imprimirMatriz(matrizFloyd);
        */

//<<<<<<< HEAD:algoritmos/src/Main.java
/*        int[][] grafo_para_dfs = {
=======
        /*int[][] grafo_para_dfs = {
>>>>>>> bf45a087a5c9a07a991f6430b754e626db1d73e7:algoritmos/src/main/Main.java
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0}};
        DFS.calcular(grafo_para_dfs, 2, nodo -> System.out.println("Nodo visitado: " + nodo));*/

        
        int[][] grafo_para_colorear = { {0, 1, 1, 0, 0},
                                        {1, 0, 1, 0, 0},
                                        {1, 1, 0, 1, 0},
                                        {0, 0, 1, 0, 1},
                                        {0, 0, 0, 1, 0}};
        /*
        int[] coloreo = ColoreoSecuencial.colorear(grafo_para_colorear);
        System.out.println("El coloreo resultante es:" + Arrays.toString(coloreo));*/
        
        int[] coloreo = ColoreoWelshPowell.colorear(grafo_para_colorear);
        System.out.println("El coloreo resultante es:" + Arrays.toString(coloreo));

    }


}
