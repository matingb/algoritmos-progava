import DivisionYConquista.Sumar;
import Grafos.Floyd;
import Grafos.Infinito;
import Grafos.Prim;
import Grafos.Arista;
import Grafos.Matriz;
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

    }


}
