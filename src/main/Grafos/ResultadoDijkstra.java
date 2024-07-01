package main.Grafos;

import java.util.ArrayList;
import java.util.Stack;

public class ResultadoDijkstra {
	int costos[];
	int caminos[];
	
	public ResultadoDijkstra(int[] costos, int[] caminos) {
		this.costos = costos;
		this.caminos = caminos;
	}

	public int[] getCostos() {
		return costos;
	}

	public int[] getCaminos() {
		return caminos;
	}

	
	public ArrayList<Integer> reconstruirCamino(int nodoDestino) {
		Stack<Integer> pila = new Stack<>();
        int nodoActual = nodoDestino;

        while (nodoActual != this.caminos[nodoActual]) {
            pila.push(nodoActual);
            nodoActual = this.caminos[nodoActual];
        }

        pila.push(nodoActual);
        
        ArrayList<Integer> camino= new ArrayList<>();
    
        while (!pila.isEmpty()) {
            camino.add(pila.pop());
        }
        
        return camino;
	}
	
	
	
	
}
