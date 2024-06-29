package main.Grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColoreoWelshPowell {

	public static int[] colorear(int[][] m) {
		
		ArrayList<Integer> listaNodos = ordenoPorGradoDescendente(m);
		
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
	
	private static ArrayList<Integer> ordenoPorGradoDescendente (int[][] m){
		
		ArrayList <Integer> listaGradosNodos = new ArrayList <Integer> (m.length);
		
		// Calculo el grado de cada nodo
		for(int i = 0; i < m.length; i++) {
			int grado = 0;
			for(int j = 0; j < m.length; j++) {
				if(m[i][j] == 1 && i != j)
					grado++;
			}
			listaGradosNodos.add(grado);
		}
		
		// Lista que a su vez contendra 1 lista para cada grado
		ArrayList<ArrayList<Integer>> listaDeListasPorGrado = new ArrayList<>();
		
		// Asignar a cada lista los nodos correspondientes
		int maximo = Collections.max(listaGradosNodos);
		for (int gradoNodo : listaGradosNodos) {
			if (listaGradosNodos.contains(maximo)) {
				ArrayList<Integer> listaGradoMaxActual = new ArrayList <>(); // Lista que contra los nodos con el mismo grado
				for (int gradoActual = 0; gradoActual < listaGradosNodos.size(); gradoActual++) {
					if (listaGradosNodos.get(gradoActual) == maximo) {
						listaGradoMaxActual.add(gradoActual); // Agrego a la lista el nodo que tiene el grado maximo
					}
				}
				listaDeListasPorGrado.add(listaGradoMaxActual); // Agrego la nueva lista a la lista que contiene a todas las listas
			}
			maximo--; // Reduzco el grado maximo
		}
		
		ArrayList <Integer> nodosOrdenadosPorGrado = new ArrayList <> (m.length); // lista con el orden final
		
		for (ArrayList <Integer> listaGradoActual : listaDeListasPorGrado) {
			Collections.shuffle(listaGradoActual); // Mezcla aleatoria entre los nodos que pertenecen a la misma lista segun su grado
			for (int nodoActual : listaGradoActual)
				nodosOrdenadosPorGrado.add(nodoActual); // Agregar nodos a la lista con el orden final
		}
		
		return nodosOrdenadosPorGrado;
	}
	
}
