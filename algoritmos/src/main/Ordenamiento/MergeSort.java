package main.Ordenamiento;

import java.util.ArrayList;

public class MergeSort {

    private void merge(int [] lista, int[] izq, int[] der){
        int iIzq=0, jDer=0, kMerge=0;
        while(iIzq< izq.length && jDer < der.length){
            if(izq[iIzq] <= der[jDer]){
                lista[kMerge++] = izq[iIzq++];
            }else {
                lista[kMerge++] = der[jDer++];
            }
        }
        while(iIzq < izq.length){
            lista[kMerge++] = izq[iIzq++];
        }
        while(jDer <der.length){
            lista[kMerge++] = der[jDer++];
        }
    }
    public void ordenar (int [] lista){

        if(lista.length <=1){
            return; //La lista de un elemento esta ordenada por definicion
        }
        int mitad = lista.length /2;
        int [] izq = new int[mitad];
        int [] der = new int[lista.length - mitad];
        System.arraycopy(lista, 0, izq, 0, mitad);
        System.arraycopy(lista, mitad, der, 0, lista.length - mitad);

        ordenar(izq);
        ordenar(der);

        merge(lista, izq, der);
    }
}
