package Grafos;

public class Arista implements Comparable<Arista>{
	
	public int inicio, fin, costo;

	public Arista(int inicio, int fin, int costo) {
		this.inicio = inicio;
		this.fin = fin;
		this.costo = costo;
	}

	@Override
	public int compareTo(Arista a) {
		return Integer.compare(this.costo, a.costo);
	}

	@Override
	public String toString() {
		return new String(inicio + "-" + fin + "  " + costo);
	}
}
