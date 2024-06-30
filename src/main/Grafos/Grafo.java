package main.Grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private final List<Arista> aristas = new ArrayList<>();

    public List<Arista> getAristas() {
        return aristas;
    }

    public void agregarArista(Arista arista) {
        aristas.add(arista);
    }

     public int getCostoTotal() {
        int suma = 0;
        for (Arista arista : aristas) {
            suma += arista.costo;
        }
        return suma;
    }
}
