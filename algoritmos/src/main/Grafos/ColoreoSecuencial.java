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
		
		Collections.shuffle(listaNodos); // Mezclo los nodos aleatoriament
		
		for(int iteradorNodos = 0; iteradorNodos < listaNodos.size(); iteradorNodos++) {
			int nodoPintar = listaNodos.get(iteradorNodos);
			
			int color = 0;
			int ultimoNodoPintado = iteradorNodos -1;
			
			int iteradorNodoPintado = 0;
			while (iteradorNodoPintado <= ultimoNodoPintado) {
				
				int nodoPintado = listaNodos.get(iteradorNodoPintado);
				
				if(m[nodoPintar][nodoPintado] != 0 && coloreoNodos[nodoPintado] == color) {
					color++;
					iteradorNodoPintado = -1;
				}
				
				iteradorNodoPintado++;
			}
			coloreoNodos[nodoPintar] = color;
		}
		
		return coloreoNodos;
	}
}
