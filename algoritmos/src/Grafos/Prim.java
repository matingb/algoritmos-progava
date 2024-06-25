package Grafos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {

	public static ArrayList<Arista> calcularArbolMinimo(int[][] m) {
		PriorityQueue<Arista> colaPrioridad = new PriorityQueue<>();

		ArrayList<Arista> conjuntoAristasSolucion = new ArrayList<Arista>(m.length);

		ArrayList<Integer> conjuntoSolucion = new ArrayList<Integer>(m.length);
		ArrayList<Integer> conjuntoInicial = new ArrayList<Integer>(m.length);

		for (int i = 0; i < m.length; i++) {
			conjuntoInicial.add(i + 1);

		}

		int nodoAnalizado = conjuntoInicial.getFirst();
		conjuntoSolucion.add(conjuntoInicial.getFirst()); // agrego el primer elemento al conjunto solucion

		conjuntoInicial.removeAll(conjuntoSolucion); // saco del conjunto inicial todo lo del conjunto solucion

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

			conjuntoAristasSolucion.add(aristaMinima);
			nodoAnalizado = nuevoNodo;

			conjuntoInicial.remove(conjuntoInicial.indexOf(nuevoNodo));
		}

		return conjuntoAristasSolucion;
	}
}