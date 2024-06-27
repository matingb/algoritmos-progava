package Grafos;

import java.lang.reflect.Type;
import java.util.Stack;
import java.util.function.Consumer;

public class DFS {
    public static void calcular(int[][] matrizDeAdyacencia, int nodoInicial, Consumer<String> callback) {
        int cantidadDeNodos = matrizDeAdyacencia.length;
        boolean[] nodosVisitados = new boolean[cantidadDeNodos];
        Stack<Integer> pila = new Stack<>();

        pila.push(nodoInicial);

        while (!pila.isEmpty()) {
            Integer nodoActual = pila.pop();

            if (!nodosVisitados[nodoActual]) {
                nodosVisitados[nodoActual] = true;
                callback.accept(nodoActual.toString());

                for (int i = 0; i < cantidadDeNodos; i++) {
                    if (matrizDeAdyacencia[nodoActual][i] == 1 && !nodosVisitados[i]) {
                        pila.push(i);
                    }
                }
            }
        }
    }
}
