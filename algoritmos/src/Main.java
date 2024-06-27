import DivisionYConquista.Sumar;
import Grafos.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
            //Ejecucion Division y Conquista
        int[] elementos = {1, 2, 3, 4, 5};

        Sumar sumar = new Sumar();
        sumar.calcular(elementos);*/

        int[][] grafo_ponderado = {{Grafos.Infinito.INFINITO, 3, 5, Grafos.Infinito.INFINITO},
                {Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, 1, 4},
                {9, 5, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO},
                {3, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO}};

        /*
            // Ejecucion Prim
        ArrayList<Arista> arbolCostoMinimo = Prim.calcularArbolMinimo(grafo_ponderado);
        System.out.println("El arbol de minimo costo esta conformado por el siguiente camino: " + arbolCostoMinimo + "\nSiendo el costo minimo del mismo: " + Arista.sumarCostos(arbolCostoMinimo));
        */


        /*
            // Ejecucion Floyd
        int[][] matrizFloyd = Floyd.floyd(grafo_ponderado);
        System.out.println("La matriz de costos minimos obtenida por Floyd es: \n");
        Matriz.imprimirMatriz(matrizFloyd);
        */

        int[][] grafo_para_dfs = {
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0}};
        DFS.calcular(grafo_para_dfs, 2, nodo -> System.out.println("Nodo visitado: " + nodo));

        /*int[][] grafo_para_colorear = { {0, 1, 0, 0},
                                        {1, 0, 1, 0},
                                        {0, 1, 0, 1},
                                        {0, 0, 1, 0}};

        int[] coloreo = ColoreoSecuencial.colorear(grafo_para_colorear);
        System.out.println("El coloreo resultante es:" + Arrays.toString(coloreo));*/

    }


}
