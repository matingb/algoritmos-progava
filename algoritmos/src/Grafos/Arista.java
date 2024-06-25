package Grafos;

import java.util.ArrayList;

public class Arista implements Comparable<Arista>{
	
	public int inicio, fin, costo;

	public Arista(int inicio, int fin, int costo) {
		this.inicio = inicio;
		this.fin = fin;
		this.costo = costo;
	}

	public static int sumarCostos(ArrayList<Arista> aristas) {
		int suma = 0;
		for (Arista arista : aristas) {
			suma += arista.costo;
		}
		return suma;
	}

	@Override
	public int compareTo(Arista a) {
		return Integer.compare(this.costo, a.costo);
	}

	@Override
	public String toString() {
		return new String("(" + inicio + "," + fin + "," + costo +")");

	}
}
