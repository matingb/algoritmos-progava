package test;

import main.Grafos.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrafosTest {

    @Test
    public void Prim() {

        int[][] grafo_ponderado = {{Infinito.INFINITO, 3, 5, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, 1, 4},
                {9, 5, Infinito.INFINITO, Infinito.INFINITO},
                {3, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO}};


        Grafo arbolCostoMinimo = Prim.calcularArbolMinimo(grafo_ponderado);

        List<Arista> aristasEsperadas = List.of(
                new Arista(1,2,3),
                new Arista(2,3,1),
                new Arista(2,4,4));

        Assert.assertEquals(arbolCostoMinimo.getAristas(), aristasEsperadas);
        Assert.assertEquals(arbolCostoMinimo.getCostoTotal(), 8);
    }

    @Test
    public void BFS() {

        int[][] grafo = {
                {Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO},
                {1, Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, 1, Infinito.INFINITO, 1, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, 1, Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO},
                {1, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, 1, Infinito.INFINITO, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO}
        };


        int[] d = BFS.bfs(grafo, 0);

        Assert.assertArrayEquals(d, new int[]{0, 1, 2, 2, 1, 3, Infinito.INFINITO });
    }
}
