package main.Grafos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {

	public static int[] bfs(int[][] matrizDeAdyacencia, int nodoInicial) {

		int cantNodos = matrizDeAdyacencia.length;
		Queue<Integer> cola = new LinkedList<Integer>();
		int[] distancias = new int[cantNodos];
		Arrays.fill(distancias, Infinito.INFINITO);
		
		distancias[nodoInicial] = 0;
		cola.add(nodoInicial);

		while (!cola.isEmpty()) {
			Integer nodoActual = cola.poll();

			for(int i=0; i < cantNodos; i++)
			{
				if(matrizDeAdyacencia[nodoActual][i] == 1 && distancias[i] == Infinito.INFINITO)
				{
					cola.add(i);
					distancias[i]= distancias[nodoActual] + 1;
				}
			}
		}

		return distancias;
	}
}
