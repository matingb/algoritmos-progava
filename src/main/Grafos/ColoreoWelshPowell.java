package main.Grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColoreoWelshPowell {

	public static int[] colorear(int[][] m) {
		
		ArrayList<Integer> listaNodosOrdenDescendente = ordenoPorGradoDescendente(m); // Llama al metodo que ordena los nodos segun su grado de forma descendente
		
		return ColoreoSecuencial.colorear(m, listaNodosOrdenDescendente); // Utiliza la funcion de coloreo con el ordenamiento obtenido
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
			for (int nodoActual : listaGradoActual)
				nodosOrdenadosPorGrado.add(nodoActual); // Agregar nodos a la lista con el orden final
		}
		
		return nodosOrdenadosPorGrado;
	}
	
}
