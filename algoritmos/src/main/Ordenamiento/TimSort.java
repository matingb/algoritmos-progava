package main.Ordenamiento;

public class TimSort {
    private static final int RUN = 32;
    private void insertar(int[] lista, int izq, int der){
        for (int i = izq +1 ; i <= der; i++) {
            int temp = lista[i];
            int j = i-1;
            while(j >= izq && lista[j] > temp){
                lista[j+1] = lista[j];
                j--;
            }
            lista[j-1] = temp;
        }
    }
    private void merge(int[] lista, int izq, int medio, int der){
        int largo1 = medio - izq + 1;
        int largo2 = der - medio;
        int[] listaIzq = new int[largo1];
        int[] listaDer = new int[largo2];
        System.arraycopy(lista, izq,listaIzq, 0, largo1);
        System.arraycopy(lista, medio+1, listaDer, 0, largo2);

        int i = 0, j = 0, k = izq;

        while (i < largo1 && j < largo2) {
            if (listaIzq[i] <= listaDer[j]) {
                lista[k] = listaIzq[i];
                i++;
            } else {
                lista[k] = listaDer[j];
                j++;
            }
            k++;
        }

        while (i < largo1) {
            lista[k] = listaIzq[i];
            i++;
            k++;
        }

        while (j < largo2) {
            lista[k] = listaDer[j];
            j++;
            k++;
        }

    }
    public void ordenar (int [] lista){
        int cant = lista.length;
        for (int i = 0; i < cant ; i++) {
            insertar(lista, i, Math.min(i + RUN -1, (cant -1)));
        }
        for (int tam = RUN; tam < cant ; tam = 2 * tam) {
            for (int izq = 0; izq < cant ; izq+= 2 * tam) {
                int medio = izq + tam -1;
                int der = Math.min((izq + 2*tam -1), (cant-1));
                if(medio <der){
                    merge(lista, izq, medio, der);
                }

            }

        }
    }

}
