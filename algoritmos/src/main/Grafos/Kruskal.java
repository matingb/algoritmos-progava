package main.Grafos;
import java.util.Collections;
import java.util.List;

public class Kruskal {
    // encuentro el conjunto de un elemento i
    private int encontrar(int[] padre, int i) {
        if (padre[i] != i)
            padre[i] = encontrar(padre, padre[i]);
        return padre[i];
    }

    // uno los dos conjuntos
    private void unir(int[] padre, int[] rango, int x, int y) {
        int raizX = encontrar(padre, x);
        int raizY = encontrar(padre, y);

        if (rango[raizX] < rango[raizY])
            padre[raizX] = raizY;
        else if (rango[raizX] > rango[raizY])
            padre[raizY] = raizX;
        else {
            padre[raizY] = raizX;
            rango[raizX]++;
        }
    }

    public Grafo obtenerArbolDeCostoMinimo(Grafo grafo) {
        Grafo mstGrafo = new Grafo();

        List<Arista> aristas = grafo.getAristas();
        Collections.sort(aristas);

        int[] padre = new int[aristas.size()];
        int[] rango = new int[aristas.size()];

        // Inicializo cada conjunto como un solo elemento
        for (int i = 0; i < aristas.size(); i++) {
            padre[i] = i;
            rango[i] = 0;
        }

        // Recorro las aristas ordenadas
        for (Arista arista : aristas) {
            int raizInicio = encontrar(padre, arista.inicio);
            int raizFin = encontrar(padre, arista.fin);

            // Si no forma un ciclo, lo agrego al MST
            if (raizInicio != raizFin) {
                mstGrafo.agregarArista(arista); // Agrego la arista al nuevo grafo MST
                unir(padre, rango, raizInicio, raizFin);
            }
        }
        return mstGrafo;
    }
}
