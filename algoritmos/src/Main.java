import DivisionYConquista.Sumar;
import Grafos.Infinito;
import Grafos.Prim;

public class Main {
    public static void main(String[] args) {

        /*int[] elementos = {1, 2, 3, 4, 5};

        Sumar sumar = new Sumar();
        sumar.calcular(elementos);*/

        // Main para grafos
        int[][] grafo_ponderado = {{Grafos.Infinito.INFINITO, 3, 5, Grafos.Infinito.INFINITO},
                {Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, 1, 4},
                {9, 5, 7, Grafos.Infinito.INFINITO},
                {3, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO, Grafos.Infinito.INFINITO}};

        int costoMinimoPrim = Prim.calcularCostoMinimo(grafo_ponderado);

        System.out.println(costoMinimoPrim);

    }



}
