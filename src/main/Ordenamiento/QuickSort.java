package main.Ordenamiento;

public class QuickSort {
    public void ordenar(int[] vector, int inicio, int fin) {
        int pivote = vector[inicio];

        int i = inicio;
        int j = fin;
        int aux;

        while(i<j)
        {
            while (vector[i] <= pivote && i < j)
                i++;

            while (vector[j] > pivote)
                j--;

            if (i<j)
            {
                aux = vector[i];
                vector[i]= vector[j];
                vector[j]=aux;
            }
        }

        vector[inicio] = vector[j];
        vector[j] = pivote;

        if (inicio < j-1)
            ordenar(vector,inicio,j-1);

        if (j+1 < fin)
            ordenar(vector,j+1,fin);
    }
}
