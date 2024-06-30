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
		
		int[] coloreoNodos = new int[m.length];
		Arrays.fill(coloreoNodos, -1);	// Inicializo el vector de coloreo con todos los valores en -1
		
		for(int iteradorNodos = 0; iteradorNodos < listaNodos.size(); iteradorNodos++) { // Itero sobre los nodos
			int nodoPintar = listaNodos.get(iteradorNodos);	// Selecciono un nodo de la lista ordenada aleatoriamente
			
			int color = 0;	// Colores que irán utilizando para colorear
			int ultimoNodoPintado = iteradorNodos -1;
			
			int iteradorNodoPintado = 0;
			while (iteradorNodoPintado <= ultimoNodoPintado) {	// Itero sobre los nodos pintados
				
				int nodoPintado = listaNodos.get(iteradorNodoPintado);
				
				if(m[nodoPintar][nodoPintado] != 0 && coloreoNodos[nodoPintado] == color) {	// Verifico si son compatibles
					color++;
					iteradorNodoPintado = -1;
				}
				
				iteradorNodoPintado++;
			}
			coloreoNodos[nodoPintar] = color;	// Pinto el nodo
		}
		
		return coloreoNodos;
	}
}
