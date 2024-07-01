package test;

import main.Grafos.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class GrafosTest {

    @Test
    public void Dijkstra() {
    	
    	int[][] grafo_ponderado= {{Infinito.INFINITO, 10, Infinito.INFINITO, 30, 100},
                {Infinito.INFINITO, Infinito.INFINITO, 50, Infinito.INFINITO, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, 10},
                {Infinito.INFINITO, Infinito.INFINITO, 20, Infinito.INFINITO, 60},
                {Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO}};
                
    	ResultadoDijkstra resultado= Dijkstra.dijkstra(grafo_ponderado, 0);
    	
    	List<Integer> caminoReconstruidoEsperado = List.of(0, 3, 2, 4);
    	
    	Assert.assertArrayEquals(new int[]{0, 10, 50, 30, 60}, resultado.getCostos());
    	Assert.assertArrayEquals(new int[]{0, 0, 3, 0, 2}, resultado.getCaminos());
    	Assert.assertEquals(caminoReconstruidoEsperado, resultado.reconstruirCamino(4));
    	
    }
	
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

        Assert.assertEquals(aristasEsperadas, arbolCostoMinimo.getAristas());
        Assert.assertEquals(8, arbolCostoMinimo.getCostoTotal());
    }

    @Test
    public void Floyd() {

        int[][] grafo_ponderado = {{Infinito.INFINITO, 3, 5, Infinito.INFINITO},
                {Infinito.INFINITO, Infinito.INFINITO, 1, 4},
                {9, 5, Infinito.INFINITO, Infinito.INFINITO},
                {3, Infinito.INFINITO, Infinito.INFINITO, Infinito.INFINITO}};


        int[][] salidaMatrizFloyd = Floyd.floyd(grafo_ponderado);
        int[][] esperadaMatrizFloyd = {
                {0, 3, 4, 7},
                {7, 0, 1, 4},
                {9, 5, 0, 9},
                {3, 6, 7, 0}};

        Assert.assertEquals(esperadaMatrizFloyd, salidaMatrizFloyd);
    }

    @Test
    public void Warshall() {

        boolean[][] grafoBooleano = {
                {false, true ,true},
                {true, false, false},
                {false, true, false}};


        boolean[][] salidaMatrizFloyd = Warshall.warshall(grafoBooleano);
        boolean[][] esperadaMatrizFloyd = {
                {false, true ,true},
                {true, false, true},
                {true, true, false}};

        Assert.assertEquals(esperadaMatrizFloyd, salidaMatrizFloyd);
    }

    @Test
    public void DFS() {

        int[][] grafo_para_dfs = {
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0}};
        List<String> esperados = new java.util.ArrayList<>(List.of("2", "3", "1", "0"));

        DFS.calcular(grafo_para_dfs, 2, nodo -> {
            Assert.assertEquals(nodo, esperados.get(0));
            esperados.remove(0);
        });
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

        Assert.assertArrayEquals(new int[]{0, 1, 2, 2, 1, 3, Infinito.INFINITO }, d);
    }

    @Test
    public void ColoreoSecuencial() {

        int[][] grafo_para_colorear = { 
        		{0, 1, 1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0, 1, 0},
                {1, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        
        ArrayList <Integer> listaOrdenNodos = new ArrayList <Integer> (grafo_para_colorear.length);
        listaOrdenNodos.add(0);
        listaOrdenNodos.add(1);
        listaOrdenNodos.add(2);
        listaOrdenNodos.add(3);
        listaOrdenNodos.add(4);
        listaOrdenNodos.add(5);
        listaOrdenNodos.add(6);
        
        int[] salida = ColoreoSecuencial.colorear(grafo_para_colorear, listaOrdenNodos);

        Assert.assertArrayEquals(new int[] {0, 1, 2, 0, 1, 2, 0}, salida);
    }
    
    @Test
    public void ColoreoWelshPowell() {

        int[][] grafo_para_colorear = { 
        		{0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0}
        };
        
        int[] salida = ColoreoWelshPowell.colorear(grafo_para_colorear);

        Assert.assertArrayEquals(new int[] {1, 0, 1, 0, 2, 1, 0}, salida);
    }
    
    @Test
    public void ColoreoMatula() {

        int[][] grafo_para_colorear = { 
        		{0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0}
        };
        
        int[] salida = ColoreoMatula.colorear(grafo_para_colorear);

        Assert.assertArrayEquals(new int[] {0, 1, 0, 1, 0, 2, 0}, salida);
    }

    @Test
    public void KruskalTest() {
        Grafo grafo = new Grafo();
        grafo.agregarArista(new Arista(0, 1, 10));
        grafo.agregarArista(new Arista(0, 2, 6));
        grafo.agregarArista(new Arista(0, 3, 5));
        grafo.agregarArista(new Arista(1, 3, 15));
        grafo.agregarArista(new Arista(2, 3, 4));


        Kruskal kruskal = new Kruskal();
        Grafo mstGrafo = kruskal.obtenerArbolDeCostoMinimo(grafo);

        Grafo grafoEsperado = new Grafo();
        grafoEsperado.agregarArista(new Arista(2, 3, 4));
        grafoEsperado.agregarArista(new Arista(0, 3, 5));
        grafoEsperado.agregarArista(new Arista(0, 1, 10));

        assertTrue(sonGrafosIguales(mstGrafo, grafoEsperado));

    }

    private boolean sonGrafosIguales(Grafo grafo1, Grafo grafo2) {
        if (grafo1.getAristas().size() != grafo2.getAristas().size()) {
            return false;
        }
        for (Arista arista : grafo1.getAristas()) {
            if (!grafo2.getAristas().contains(arista)) {
                return false;
            }
        }
        return true;
    }
}

