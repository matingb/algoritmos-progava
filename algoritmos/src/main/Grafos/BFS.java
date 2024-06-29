package main.Grafos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {

	public static int[] bfs(int[][] matrizDeAdyacencia, int nodoInicial) {

		int cantNodos = matrizDeAdyacencia.length;
		Queue<Integer> cola = new LinkedList<Integer>();
		boolean[] visitados = new boolean[cantNodos];
		int[] distancias = new int[cantNodos];
		Arrays.fill(distancias, Infinito.INFINITO);
		
		visitados[nodoInicial] = true;
		distancias[nodoInicial] = 0;

		cola.add(nodoInicial);

		while (!cola.isEmpty()) {
			Integer nodoActual = cola.poll();

			for(int i=0; i < cantNodos; i++)
			{
				if(matrizDeAdyacencia[nodoActual][i] == 1 && !visitados[i])
				{
					cola.add(i);
					visitados[i]= true;
					distancias[i]= distancias[nodoActual] + 1;
				}
			}
		}

		return distancias;
	}
}
