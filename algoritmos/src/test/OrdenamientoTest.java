package test;

import main.Ordenamiento.Burbujeo;
import main.Ordenamiento.MergeSort;
import main.Ordenamiento.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class OrdenamientoTest {

    @Test
    public void burbujeo() {
        Integer[] vector = {5, 2, 9, 1, -5, 6, 8, 15, -4};

        Burbujeo burbujeo = new Burbujeo();
        burbujeo.ordenar(vector);

        Assert.assertArrayEquals(vector, new Integer[]{-5, -4, 1, 2, 5, 6, 8, 9, 15});
    }

    @Test
    public void quicksort() {
        int[] vector = {5, 2, 9, 1, -5, 6, 8, 15, -4};

        QuickSort quickSort = new QuickSort();
        quickSort.ordenar(vector, 0, vector.length - 1);

        Assert.assertArrayEquals(vector, new int[]{-5, -4, 1, 2, 5, 6, 8, 9, 15});
    }

    @Test
    public void mergeSort(){
        int [] lista = {38,23,54,99,10,8,34};
        MergeSort mergeSort = new MergeSort();
        mergeSort.ordenar(lista);
        Assert.assertArrayEquals(lista, new int[]{8, 10, 23, 34, 38, 54, 99});
    }
}
