package main.Grafos;

import java.util.ArrayList;

public abstract class ColoreoOrdenDeterminado {
	
	// Metodo sobre escrito por Welsh Powell y Matula
	public static int[] colorear(int[][] m) {
		return null;
	};
	
	// Metodo para calcular el grado de los nodos
	protected static ArrayList <Integer> calcularGradoNodos (int[][] matrizAdyacencias){
		
		ArrayList <Integer> listaGradosNodos = new ArrayList <Integer> (matrizAdyacencias.length);
		
		for(int i = 0; i < matrizAdyacencias.length; i++) {
			int grado = 0;
			for(int j = 0; j < matrizAdyacencias.length; j++) {
				if(matrizAdyacencias[i][j] == 1 && i != j)
					grado++;
			}
			listaGradosNodos.add(grado);
		}
		
		return listaGradosNodos;
	}
	
	// Metodo para dar la lista de nodos con el orden final
	protected static ArrayList <Integer> obtenerListadoFinalNodos (ArrayList<ArrayList<Integer>> listaDeListasPorGrado, int tamañoMatrizAdy){
		
		ArrayList <Integer> nodosOrdenadosPorGrado = new ArrayList <> (tamañoMatrizAdy); // Lista con el orden final
		
		for (ArrayList <Integer> listaGradoActual : listaDeListasPorGrado) {
			for (int nodoActual : listaGradoActual)
				nodosOrdenadosPorGrado.add(nodoActual); // Agregar nodos a la lista con el orden final
		}
		
		return nodosOrdenadosPorGrado;
	}
	
}