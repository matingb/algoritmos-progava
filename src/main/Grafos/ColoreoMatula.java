package main.Grafos;

import java.util.ArrayList;
import java.util.Collections;

public class ColoreoMatula extends ColoreoOrdenDeterminado{
	
	public static int[] colorear(int[][] m) {
		
		ArrayList<Integer> listaNodosOrdenAscendente = ordenoPorGradoAscendente(m); // Llama al metodo que ordena los nodos segun su grado de forma ascendente
		
		return ColoreoSecuencial.colorear(m, listaNodosOrdenAscendente); // Utiliza la funcion de coloreo con el ordenamiento obtenido
	}
	
	private static ArrayList<Integer> ordenoPorGradoAscendente (int[][] m){
		
		ArrayList <Integer> listaGradosNodos = calcularGradoNodos(m);
		
		// Lista que a su vez contendra 1 lista para cada grado
		ArrayList<ArrayList<Integer>> listaDeListasPorGrado = new ArrayList<>();
		
		// Asignar a cada lista los nodos correspondientes
		int minimo = Collections.min(listaGradosNodos);
		for (int gradoNodo : listaGradosNodos) {
			if (listaGradosNodos.contains(minimo)) {
				ArrayList<Integer> listaGradoMaxActual = new ArrayList <>(); // Lista que contra los nodos con el mismo grado
				for (int gradoActual = 0; gradoActual < listaGradosNodos.size(); gradoActual++) {
					if (listaGradosNodos.get(gradoActual) == minimo) {
						listaGradoMaxActual.add(gradoActual); // Agrego a la lista el nodo que tiene el grado minimo
					}
				}
				listaDeListasPorGrado.add(listaGradoMaxActual); // Agrego la nueva lista a la lista que contiene a todas las listas
			}
			minimo++; // Reduzco el grado maximo
		}
		
		return obtenerListadoFinalNodos(listaDeListasPorGrado, m.length);
	}

}
