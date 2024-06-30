package main.Grafos;

import java.util.ArrayList;
import java.util.Objects;

public class Arista implements Comparable<Arista>{
	
	public int inicio, fin, costo;

	public Arista(int inicio, int fin, int costo) {
		this.inicio = inicio;
		this.fin = fin;
		this.costo = costo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Arista arista = (Arista) o;
		return inicio == arista.inicio && fin == arista.fin && costo == arista.costo;
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
