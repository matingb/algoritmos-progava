package main.Grafos;

import java.util.Arrays;

public class Dijkstra {

	public static ResultadoDijkstra dijkstra(int[][] matrizDeAdyacencia, int nodoInicial) {
		
		int cantNodos= matrizDeAdyacencia.length;
		int[] costos= new int[cantNodos];
		boolean[] visitados = new boolean[cantNodos];
		int[] caminos= new int[cantNodos];
		
		Arrays.fill(caminos, nodoInicial);
		
        for (int i= 0; i < cantNodos; i++) {
        	costos[i]= matrizDeAdyacencia[nodoInicial][i];
        }
        
        costos[nodoInicial] = 0;
        visitados[nodoInicial]= true;
        
        
		for (int i = 1; i < cantNodos; i++) {
			
            int w= -1;
            int costoMin = Infinito.INFINITO;
            
            // Busco al nodo w con menor costo y que no sea parte de la solucion
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
                
                if (!visitados[nodoAdy] && costoIndirecto != Infinito.INFINITO && ((costoMin + costoIndirecto) < costos[nodoAdy])) {
                    costos[nodoAdy] = costoMin + costoIndirecto;
                    caminos[nodoAdy]= w;
                }
            }
        }	
		
		return new ResultadoDijkstra(costos, caminos);
	}
}
