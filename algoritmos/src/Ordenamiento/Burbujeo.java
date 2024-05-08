package Ordenamiento;

public class Burbujeo <T extends Comparable<T>>{

    public void sort(T[] array){
        int n = array.length;
        boolean huboCambios = false;

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(array[i].compareTo(array[j]) > 0){
                    T aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
