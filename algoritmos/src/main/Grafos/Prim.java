package main.Grafos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {

	public static Grafo calcularArbolMinimo(int[][] m) {
		Grafo arbolDeCostoMinimo = new Grafo();
		PriorityQueue<Arista> colaPrioridad = new PriorityQueue<>();

		ArrayList<Integer> conjuntoSolucion = new ArrayList<Integer>(m.length);
		ArrayList<Integer> conjuntoInicial = new ArrayList<Integer>(m.length);

		for (int i = 0; i < m.length; i++) {
			conjuntoInicial.add(i + 1);
		}

		int nodoAnalizado = conjuntoInicial.get(0);
		conjuntoSolucion.add(conjuntoInicial.get(0)); // agrego el primer elemento al conjunto solucion

		conjuntoInicial.removeAll(conjuntoSolucion);

		int nuevoNodo;
		while (!conjuntoInicial.isEmpty()) {
			//agrego a la cola todas las aristas relacionadas al nodo analizado
			for (int j = 0; j < m.length; j++) {
				colaPrioridad.add(new Arista(nodoAnalizado, j+1, m[nodoAnalizado-1][j]));
			}

			Arista aristaMinima = colaPrioridad.poll();

			while (conjuntoSolucion.contains(aristaMinima.fin) && conjuntoSolucion.contains(aristaMinima.inicio)) {
				aristaMinima = colaPrioridad.poll();
			}

			if (conjuntoSolucion.contains(aristaMinima.fin)) {
				nuevoNodo = aristaMinima.inicio;
				conjuntoSolucion.add(aristaMinima.inicio);

			} else {
				nuevoNodo = aristaMinima.fin;
				conjuntoSolucion.add(aristaMinima.fin);
			}

			arbolDeCostoMinimo.agregarArista(aristaMinima);

			nodoAnalizado = nuevoNodo;

			conjuntoInicial.remove(conjuntoInicial.indexOf(nuevoNodo));
		}


		return arbolDeCostoMinimo;
	}
}