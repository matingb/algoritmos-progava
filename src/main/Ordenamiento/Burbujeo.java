package main.Ordenamiento;

public class Burbujeo <T extends Comparable<T>>{

    public void ordenar(T[] vector){
        int cantidadDeElementos = vector.length;

        for(int i = 0; i < cantidadDeElementos-1; i++){
            for(int j = i+1; j < cantidadDeElementos; j++){
                if(vector[i].compareTo(vector[j]) > 0){
                    T aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }
}
