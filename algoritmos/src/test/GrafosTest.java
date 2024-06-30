package test;

import main.Grafos.BFS;
import main.Grafos.Infinito;

import org.junit.Assert;
import org.junit.Test;

public class GrafosTest {

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
