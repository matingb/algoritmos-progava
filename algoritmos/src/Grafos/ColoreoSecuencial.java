package Grafos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

import Grafos.Infinito;

public class ColoreoSecuencial {

	public static int[] colorear(int[][] m) {

		ArrayList<Integer> listaNodos = new ArrayList<Integer>(m.length);
		
		// Lista de nodos que voy a analizar
		for(int n = 0; n < m.length; n++) {
			listaNodos.add(n, null);
		}
		
		Collections.shuffle(listaNodos); // Ordenar aleatoriamente los nodos que voy a analizar
		
		int[] coloreoNodos = new int[m.length];
		
		int a = 0; // Iterar sobre la lista aleatoria
		for (int color = 0; color < m.length; color++) { // Itero sobre los colores
			HashSet<Integer> nodosNoConectados = new ArrayList<Integer>();
			for (int i = 0; i < m.length; i++) {
				for(int j=0; j < m.length; j++) {
					if (m[i][j] == Grafos.Infinito.INFINITO && !nodosNoConectados.contains(j) && !nodosNoConectados.contains(i)) {
						nodosNoConectados.add(i);
						nodosNoConectados.add(j);
					}
				}
			}
		}

		return null;
	}
}
