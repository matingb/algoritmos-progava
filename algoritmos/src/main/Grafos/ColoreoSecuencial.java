package main.Grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColoreoSecuencial {

	public static int[] colorear(int[][] m) {

		ArrayList<Integer> listaNodos = new ArrayList<Integer>(m.length);
		
		// Lista de nodos que voy a analizar
		for(int n = 0; n < m.length; n++) {
			listaNodos.add(n, n);
		}
		
		Collections.shuffle(listaNodos); // Ordenar aleatoriamente los nodos que voy a analizar
		
		int[] coloreoNodos = new int[m.length];
		Arrays.fill(coloreoNodos, -1);	// Inicializo el vector de coloreo con todos los valores en -1

		int a = 0; // Iterar sobre la lista aleatoria
		for (int color = 0; color < m.length; color++) { // Itero sobre los colores

			int nodoAnalizar = listaNodos.get(a);

			if (coloreoNodos[nodoAnalizar] == -1 ) {	// Consulto si el nodo ya tiene un color asignado

				// En caso de que no tenga color asignado
				ArrayList<Integer> nodosCompatibles = new ArrayList<>();
				nodosCompatibles.add(nodoAnalizar);

				for(int j=0; j < m.length; j++) {	// Agrego a todos los nodos que son compatibles con el nodo que estoy analizando
					if (m[nodoAnalizar][j] == 0 && !nodosCompatibles.contains(j)) {
						nodosCompatibles.add(j);
					}
				}

				ArrayList<Integer> copiaNodosCompatibles = new ArrayList<>(nodosCompatibles);

				// Eliminar los nodos que no son compatibles
				for (int nodo : nodosCompatibles) {
					if (copiaNodosCompatibles.contains(nodo)) {
						for (int nodoComparar : nodosCompatibles){
							if (m[nodo][nodoComparar] != 0) {
								copiaNodosCompatibles.remove(nodoComparar);
							}
						}
					}
				}

				// Coloreo de un color todos los nodos que son compatibles
				for (int nodo : copiaNodosCompatibles) {
					coloreoNodos[nodo] = color;
				}

			}
		}

		return coloreoNodos;
	}
}
