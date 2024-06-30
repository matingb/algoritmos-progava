package main.Ordenamiento;

import java.util.Arrays;

public class ShellSort {
    public void ordenar(char[] lista) {

        int n = lista.length;
        int h = 1;
        int aux = 1;

        while (aux < n) {
            h = aux;
            aux = h * 3 + 1;
        }

        while (h >= 1) {
            // Realizar inserción por intervalo
            for (int i = h; i < n; i++) {
                char temp = lista[i];
                int j;
                for (j = i; j >= h && lista[j - h] > temp; j -= h) {
                    lista[j] = lista[j - h];
                }
                lista[j] = temp;
            }

            h = (h-1) / 3;
        }
    }
}
