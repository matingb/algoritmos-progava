package main.Grafos;

import java.util.Arrays;

public class Dijkstra {

	public static int[] dijkstra(int[][] matrizDeAdyacencia, int nodoInicial) {
		
		int cantNodos= matrizDeAdyacencia.length;
		int[] costos= new int[cantNodos];
		boolean[] visitados = new boolean[cantNodos];
		
		Arrays.fill(costos, Infinito.INFINITO);
        costos[nodoInicial] = 0;
        
  
		for (int i = 1; i < cantNodos; i++) {
			
            int w= -1;
            int costoMin = Infinito.INFINITO;
            
            // Busco al nodo w con menor costo y sin haber sido visitado
            for (int nodo = 0; nodo < cantNodos; nodo++) {
                if (!visitados[nodo] && costos[nodo] < costoMin) {
                    w = nodo;
                    costoMin = costos[nodo];
                }
            }

            visitados[w] = true;

            // Actualizo la distancia de los nodos adyacentes a w
            for (int nodoAdy = 0; nodoAdy < cantNodos; nodoAdy++) {
                int costoIndirecto= matrizDeAdyacencia[w][nodoAdy];
                
                if (!visitados[nodoAdy] && ((costoMin + costoIndirecto) < costos[nodoAdy])) {
                    costos[nodoAdy] = costoMin + costoIndirecto;
                }
            }
        }	
		
		return costos;
	}
}
