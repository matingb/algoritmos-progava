package Grafos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {

	public static int calcularCostoMinimo(int[][] m) {
		PriorityQueue<Arista> colaPrioridad = new PriorityQueue<>();

		int costoMin = 0;

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

			costoMin += aristaMinima.costo;
			nodoAnalizado = nuevoNodo;

			conjuntoInicial.remove(conjuntoInicial.indexOf(nuevoNodo));
		}

		return costoMin;
	}
}
/*
	public static Grafo getArbolAbarcador(Grafo g) {

		Grafo abarcador = new MatrizGrafo(g.getNodos());
		ArrayList<Integer> solucion = new ArrayList<Integer>(g.getNodos());
		ArrayList<Integer> v = new ArrayList<Integer>(solucion.size());

		for (int i = 0; i < g.getNodos(); i++) {
			v.add(i + 1);
		}

		solucion.add(v.get(0));
		v.removeAll(solucion);

		while (solucion.size() < g.getNodos() && !v.isEmpty()) { // trabajar con un vector visitados y no visitados.

			int menorPeso = Grafo.INFINITO;
			Integer nodoAAgregar = 0;
			Integer nodoSaliente = 0;

			for (Integer saliente : solucion) {
				for (Integer entrante : v) {
					if (g.getVinculo(entrante, saliente) < menorPeso) {
						menorPeso = g.getVinculo(entrante, saliente);
						nodoAAgregar = entrante;
						nodoSaliente = saliente;
					}
				}
			}

			abarcador.setVinculo(nodoSaliente, nodoAAgregar, menorPeso);
			solucion.add(nodoAAgregar);
			v.remove(nodoAAgregar);
		}

		return abarcador;
	}
}
*/
