package Ordenamiento;

public class ShellSort {
    public void ordenar() {
        //ALGORITMO DE SHELL
        char[] listaDesordenada = {'a', 's', 'o', 'r', 't', 'i', 'n', 'g', 'e', 'x', 'a', 'm', 'p', 'l', 'e'};

        int n = listaDesordenada.length;
        int h = 1;
        int aux = 1;

        while (aux < n) {
            h = aux;
            aux = h * 3 + 1;
        }

        while (h >= 1) {
            // Realizar inserción por intervalo
            for (int i = h; i < n; i++) {
                char temp = listaDesordenada[i];
                int j;
                for (j = i; j >= h && listaDesordenada[j - h] > temp; j -= h) {
                    listaDesordenada[j] = listaDesordenada[j - h];
                }
                listaDesordenada[j] = temp;
            }

            h = (h-1) / 3;
        }

        System.out.println(listaDesordenada);
    }
}
