import DivisionYConquista.Sumar;
import Grafos.Infinito;
import Grafos.Prim;
import Grafos.Arista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*int[] elementos = {1, 2, 3, 4, 5};

        Sumar sumar = new Sumar();
        sumar.calcular(elementos);*/

        int[][] grafo_ponderado = {{Grafos.Infinito.INFINITO, 3, 5, Grafos.Infinito.INFINITO},
                {Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, 1, 4},
                {9, 5, 7, Grafos.Infinito.INFINITO},
                {3, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO}};

        /*
            // Ejecucion Prim
        ArrayList<Arista> arbolCostoMinimo = Prim.calcularArbolMinimo(grafo_ponderado);
        System.out.println("El arbol de minimo costo esta conformado por el siguiente camino: " + arbolCostoMinimo + "\nSiendo el costo minimo del mismo: " + Arista.sumarCostos(arbolCostoMinimo));
        */

        /*
            // Ejecucion Dijkstra
         */


    }



}
